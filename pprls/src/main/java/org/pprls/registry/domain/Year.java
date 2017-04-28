/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>Year</b></em>',
 * and utility methods for working with them.
 * @see org.pprls.registry.registry.registration.RegistrationPackage#getYear()
 */
public enum Year {
	/**
	 * The '<em><b>YEAR 2006</b></em>' literal object.
	 * @see #YEAR_2006_VALUE
	 */
	YEAR_2006(2006, "YEAR_2006", "2006"),

	/**
	 * The '<em><b>YEAR 2007</b></em>' literal object.
	 * @see #YEAR_2007_VALUE
	 */
	YEAR_2007(2007, "YEAR_2007", "2007"),

	/**
	 * The '<em><b>YEAR 2008</b></em>' literal object.
	 * @see #YEAR_2008_VALUE
	 */
	YEAR_2008(2008, "YEAR_2008", "2008"),

	/**
	 * The '<em><b>YEAR 2009</b></em>' literal object.
	 * @see #YEAR_2009_VALUE
	 */
	YEAR_2009(2009, "YEAR_2009", "2009"),

	/**
	 * The '<em><b>YEAR 2010</b></em>' literal object.
	 * @see #YEAR_2010_VALUE
	 */
	YEAR_2010(2010, "YEAR_2010", "2010"),

	/**
	 * The '<em><b>YEAR 2011</b></em>' literal object.
	 * @see #YEAR_2011_VALUE
	 */
	YEAR_2011(2011, "YEAR_2011", "2011"),

	/**
	 * The '<em><b>YEAR 2012</b></em>' literal object.
	 * @see #YEAR_2012_VALUE
	 */
	YEAR_2012(2012, "YEAR_2012", "2012"),

	/**
	 * The '<em><b>YEAR 2013</b></em>' literal object.
	 * @see #YEAR_2013_VALUE
	 */
	YEAR_2013(2013, "YEAR_2013", "2013"),

	/**
	 * The '<em><b>YEAR 2014</b></em>' literal object.
	 * @see #YEAR_2014_VALUE
	 */
	YEAR_2014(2014, "YEAR_2014", "2014"),

	/**
	 * The '<em><b>YEAR 2015</b></em>' literal object.
	 * @see #YEAR_2015_VALUE
	 */
	YEAR_2015(2015, "YEAR_2015", "2015"),

	/**
	 * The '<em><b>YEAR 2016</b></em>' literal object.
	 * @see #YEAR_2016_VALUE
	 */
	YEAR_2016(2016, "YEAR_2016", "2016"),

	/**
	 * The '<em><b>YEAR 2017</b></em>' literal object.
	 * @see #YEAR_2017_VALUE
	 */
	YEAR_2017(2017, "YEAR_2017", "2017"),

	/**
	 * The '<em><b>YEAR 2018</b></em>' literal object.
	 * @see #YEAR_2018_VALUE
	 */
	YEAR_2018(2018, "YEAR_2018", "2018"),

	/**
	 * The '<em><b>YEAR 2019</b></em>' literal object.
	 * @see #YEAR_2019_VALUE
	 */
	YEAR_2019(2019, "YEAR_2019", "2019"),

	/**
	 * The '<em><b>YEAR 2020</b></em>' literal object.
	 * @see #YEAR_2020_VALUE
	 */
	YEAR_2020(2020, "YEAR_2020", "2020"),

	/**
	 * The '<em><b>YEAR 2021</b></em>' literal object.
	 * @see #YEAR_2021_VALUE
	 */
	YEAR_2021(2021, "YEAR_2021", "2021"),

	/**
	 * The '<em><b>YEAR 2022</b></em>' literal object.
	 * @see #YEAR_2022_VALUE
	 */
	YEAR_2022(2022, "YEAR_2022", "2022"),

	/**
	 * The '<em><b>YEAR 2023</b></em>' literal object.
	 * @see #YEAR_2023_VALUE
	 */
	YEAR_2023(2023, "YEAR_2023", "2023"),

	/**
	 * The '<em><b>YEAR 2024</b></em>' literal object.
	 * @see #YEAR_2024_VALUE
	 */
	YEAR_2024(2024, "YEAR_2024", "2024"),

	/**
	 * The '<em><b>YEAR 2025</b></em>' literal object.
	 * @see #YEAR_2025_VALUE
	 */
	YEAR_2025(2024, "YEAR_2025", "2025"),

	/**
	 * The '<em><b>ANY</b></em>' literal object.
	 * @see #ANY_VALUE
	 */
	ANY(0, "ANY", "ANY"),

	/**
	 * The '<em><b>YEAR EPOCH</b></em>' literal object.
	 * @see #YEAR_EPOCH_VALUE
	 */
	YEAR_EPOCH(1970, "YEAR_EPOCH", "1970");

	/**
	 * The '<em><b>YEAR 2006</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2006</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2006
	 */
	public static final int YEAR_2006_VALUE = 2006;

	/**
	 * The '<em><b>YEAR 2007</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2007</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2007
	 */
	public static final int YEAR_2007_VALUE = 2007;

	/**
	 * The '<em><b>YEAR 2008</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2008</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2008
	 */
	public static final int YEAR_2008_VALUE = 2008;

	/**
	 * The '<em><b>YEAR 2009</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2009</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2009
	 */
	public static final int YEAR_2009_VALUE = 2009;

	/**
	 * The '<em><b>YEAR 2010</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2010</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2010
	 */
	public static final int YEAR_2010_VALUE = 2010;

	/**
	 * The '<em><b>YEAR 2011</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2011</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2011
	 */
	public static final int YEAR_2011_VALUE = 2011;

	/**
	 * The '<em><b>YEAR 2012</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2012</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2012
	 */
	public static final int YEAR_2012_VALUE = 2012;

	/**
	 * The '<em><b>YEAR 2013</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2013</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2013
	 */
	public static final int YEAR_2013_VALUE = 2013;

	/**
	 * The '<em><b>YEAR 2014</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2014</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2014
	 */
	public static final int YEAR_2014_VALUE = 2014;

	/**
	 * The '<em><b>YEAR 2015</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2015</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2015
	 */
	public static final int YEAR_2015_VALUE = 2015;

	/**
	 * The '<em><b>YEAR 2016</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2016</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2016
	 */
	public static final int YEAR_2016_VALUE = 2016;

	/**
	 * The '<em><b>YEAR 2017</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2017</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2017
	 */
	public static final int YEAR_2017_VALUE = 2017;

	/**
	 * The '<em><b>YEAR 2018</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2018</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2018
	 */
	public static final int YEAR_2018_VALUE = 2018;

	/**
	 * The '<em><b>YEAR 2019</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2019</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2019
	 */
	public static final int YEAR_2019_VALUE = 2019;

	/**
	 * The '<em><b>YEAR 2020</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2020</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2020
	 */
	public static final int YEAR_2020_VALUE = 2020;

	/**
	 * The '<em><b>YEAR 2021</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2021</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2021
	 */
	public static final int YEAR_2021_VALUE = 2021;

	/**
	 * The '<em><b>YEAR 2022</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2022</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2022
	 */
	public static final int YEAR_2022_VALUE = 2022;

	/**
	 * The '<em><b>YEAR 2023</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2023</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2023
	 */
	public static final int YEAR_2023_VALUE = 2023;

	/**
	 * The '<em><b>YEAR 2024</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2024</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2024
	 */
	public static final int YEAR_2024_VALUE = 2024;

	/**
	 * The '<em><b>YEAR 2025</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR 2025</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_2025
	 */
	public static final int YEAR_2025_VALUE = 2025;

	/**
	 * The '<em><b>ANY</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>ANY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #ANY
	 */
	public static final int ANY_VALUE = 0;

	/**
	 * The '<em><b>YEAR EPOCH</b></em>' literal value.
	 * <p>
	 * If the meaning of '<em><b>YEAR EPOCH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * @see #YEAR_EPOCH
	 */
	public static final int YEAR_EPOCH_VALUE = 1970;

	/**
	 * An array of all the '<em><b>Year</b></em>' enumerators.
	 */
	private static final Year[] VALUES_ARRAY =
		new Year[] {
			YEAR_2006,
			YEAR_2007,
			YEAR_2008,
			YEAR_2009,
			YEAR_2010,
			YEAR_2011,
			YEAR_2012,
			YEAR_2013,
			YEAR_2014,
			YEAR_2015,
			YEAR_2016,
			YEAR_2017,
			YEAR_2018,
			YEAR_2019,
			YEAR_2020,
			YEAR_2021,
			YEAR_2022,
			YEAR_2023,
			YEAR_2024,
			YEAR_2025,
			ANY,
			YEAR_EPOCH,
		};

	/**
	 * A public read-only list of all the '<em><b>Year</b></em>' enumerators.
	 */
	public static final List<Year> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Year</b></em>' literal with the specified literal value.
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static Year get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Year result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Year</b></em>' literal with the specified name.
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static Year getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			Year result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Year</b></em>' literal with the specified integer value.
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static Year get(int value) {
		switch (value) {
			case YEAR_2006_VALUE: return YEAR_2006;
			case YEAR_2007_VALUE: return YEAR_2007;
			case YEAR_2008_VALUE: return YEAR_2008;
			case YEAR_2009_VALUE: return YEAR_2009;
			case YEAR_2010_VALUE: return YEAR_2010;
			case YEAR_2011_VALUE: return YEAR_2011;
			case YEAR_2012_VALUE: return YEAR_2012;
			case YEAR_2013_VALUE: return YEAR_2013;
			case YEAR_2014_VALUE: return YEAR_2014;
			case YEAR_2015_VALUE: return YEAR_2015;
			case YEAR_2016_VALUE: return YEAR_2016;
			case YEAR_2017_VALUE: return YEAR_2017;
			case YEAR_2018_VALUE: return YEAR_2018;
			case YEAR_2019_VALUE: return YEAR_2019;
			case YEAR_2020_VALUE: return YEAR_2020;
			case YEAR_2021_VALUE: return YEAR_2021;
			case YEAR_2022_VALUE: return YEAR_2022;
			case YEAR_2023_VALUE: return YEAR_2023;
			case YEAR_2024_VALUE: return YEAR_2024;
			case YEAR_2025_VALUE: return YEAR_2025;
			case ANY_VALUE: return ANY;
			case YEAR_EPOCH_VALUE: return YEAR_EPOCH;
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
	private Year(int value, String name, String literal) {
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
