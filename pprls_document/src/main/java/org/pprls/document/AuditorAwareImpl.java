package org.pprls.document;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.pprls.core.EntityDescriptor;
import org.springframework.data.domain.AuditorAware;

public class AuditorAwareImpl implements AuditorAware<EntityDescriptor> {
	
	@Override
	public EntityDescriptor getCurrentAuditor() {
		Subject subject = SecurityUtils.getSubject(); // get subject from thread
		//create entitydescriptor from repository 
		return new EntityDescriptor(); //get it from Session
	}

}
