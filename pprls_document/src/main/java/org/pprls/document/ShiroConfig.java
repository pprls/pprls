package org.pprls.document;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.Filter;

import org.apache.shiro.realm.text.IniRealm;
import org.apache.shiro.spring.LifecycleBeanPostProcessor;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.filter.authc.AnonymousFilter;
import org.apache.shiro.web.filter.authc.FormAuthenticationFilter;
import org.apache.shiro.web.filter.authc.LogoutFilter;
import org.apache.shiro.web.filter.authc.UserFilter;
import org.apache.shiro.web.filter.authz.RolesAuthorizationFilter;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.web.filter.CharacterEncodingFilter;

@Configuration
public class ShiroConfig {
	
	@Bean(name = "characterEncodingFilter")
	public FilterRegistrationBean characterEncodingFilter() {
		FilterRegistrationBean bean = new FilterRegistrationBean();
		bean.addInitParameter("encoding", "UTF-8");
		bean.addInitParameter("forceEncoding", "true");
		bean.setFilter(new CharacterEncodingFilter());
		bean.addUrlPatterns("/*");
		return bean;
   }

	@Bean(name = "shiroFilter")
	public ShiroFilterFactoryBean shiroFilter() {
	    ShiroFilterFactoryBean shiroFilter = new ShiroFilterFactoryBean();
	    shiroFilter.setLoginUrl("/login");
	    shiroFilter.setSuccessUrl("/index");
	    shiroFilter.setUnauthorizedUrl("/forbidden");
	    Map<String, String> filterChainDefinitionMapping = new HashMap<String, String>();
	    filterChainDefinitionMapping.put("/", "anon");
	    filterChainDefinitionMapping.put("/login", "authc");
	    filterChainDefinitionMapping.put("/admin", "authc,roles[admin]");
	    shiroFilter.setFilterChainDefinitionMap(filterChainDefinitionMapping);
	    shiroFilter.setSecurityManager(securityManager());
	    Map<String, Filter> filters = new HashMap<String, Filter>();
	    filters.put("anon", new AnonymousFilter());
	    filters.put("authc", new FormAuthenticationFilter());
	    filters.put("logout", new LogoutFilter());
	    filters.put("roles", new RolesAuthorizationFilter());
	    filters.put("user", new UserFilter());
	    shiroFilter.setFilters(filters);
	    System.out.println(shiroFilter.getFilters().size());
	    return shiroFilter;
	}
	
	@Bean(name = "securityManager")
	public DefaultWebSecurityManager securityManager() {
		return new DefaultWebSecurityManager();
	}
	
	@Bean
	public LifecycleBeanPostProcessor lifecycleBeanPostProcessor() {
		return new LifecycleBeanPostProcessor();
	}
	
	@Bean(name = "realm")
	@DependsOn("lifecycleBeanPostProcessor")
	public IniRealm realm() {
	    IniRealm iniRealm = new IniRealm();
	    iniRealm.setResourcePath("classpath:shiro.ini");
	    iniRealm.init();
	    return iniRealm;
	}
	
	@Bean
	@DependsOn("lifecycleBeanPostProcessor")
	public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {
	    DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();
	    daap.setProxyTargetClass(true);
	    return daap;
	}

	@Bean
	public AuthorizationAttributeSourceAdvisor getAuthorizationAttributeSourceAdvisor(DefaultWebSecurityManager securityManager) {
	    AuthorizationAttributeSourceAdvisor aasa = new AuthorizationAttributeSourceAdvisor();
	    aasa.setSecurityManager(securityManager);
	    return aasa;
	}

}
