package org.pprls.document.domain;


import javax.persistence.PreRemove;
import javax.persistence.PreUpdate;

import org.pprls.core.EntityDescriptor;
import org.springframework.data.annotation.LastModifiedBy;

public class AuditingDocumentListener {

	@LastModifiedBy
    private EntityDescriptor handler;
	
    @PreUpdate
    @PreRemove
    private void beforeAnyOperation(Document document) { 
		DocumentHistory documentHistory = new DocumentHistory(document, handler);
    	System.out.println("I audited");
    }
}
