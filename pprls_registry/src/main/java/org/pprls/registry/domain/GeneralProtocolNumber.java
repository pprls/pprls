/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

/**
 * An implementation of the model object '<em><b>General Protocol Number</b></em>'.
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.pprls.registry.registry.domain.GeneralProtocolNumber#getYear <em>Year</em>}</li>
 *   <li>{@link org.pprls.registry.registry.domain.GeneralProtocolNumber#getNumber <em>Number</em>}</li>
 * </ul>
 *
 */
public class GeneralProtocolNumber {
	/**
	 * The '{@link #getYear() <em>Year</em>}' attribute.
	 * @see #getYear()
	 */
	protected static final Year YEAR_EDEFAULT = Year.YEAR_2006;

	/**
	 * The '{@link #getYear() <em>Year</em>}' attribute.
	 * @see #getYear()
	 */
	protected Year year = YEAR_EDEFAULT;

	/**
	 * The '{@link #getNumber() <em>Number</em>}' attribute.
	 * @see #getNumber()
	 */
	protected static final short NUMBER_EDEFAULT = 0;

	/**
	 * The '{@link #getNumber() <em>Number</em>}' attribute.
	 * @see #getNumber()
	 */
	protected short number = NUMBER_EDEFAULT;

	/**
	 */
	public GeneralProtocolNumber() {
		super();
	}

	/**
	 */
	public Year getYear() {
		return year;
	}

	/**
	 */
	public void setYear(Year newYear) {
		year = newYear == null ? YEAR_EDEFAULT : newYear;
	}

	/**
	 */
	public short getNumber() {
		return number;
	}

	/**
	 */
	public void setNumber(short newNumber) {
		number = newNumber;
	}


	/**
	 */
	@Override
	public String toString() {
		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (year: ");
		result.append(year);
		result.append(", number: ");
		result.append(number);
		result.append(')');
		return result.toString();
	}

} 
