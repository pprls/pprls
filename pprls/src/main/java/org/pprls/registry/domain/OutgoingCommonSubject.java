/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

/**
 * An implementation of the model object '<em><b>Outgoing Common Subject</b></em>'.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.OutgoingCommonSubject#getSubject <em>Subject</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.OutgoingCommonSubject#getDirectorateId <em>Directorate Id</em>}</li>
 * </ul>
 */
public class OutgoingCommonSubject {

	/**
	 * The '{@link #getSubject() <em>Subject</em>}' attribute.
	 * @see #getSubject()
	 */
	protected String subject = "";

	/**
	 * The '{@link #getDirectorateId() <em>Directorate Id</em>}' attribute.
	 * @see #getDirectorateId()
	 */
	protected short directorateId = 0;

	/**
	 */
	public OutgoingCommonSubject() {
		super();
	}

	/**
	 */
	public String getSubject() {
		return subject;
	}

	/**
	 */
	public void setSubject(String newSubject) {
		subject = newSubject;
	}

	/**
	 */
	public short getDirectorateId() {
		return directorateId;
	}

	/**
	 */
	public void setDirectorateId(short newDirectorateId) {
		directorateId = newDirectorateId;
	}


	/**
	 */
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (subject: ");
		result.append(subject);
		result.append(", directorateId: ");
		result.append(directorateId);
		result.append(')');
		return result.toString();
	}
}
