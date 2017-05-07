/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.persistence.Embeddable;

/**
 * A representation of the literals of the enumeration '<em><b>Document Status</b></em>',
 * and utility methods for working with them.
 */
public enum RegistryState {
	/**
	 * The '<em><b>ACTIVE</b></em>' literal object.
	 * @see #ACTIVE_VALUE
	 */
	ACTIVE(0, "ACTIVE", "Ενεργό"),
	
	/**
	 * The '<em><b>CANCELLED</b></em>' literal object.
	 * @see #CANCELLED_VALUE
	 */
	CANCELLED(1, "CANCELLED", "Ακυρωμένο"),

	/**
	 * The '<em><b>REISSUED</b></em>' literal object.
	 * @see #REISSUED_VALUE
	 */
	REISSUED(2, "REISSUED", "Επαναληψη το ορθό"),

	/**
	 * The '<em><b>RESERVED</b></em>' literal object.
	 * @see #RESERVED_VALUE
	 */
	RESERVED(3, "RESERVED", "Δεσμευμένο");

	

	/**
	 * The '<em><b>ACTIVE</b></em>' literal value.
	 * <p>
	 * A document has been accepted
	 * </p>
	 * @see #ACTIVE
	 */
	public static final int ACTIVE_VALUE = 0;
	
	/**
	 * The '<em><b>CANCELLED</b></em>' literal value.
	 * <p>
	 * A document was cancelled
	 * </p>
	 * @see #CANCELLED
	 */
	public static final int CANCELLED_VALUE = 1;

	/**
	 * The '<em><b>ARCHIVED</b></em>' literal value.
	 * <p>
	 * A document was archived for storage no changes allowed after this
	 * </p>
	 * @see #REISSUED
	 */
	public static final int REISSUED_VALUE = 2;

	/**
	 * The '<em><b>REJECTED</b></em>' literal value.
	 * <p>
	 * A document assignment was rejected
	 * </p>
	 * @see #RESERVED
	 */
	public static final int RESERVED_VALUE = 3;

	/**
	 * An array of all the '<em><b>Document Status</b></em>' enumerators.
	 */
	private static final RegistryState[] VALUES_ARRAY =
		new RegistryState[] {
			ACTIVE,
			REISSUED,
			RESERVED,
			CANCELLED,
		};

	/**
	 * A public read-only list of all the '<em><b>Document Status</b></em>' enumerators.
	 */
	public static final List<RegistryState> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Document Status</b></em>' literal with the specified literal value.
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static RegistryState get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegistryState result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Status</b></em>' literal with the specified name.
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static RegistryState getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RegistryState result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Status</b></em>' literal with the specified integer value.
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static RegistryState get(int value) {
		switch (value) {
			case ACTIVE_VALUE: return ACTIVE;
			case REISSUED_VALUE: return REISSUED;
			case RESERVED_VALUE: return RESERVED;
			case CANCELLED_VALUE: return CANCELLED;
		}
		return null;
	}

	/**
	 */
	private final int value;

	/**
	 */
	private final String name;

	/**
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 */
	private RegistryState(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 */
	public int getValue() {
	  return value;
	}

	/**
	 */
	public String getName() {
	  return name;
	}

	/**
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} 
