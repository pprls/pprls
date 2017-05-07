package org.pprls.document.domain;

import java.util.UUID;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.pprls.core.EntityDescriptor;

@Entity
public class DocumentHistory {
	@Id
	@GeneratedValue(generator = "system-uuid2")
	@GenericGenerator(name = "system-uuid2", strategy = "uuid2")
	private UUID id;

	private UUID documentId;

	@Embedded
	private DocumentStatus status;

	@Embedded
	private EntityDescriptor handler;

	protected DocumentHistory() {

	}

	public DocumentHistory(Document document, EntityDescriptor newHandler) {
		documentId = document.id;
		status = document.currentStatus;
		handler = newHandler;
	}

	public UUID getDocumentId() {
		return documentId;
	}

	public void setDocumentId(UUID documentId) {
		this.documentId = documentId;
	}

	public DocumentStatus getStatus() {
		return status;
	}

	public void setStatus(DocumentStatus status) {
		this.status = status;
	}

	public EntityDescriptor getHandler() {
		return handler;
	}

	public void setHandler(EntityDescriptor handler) {
		this.handler = handler;
	}
}
