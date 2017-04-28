package org.pprls.registry.domain;

import java.util.List;

import org.pprls.registry.model.Nobody;

/**
 * Factory to create domain objbects
 * @author kapostolou
 *
 */

public enum Builder {
	INSTANCE;
	
	public Outgoing createOutgoing(List<EntityDescriptor> issuers){
		Outgoing outgoing = new Outgoing();
		outgoing.addIssuers(issuers);
		return outgoing;
	}

	public Correspondant createCorrespondant() {
		Correspondant correspondant = new Correspondant();
		return correspondant;
	}

	public EntityDescriptor createEntityDescriptor() {
		EntityDescriptor entityDescriptor = new EntityDescriptor();
		return entityDescriptor;
	}

}
