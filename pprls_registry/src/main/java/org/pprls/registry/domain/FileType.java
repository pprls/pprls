/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registry.domain;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * A representation of the literals of the enumeration '<em><b>File Type</b></em>',
 * and utility methods for working with them.
 */
public enum FileType {
	/**
	 * The '<em><b>PDF</b></em>' literal object.
	 * @see #PDF_VALUE
	 */
	PDF(0, "PDF", "PDF"),

	/**
	 * The '<em><b>DOC</b></em>' literal object.
	 * @see #DOC_VALUE
	 */
	DOC(1, "DOC", "DOC"),

	/**
	 * The '<em><b>DOCX</b></em>' literal object.
	 * @see #DOCX_VALUE
	 */
	DOCX(8, "DOCX", "DOCX"),

	/**
	 * The '<em><b>ODT</b></em>' literal object.
	 * @see #ODT_VALUE
	 */
	ODT(2, "ODT", "ODT"),

	/**
	 * The '<em><b>TXT</b></em>' literal object.
	 * @see #TXT_VALUE
	 */
	TXT(3, "TXT", "TXT"),

	/**
	 * The '<em><b>RTF</b></em>' literal object.
	 * @see #RTF_VALUE
	 */
	RTF(4, "RTF", "RTF"),

	/**
	 * The '<em><b>XLS</b></em>' literal object.
	 * @see #XLS_VALUE
	 */
	XLS(5, "XLS", "XLS"),

	/**
	 * The '<em><b>XLSX</b></em>' literal object.
	 * @see #XLSX_VALUE
	 */
	XLSX(7, "XLSX", "XLSX"),

	/**
	 * The '<em><b>ODS</b></em>' literal object.
	 * @see #ODS_VALUE
	 */
	ODS(6, "ODS", "ODS");

	/**
	 * The '<em><b>PDF</b></em>' literal value.
	 * @see #PDF
	 */
	public static final int PDF_VALUE = 0;

	/**
	 * The '<em><b>DOC</b></em>' literal value.
	 * @see #DOC
	 */
	public static final int DOC_VALUE = 1;

	/**
	 * The '<em><b>DOCX</b></em>' literal value.
	 * @see #DOCX
	 */
	public static final int DOCX_VALUE = 8;

	/**
	 * The '<em><b>ODT</b></em>' literal value.
	 * @see #ODT
	 */
	public static final int ODT_VALUE = 2;

	/**
	 * The '<em><b>TXT</b></em>' literal value.
	 * @see #TXT
	 */
	public static final int TXT_VALUE = 3;

	/**
	 * The '<em><b>RTF</b></em>' literal value.
	 * @see #RTF
	 */
	public static final int RTF_VALUE = 4;

	/**
	 * The '<em><b>XLS</b></em>' literal value.
	 * @see #XLS
	 */
	public static final int XLS_VALUE = 5;

	/**
	 * The '<em><b>XLSX</b></em>' literal value.
	 * @see #XLSX
	 */
	public static final int XLSX_VALUE = 7;

	/**
	 * The '<em><b>ODS</b></em>' literal value.
	 * @see #ODS
	 */
	public static final int ODS_VALUE = 6;

	/**
	 * An array of all the '<em><b>File Type</b></em>' enumerators.
	 */
	private static final FileType[] VALUES_ARRAY =
		new FileType[] {
			PDF,
			DOC,
			DOCX,
			ODT,
			TXT,
			RTF,
			XLS,
			XLSX,
			ODS,
		};

	/**
	 * A public read-only list of all the '<em><b>File Type</b></em>' enumerators.
	 */
	public static final List<FileType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>File Type</b></em>' literal with the specified literal value.
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static FileType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Type</b></em>' literal with the specified name.
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static FileType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FileType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>File Type</b></em>' literal with the specified integer value.
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 */
	public static FileType get(int value) {
		switch (value) {
			case PDF_VALUE: return PDF;
			case DOC_VALUE: return DOC;
			case DOCX_VALUE: return DOCX;
			case ODT_VALUE: return ODT;
			case TXT_VALUE: return TXT;
			case RTF_VALUE: return RTF;
			case XLS_VALUE: return XLS;
			case XLSX_VALUE: return XLSX;
			case ODS_VALUE: return ODS;
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
	private FileType(int value, String name, String literal) {
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
	public String toString() {
		return literal;
	}
	
} 
