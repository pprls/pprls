package org.pprls.registry.domain;

import java.time.LocalDateTime;
import java.util.Set;

import org.pprls.core.EntityDescriptor;

/**
 * Builder to create domain objects
 * @author kapostolou
 *
 */

public enum Builder {
	INSTANCE;
	/**
	 * Create on outgoing. You can't have outgoing with out issuers.
	 * 
	 * @return Outgoing objects with issuers set
	 */
	public Outgoing createOutgoing(Set<EntityDescriptor> issuers, EntityDescriptor newHandler){
		Outgoing outgoing = new Outgoing();
		outgoing.addIssuers(issuers);
		RegistryStatus registryStatus = new RegistryStatus(newHandler);
		outgoing.setInitialStatus(registryStatus);
		outgoing.setCurrentStatus(registryStatus);
		return outgoing;
	}

	/**
	 * Create a Correspondent 
	 * 
	 * @return
	 */
	public Correspondent createCorrespondent(CorrespondentType type) {
		Correspondent correspondent = new Correspondent();
		correspondent.setCorrespondantType(type);
		return correspondent;
	}

	/**
	 * Create a EntityDescriptor 
	 * 
	 * @return
	 */
	public EntityDescriptor createEntityDescriptor() {
		EntityDescriptor entityDescriptor = new EntityDescriptor();
		return entityDescriptor;
	}
	
	/**
	 * Create a PostageInfo 
	 * 
	 * @param postageDate local date time
	 * @param postageMethod courier/email/fax etc
	 * @param voucherNumber a  string id ex RE29384923GR
	 * @return
	 */
	public PostageInfo createPostageInfo(LocalDateTime postageDate, PostageMethod postalMethod, String voucherNumber) {
		PostageInfo postageInfo = new PostageInfo();
		postageInfo.setPostageTime(postageDate);
		postageInfo.setPostageMethod(postalMethod);
		postageInfo.setVoucherNumber(voucherNumber);
		
		return postageInfo; 
	}

	/**
	 * Create on Incoming
	 * 
	 * @param sender
	 * @return
	 */
	public Incoming createIncoming(Correspondent sender) {
		Incoming incoming = new Incoming();
		incoming.getCorrespondents().add(sender);
		return incoming;
	}

}
