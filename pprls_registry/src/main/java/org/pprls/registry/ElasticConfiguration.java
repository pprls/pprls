package org.pprls.registry;

/**
 * Created by npetalidis on 19/5/2017.
 */


import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.pprls.registry.mappers.DefaultEntityMapper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.core.ElasticsearchTemplate;

import java.net.InetAddress;
import java.net.UnknownHostException;


@Configuration
public class ElasticConfiguration {
//    @Value("${spring.data.elasticsearch.cluster-node}")
//    private String clusterName;
    @Value("${spring.data.elasticsearch.cluster-nodes}")
    private String clusterNodes;

    @Bean
    public ElasticsearchTemplate elasticsearchTemplate() throws UnknownHostException {
        String server = clusterNodes.split(":")[0];
        Integer port = Integer.parseInt(clusterNodes.split(":")[1]);
//        Settings settings = Settings.settingsBuilder()
//                .put("cluster.name", clusterName).build();
        TransportClient client = TransportClient.builder().build()
                .addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(server), port));
        return new ElasticsearchTemplate(client, new DefaultEntityMapper());

    }

    @Bean
    public DefaultEntityMapper defaultEntityMapper() {
        return new DefaultEntityMapper();
    }
}

