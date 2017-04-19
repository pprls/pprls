/**
 * Αδειοδοτείται υπό τους όρους της EUPL
 */
package org.pprls.registration;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Agrix Product Types</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.pprls.registration.impl.RegistrationPackageImpl#getAgrixProductTypes()
 * @generated
 */
public enum AgrixProductTypes {
	/**
	 * The '<em><b>ALCOHOLE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALCOHOLE_VALUE
	 * @generated
	 * @ordered
	 */
	ALCOHOLE(4, "ALCOHOLE", "\u0391\u039b\u039a\u039f\u039f\u039b\u0397 \u0393\u0395\u03a9\u03a1\u0393\u0399\u039a\u0397\u03a3 \u03a0\u03a1\u039f\u0395\u039b\u0395\u03a5\u03a3\u0397\u03a3"),

	/**
	 * The '<em><b>ALEVRA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ALEVRA_VALUE
	 * @generated
	 * @ordered
	 */
	ALEVRA(34, "ALEVRA", "\u0391\u039b\u0395\u03a5\u03a1\u0391"),

	/**
	 * The '<em><b>ANIMAL FOOD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANIMAL_FOOD_VALUE
	 * @generated
	 * @ordered
	 */
	ANIMAL_FOOD(12, "ANIMAL_FOOD", "\u0396\u03a9\u039f\u03a4\u03a1\u039f\u03a6\u0395\u03a3"),

	/**
	 * The '<em><b>ANIMAL FOOD2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANIMAL_FOOD2_VALUE
	 * @generated
	 * @ordered
	 */
	ANIMAL_FOOD2(190, "ANIMAL_FOOD2", "\u03a0\u0391\u03a1\u0391\u03a3\u039a\u0395\u03a5\u0391\u03a3\u039c\u0391\u03a4\u0391-\u0396\u03a9\u039f\u03a4\u03a1\u039f\u03a6\u0395\u03a3"),

	/**
	 * The '<em><b>ANIMAL FOOD WHEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANIMAL_FOOD_WHEAT_VALUE
	 * @generated
	 * @ordered
	 */
	ANIMAL_FOOD_WHEAT(50, "ANIMAL_FOOD_WHEAT", "\u0396\u03a9\u039f\u03a4\u03a1\u039f\u03a6\u0395\u03a3 -\u03a3\u03a0\u039f\u03a1\u039f\u0399 \u03a3\u0399\u03a4\u0397\u03a1\u03a9\u039d"),

	/**
	 * The '<em><b>ANIMAL FOOD REMAINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANIMAL_FOOD_REMAINS_VALUE
	 * @generated
	 * @ordered
	 */
	ANIMAL_FOOD_REMAINS(777, "ANIMAL_FOOD_REMAINS", "\u03a5\u03a0\u039f\u039b\u0395\u0399\u039c\u039c\u0391\u03a4\u0391 \u0392\u0399\u039f\u039c. \u03a4\u03a1\u039f\u03a6\u0399\u039c\u03a9\u039d-\u0396\u03a9\u039f\u03a4\u03a1\u039f\u03a6\u0395\u03a3"),

	/**
	 * The '<em><b>BARLEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BARLEY_VALUE
	 * @generated
	 * @ordered
	 */
	BARLEY(30, "BARLEY", "\u039a\u03a1\u0399\u0398\u0391\u03a1\u0399"),

	/**
	 * The '<em><b>BEEF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEEF_VALUE
	 * @generated
	 * @ordered
	 */
	BEEF(28, "BEEF", "\u0392\u039f\u0395\u0399\u039f \u039a\u03a1\u0395\u0391\u03a3"),

	/**
	 * The '<em><b>BEEF FROZEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEEF_FROZEN_VALUE
	 * @generated
	 * @ordered
	 */
	BEEF_FROZEN(280, "BEEF_FROZEN", "\u0392\u039f\u0395\u0399\u039f \u039a\u03a1\u0395\u0391\u03a3 \u039a\u0391\u03a4/\u039d\u039f"),

	/**
	 * The '<em><b>BEEF FROZEN2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEEF_FROZEN2_VALUE
	 * @generated
	 * @ordered
	 */
	BEEF_FROZEN2(281, "BEEF_FROZEN2", "\u0392\u039f\u0395\u0399\u039f\u039d \u039a\u0391\u03a4\u0395\u03a8\u03a5\u0393\u039c\u0395\u039d\u039f"),

	/**
	 * The '<em><b>BEEF NO BONES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEEF_NO_BONES_VALUE
	 * @generated
	 * @ordered
	 */
	BEEF_NO_BONES(290, "BEEF_NO_BONES", "\u039a\u03a1\u0395\u0391\u03a3 \u0392\u039f\u039f\u0395\u0399\u0394\u03a9\u039d \u0391\u039d\u0395\u03a5 \u039f\u03a3\u03a4\u03a9\u039d"),

	/**
	 * The '<em><b>BEEF FROZEN3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEEF_FROZEN3_VALUE
	 * @generated
	 * @ordered
	 */
	BEEF_FROZEN3(289, "BEEF_FROZEN3", "\u039a\u03a1\u0395\u0391\u03a4\u0391 \u0392\u039f\u0395\u0399\u0391 \u039a\u0391\u03a4\u0395\u03a8\u03a5\u0393\u039c\u0395\u039d\u0391"),

	/**
	 * The '<em><b>BEEF FRESH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BEEF_FRESH_VALUE
	 * @generated
	 * @ordered
	 */
	BEEF_FRESH(288, "BEEF_FRESH", "\u039a\u03a1\u0395\u0391\u03a4\u0391 \u0392\u039f\u039f\u0395\u0399\u0394\u03a9\u039d \u039d\u03a9\u03a0\u0391"),

	/**
	 * The '<em><b>CEREAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CEREAL_VALUE
	 * @generated
	 * @ordered
	 */
	CEREAL(1, "CEREAL", "\u03a3\u0399\u03a4\u0397\u03a1\u0391"),

	/**
	 * The '<em><b>CHEESE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEESE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEESE(9, "CHEESE", "\u03a4\u03a5\u03a1\u0399"),

	/**
	 * The '<em><b>CHEESE WHITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEESE_WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	CHEESE_WHITE(99, "CHEESE_WHITE", "\u039b\u0395\u03a5\u039a\u039f \u03a4\u03a5\u03a1\u0399 \u0391\u039b\u039c\u03a5\u03a1\u039f \u0391\u03a0\u039f \u03a0\u03a1\u039f\u0392\u0395\u0399\u039f \u039a\u0391\u0399 \u0393\u0399\u0394\u0399\u039d\u039f \u0393\u0391\u039b\u0391 \u039a\u0391\u0399 \u039a\u0395\u03a6\u0391\u039b\u039f\u0393\u03a1\u0391\u0392\u0399\u0395\u03a1\u0391"),

	/**
	 * The '<em><b>CHEESE HARD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEESE_HARD_VALUE
	 * @generated
	 * @ordered
	 */
	CHEESE_HARD(133, "CHEESE_HARD", "\u03a4\u03a5\u03a1\u0399 \u0397\u039c\u0399\u03a3\u039a\u039b\u0397\u03a1\u039f"),

	/**
	 * The '<em><b>CHEESE2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHEESE2_VALUE
	 * @generated
	 * @ordered
	 */
	CHEESE2(845, "CHEESE2", "\u03a4\u03a5\u03a1\u0399\u0391 \u039a\u0391\u0399 \u03a0\u0397\u0393\u039c\u0395\u039d\u039f \u0393\u0391\u039b\u0391 \u0393\u0399\u0391 \u03a4\u03a5\u03a1\u0399\u0391 - \u03a4\u03a5\u03a1\u0399\u0391 \u039d\u03a9\u03a0\u0391"),

	/**
	 * The '<em><b>COTTON PIE REMAINS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COTTON_PIE_REMAINS_VALUE
	 * @generated
	 * @ordered
	 */
	COTTON_PIE_REMAINS(930, "COTTON_PIE_REMAINS", "\u03a5\u03a0\u039f\u039b\u0395\u0399\u039c\u0391\u03a4\u0391 \u0392\u0391\u039c\u0392\u0391\u039a\u039f\u03a0\u0399\u03a4\u0391"),

	/**
	 * The '<em><b>CHICKEN FROZEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHICKEN_FROZEN_VALUE
	 * @generated
	 * @ordered
	 */
	CHICKEN_FROZEN(301, "CHICKEN_FROZEN", "\u039a\u03a1\u0395\u0391\u03a3 \u039a\u039f\u03a4\u039f\u03a0\u039f\u03a5\u039b\u039f\u03a5 \u039a\u0391\u03a4/\u039d\u039f \u0391/\u039f"),

	/**
	 * The '<em><b>CORN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORN_VALUE
	 * @generated
	 * @ordered
	 */
	CORN(18, "CORN", "\u0391\u03a1\u0391\u0392\u039f\u03a3\u0399\u03a4\u039f\u03a3"),

	/**
	 * The '<em><b>CORN2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORN2_VALUE
	 * @generated
	 * @ordered
	 */
	CORN2(200, "CORN2", "\u0391\u03a1\u0391\u0392\u039f\u03a3\u0399\u03a4\u039f\u03a3 \u03a3\u0399\u03a4\u0391\u03a1\u0399 \u03a3\u0399\u039a\u0391\u039b\u0397 \u039a\u03a1\u0399\u0398\u0391\u03a1\u0399 \u0392\u03a1\u03a9\u039c\u0397"),

	/**
	 * The '<em><b>CORN FOR POP CORN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORN_FOR_POP_CORN_VALUE
	 * @generated
	 * @ordered
	 */
	CORN_FOR_POP_CORN(16, "CORN_FOR_POP_CORN", "\u039a\u0391\u039b\u0391\u039c\u03a0\u039f\u039a\u0399 \u0393\u0399\u0391 \u03a0\u039f\u03a0-\u039a\u039f\u03a1\u039d"),

	/**
	 * The '<em><b>CORN GLUTENE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORN_GLUTENE_VALUE
	 * @generated
	 * @ordered
	 */
	CORN_GLUTENE(20, "CORN_GLUTENE", "\u0393\u039b\u039f\u03a5\u03a4\u0395\u039d\u0397 \u0391\u03a1\u0391\u0392\u039f\u03a3\u0399\u03a4\u039f\u03a5"),

	/**
	 * The '<em><b>CORN GLUTENE2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CORN_GLUTENE2_VALUE
	 * @generated
	 * @ordered
	 */
	CORN_GLUTENE2(500, "CORN_GLUTENE2", "\u0393\u039b\u039f\u03a5\u03a4\u0395\u039d\u0397 \u039a\u0391\u039b\u0391\u039c\u03a0\u039f\u039a\u0399\u039f\u03a5"),

	/**
	 * The '<em><b>DAIRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DAIRY_VALUE
	 * @generated
	 * @ordered
	 */
	DAIRY(3, "DAIRY", "\u0393\u0391\u039b\u0391 & \u0393\u0391\u039b\u0391\u039a\u03a4\u039f\u039a\u039f\u039c\u0399\u039a\u0391 \u03a0\u03a1\u039f\u03aa\u039f\u039d\u03a4\u0391"),

	/**
	 * The '<em><b>ETHANOL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ETHANOL_VALUE
	 * @generated
	 * @ordered
	 */
	ETHANOL(35, "ETHANOL", "\u0391\u0399\u0398\u03a5\u039b\u0399\u039a\u0397 \u0391\u039b\u039a\u039f\u039f\u039b\u0397"),

	/**
	 * The '<em><b>FLOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FLOUR_VALUE
	 * @generated
	 * @ordered
	 */
	FLOUR(10, "FLOUR", "\u0391\u039b\u0395\u03a5\u03a1\u0399"),

	/**
	 * The '<em><b>FETA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FETA_VALUE
	 * @generated
	 * @ordered
	 */
	FETA(15, "FETA", "\u03a6\u0395\u03a4\u0391"),

	/**
	 * The '<em><b>FETA CHEESE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FETA_CHEESE_VALUE
	 * @generated
	 * @ordered
	 */
	FETA_CHEESE(33, "FETA_CHEESE", "\u03a4\u03a5\u03a1\u0399 \u03a6\u0395\u03a4\u0391"),

	/**
	 * The '<em><b>GARLIC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARLIC_VALUE
	 * @generated
	 * @ordered
	 */
	GARLIC(277, "GARLIC", "\u03a3\u039a\u039f\u03a1\u0394\u0391"),

	/**
	 * The '<em><b>GARLIC FRESH</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARLIC_FRESH_VALUE
	 * @generated
	 * @ordered
	 */
	GARLIC_FRESH(276, "GARLIC_FRESH", "\u03a3\u039a\u039f\u03a1\u0394\u0391 \u039d\u03a9\u03a0\u0391"),

	/**
	 * The '<em><b>GARLIC POWDER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARLIC_POWDER_VALUE
	 * @generated
	 * @ordered
	 */
	GARLIC_POWDER(19, "GARLIC_POWDER", "\u03a3\u039a\u039f\u03a1\u0394\u0391 \u03a3\u0395 \u03a3\u039a\u039f\u039d\u0397"),

	/**
	 * The '<em><b>GARLIC DEHYDRATED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARLIC_DEHYDRATED_VALUE
	 * @generated
	 * @ordered
	 */
	GARLIC_DEHYDRATED(400, "GARLIC_DEHYDRATED", "\u0391\u03a6\u03a5\u0394\u0391\u03a4\u03a9\u039c\u0395\u039d\u039f \u03a3\u039a\u039f\u03a1\u0394\u039f \u03a3\u0395 \u03a3\u039a\u039f\u039d\u0397 \u039a\u0391\u0399 \u039a\u039f\u039a\u039a\u039f\u03a5\u03a3"),

	/**
	 * The '<em><b>GARLIC3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARLIC3_VALUE
	 * @generated
	 * @ordered
	 */
	GARLIC3(275, "GARLIC3", "\u03a3\u039a\u039f\u03a1\u0394\u0391 \u03a3\u0395 \u0391\u039b\u039c\u0397"),

	/**
	 * The '<em><b>GARLIC DRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARLIC_DRY_VALUE
	 * @generated
	 * @ordered
	 */
	GARLIC_DRY(270, "GARLIC_DRY", "\u03a3\u039a\u039f\u03a1\u0394\u039f \u0391\u03a0\u039f\u039e\u0397\u03a1\u0391\u039c\u0395\u039d\u039f"),

	/**
	 * The '<em><b>GARLIC DRY2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GARLIC_DRY2_VALUE
	 * @generated
	 * @ordered
	 */
	GARLIC_DRY2(95, "GARLIC_DRY2", "\u039e\u0395\u03a1\u039f \u03a3\u039a\u039f\u03a1\u0394\u039f"),

	/**
	 * The '<em><b>GLYCOZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLYCOZE_VALUE
	 * @generated
	 * @ordered
	 */
	GLYCOZE(450, "GLYCOZE", "\u0393\u039b\u03a5\u039a\u039f\u0396\u0397"),

	/**
	 * The '<em><b>GRAVIERA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GRAVIERA_VALUE
	 * @generated
	 * @ordered
	 */
	GRAVIERA(40, "GRAVIERA", "\u0393\u03a1\u0391\u0392\u0399\u0395\u03a1\u0391"),

	/**
	 * The '<em><b>GLUTENE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GLUTENE_VALUE
	 * @generated
	 * @ordered
	 */
	GLUTENE(29, "GLUTENE", "\u0393\u039b\u039f\u03a5\u03a4\u0395\u039d\u0397"),

	/**
	 * The '<em><b>KEFALOGRAVIERA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEFALOGRAVIERA_VALUE
	 * @generated
	 * @ordered
	 */
	KEFALOGRAVIERA(23, "KEFALOGRAVIERA", "\u039a\u0395\u03a6\u0391\u039b\u039f\u0393\u03a1\u0391\u0392\u0399\u0395\u03a1\u0391"),

	/**
	 * The '<em><b>KEFALOTYRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #KEFALOTYRI_VALUE
	 * @generated
	 * @ordered
	 */
	KEFALOTYRI(14, "KEFALOTYRI", "\u039a\u0395\u03a6\u0391\u039b\u039f\u03a4\u03a5\u03a1\u0399"),

	/**
	 * The '<em><b>MEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEAT_VALUE
	 * @generated
	 * @ordered
	 */
	MEAT(0, "MEAT", "\u0392\u039f\u0395\u0399\u039f \u039a\u03a1\u0395\u0391\u03a3 \u039a\u0391\u0399 \u03a0\u039f\u03a5\u039b\u0395\u03a1\u0399\u039a\u0391"),

	/**
	 * The '<em><b>MANOYRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MANOYRI_VALUE
	 * @generated
	 * @ordered
	 */
	MANOYRI(0, "MANOYRI", "\u03a4\u03a5\u03a1\u0399 \u039c\u0391\u039d\u039f\u03a5\u03a1\u0399"),

	/**
	 * The '<em><b>MUSHROOMS2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUSHROOMS2_VALUE
	 * @generated
	 * @ordered
	 */
	MUSHROOMS2(98, "MUSHROOMS2", "\u039c\u0391\u039d\u0399\u03a4\u0391\u03a1\u0399\u0391"),

	/**
	 * The '<em><b>MUSHROOMS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MUSHROOMS_VALUE
	 * @generated
	 * @ordered
	 */
	MUSHROOMS(6, "MUSHROOMS", "\u039a\u039f\u039d\u03a3\u0395\u03a1\u0392\u0395\u03a3 \u039c\u0391\u039d\u0399\u03a4\u0391\u03a1\u0399\u03a9\u039d"),

	/**
	 * The '<em><b>MYZHTHRA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MYZHTHRA_VALUE
	 * @generated
	 * @ordered
	 */
	MYZHTHRA(585, "MYZHTHRA", "\u039c\u03a5\u0396\u0397\u0398\u03a1\u0391"),

	/**
	 * The '<em><b>MYZHTRA DRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MYZHTRA_DRY_VALUE
	 * @generated
	 * @ordered
	 */
	MYZHTRA_DRY(93, "MYZHTRA_DRY", "\u039e\u0397\u03a1\u0397 \u039c\u03a5\u0396\u0397\u0398\u03a1\u0391"),

	/**
	 * The '<em><b>OLIVEOIL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLIVEOIL_VALUE
	 * @generated
	 * @ordered
	 */
	OLIVEOIL(7, "OLIVEOIL", "\u0395\u039b\u0391\u0399\u039f\u039b\u0391\u0394\u039f"),

	/**
	 * The '<em><b>PASTA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PASTA_VALUE
	 * @generated
	 * @ordered
	 */
	PASTA(8, "PASTA", "\u0396\u03a5\u039c\u0391\u03a1\u0399\u039aA"),

	/**
	 * The '<em><b>POP CORN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #POP_CORN_VALUE
	 * @generated
	 * @ordered
	 */
	POP_CORN(24, "POP_CORN", "\u03a0\u039f\u03a0 \u039a\u039f\u03a1\u039d"),

	/**
	 * The '<em><b>PITYRA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PITYRA_VALUE
	 * @generated
	 * @ordered
	 */
	PITYRA(180, "PITYRA", "\u03a0\u0399\u03a4\u03a5\u03a1\u0391"),

	/**
	 * The '<em><b>RICE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICE_VALUE
	 * @generated
	 * @ordered
	 */
	RICE(2, "RICE", "\u03a1\u03a5\u0396\u0399"),

	/**
	 * The '<em><b>RICE BASMATI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICE_BASMATI_VALUE
	 * @generated
	 * @ordered
	 */
	RICE_BASMATI(139, "RICE_BASMATI", "\u03a1\u03a5\u0396\u0399 BASMATI"),

	/**
	 * The '<em><b>RICE JASMINE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICE_JASMINE_VALUE
	 * @generated
	 * @ordered
	 */
	RICE_JASMINE(170, "RICE_JASMINE", "\u03a1\u03a5\u0396\u0399 \u0393\u0399\u0391\u03a3\u0395\u039c\u0399\u039f\u03a5"),

	/**
	 * The '<em><b>RICE WHITENED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICE_WHITENED_VALUE
	 * @generated
	 * @ordered
	 */
	RICE_WHITENED(140, "RICE_WHITENED", "\u03a1\u03a5\u0396\u0399 \u039b\u0395\u03a5\u039a\u0391\u03a3\u039c\u0395\u039d\u039f"),

	/**
	 * The '<em><b>RICE PARTS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICE_PARTS_VALUE
	 * @generated
	 * @ordered
	 */
	RICE_PARTS(59, "RICE_PARTS", "\u0398\u03a1\u0391\u03a5\u03a3\u039c\u0391\u03a4\u0391 \u03a1\u03a5\u0396\u0399\u039f\u03a5"),

	/**
	 * The '<em><b>RICE GRAINS WHITENED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICE_GRAINS_WHITENED_VALUE
	 * @generated
	 * @ordered
	 */
	RICE_GRAINS_WHITENED(25, "RICE_GRAINS_WHITENED", "\u03a1\u03a5\u0396\u0399 \u039b\u0395\u03a5\u039a\u0391\u03a3\u039c\u0395\u039d\u039f \u03a3\u0395 \u039a\u039f\u039a\u039a\u039f\u03a5\u03a3"),

	/**
	 * The '<em><b>RICE MEDIUM WHITENED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RICE_MEDIUM_WHITENED_VALUE
	 * @generated
	 * @ordered
	 */
	RICE_MEDIUM_WHITENED(26, "RICE_MEDIUM_WHITENED", "\u03a1\u03a5\u0396\u0399 \u039b\u0395\u03a5\u039a\u0391\u03a3\u039c\u0395\u039d\u039f \u039c\u0395\u03a3\u0391\u0399\u039f"),

	/**
	 * The '<em><b>RYE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RYE_VALUE
	 * @generated
	 * @ordered
	 */
	RYE(31, "RYE", "\u03a3\u0399\u039a\u0391\u039b\u0397"),

	/**
	 * The '<em><b>SOFT FLOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFT_FLOUR_VALUE
	 * @generated
	 * @ordered
	 */
	SOFT_FLOUR(13, "SOFT_FLOUR", "\u0391\u039b\u0395\u03a5\u03a1\u0399 \u0391\u03a0\u039f \u039c\u0391\u039b\u0391\u039a\u039f \u03a3\u0399\u03a4\u0391\u03a1\u0399"),

	/**
	 * The '<em><b>SOFT FLOUR2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFT_FLOUR2_VALUE
	 * @generated
	 * @ordered
	 */
	SOFT_FLOUR2(360, "SOFT_FLOUR2", "\u0391\u039b\u0395\u03a5\u03a1\u0399 \u039c\u0391\u039b\u0391\u039a\u039f"),

	/**
	 * The '<em><b>SOFT FLOUR3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOFT_FLOUR3_VALUE
	 * @generated
	 * @ordered
	 */
	SOFT_FLOUR3(361, "SOFT_FLOUR3", "\u0391\u039b\u0395\u03a5\u03a1\u0399 \u03a3\u0399\u03a4\u039f\u03a5 \u039c\u0391\u039b\u0391\u039a\u039f"),

	/**
	 * The '<em><b>SOYA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOYA_VALUE
	 * @generated
	 * @ordered
	 */
	SOYA(366, "SOYA", "\u03a3\u039f\u0393\u0399\u0391"),

	/**
	 * The '<em><b>SORGOS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SORGOS_VALUE
	 * @generated
	 * @ordered
	 */
	SORGOS(800, "SORGOS", "\u03a3\u039f\u03a1\u0393\u039f\u03a3"),

	/**
	 * The '<em><b>SUGAR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUGAR_VALUE
	 * @generated
	 * @ordered
	 */
	SUGAR(5, "SUGAR", "\u0396\u0391\u03a7\u0391\u03a1\u0397"),

	/**
	 * The '<em><b>SUGARCANE RAW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUGARCANE_RAW_VALUE
	 * @generated
	 * @ordered
	 */
	SUGARCANE_RAW(17, "SUGARCANE_RAW", "\u0396\u0391\u03a7\u0391\u03a1\u0397 \u0391\u03a0\u039f \u0396\u0391\u03a7\u0391\u03a1\u039f\u039a\u0391\u039b\u0391\u039c\u039f \u0391\u039a\u0391\u03a4\u0395\u03a1\u0393\u0391\u03a3\u03a4\u0397"),

	/**
	 * The '<em><b>SUGAR WHITE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUGAR_WHITE_VALUE
	 * @generated
	 * @ordered
	 */
	SUGAR_WHITE(42, "SUGAR_WHITE", "\u0396\u0391\u03a7\u0391\u03a1\u0397 \u039b\u0395\u03a5\u039a\u0397 \u0391\u03a0\u039f \u0396\u0391\u03a7\u0391\u03a1\u039f\u03a4\u0395\u03a5\u03a4\u039b\u0391"),

	/**
	 * The '<em><b>SUGAR BROWN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUGAR_BROWN_VALUE
	 * @generated
	 * @ordered
	 */
	SUGAR_BROWN(60, "SUGAR_BROWN", "\u039a\u0391\u03a3\u03a4\u0391\u039d\u0397 \u0396\u0391\u03a7\u0391\u03a1\u0397"),

	/**
	 * The '<em><b>SYRUP GLUCOZE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYRUP_GLUCOZE_VALUE
	 * @generated
	 * @ordered
	 */
	SYRUP_GLUCOZE(255, "SYRUP_GLUCOZE", "\u03a3\u0399\u03a1\u039f\u03a0\u0399 \u0393\u039b\u03a5\u039a\u039f\u0396\u0397\u03a3"),

	/**
	 * The '<em><b>SYRUP SCENTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SYRUP_SCENTED_VALUE
	 * @generated
	 * @ordered
	 */
	SYRUP_SCENTED(254, "SYRUP_SCENTED", "\u03a3\u0399\u03a1\u039f\u03a0\u0399\u0391 \u0391\u03a0\u039f \u0396\u0391\u03a7\u0391\u03a1\u0391 \u0391\u03a1\u03a9\u039c\u0391\u03a4\u0399\u03a3\u039c\u0395\u039d\u0391"),

	/**
	 * The '<em><b>WHEAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEAT_VALUE
	 * @generated
	 * @ordered
	 */
	WHEAT(22, "WHEAT", "\u03a3\u0399\u03a4\u039f\u03a3"),

	/**
	 * The '<em><b>WHEAT FOR BREAD</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEAT_FOR_BREAD_VALUE
	 * @generated
	 * @ordered
	 */
	WHEAT_FOR_BREAD(333, "WHEAT_FOR_BREAD", "\u03a3\u0399\u03a4\u0391\u03a1\u0399 \u03a3\u039a\u039b\u0397\u03a1\u039f \u039a\u0391\u0399 \u039c\u0391\u039b\u0391\u039a\u039f \u0391\u03a1\u03a4\u039f\u03a0\u039f\u0399\u0397\u039c\u0395\u039d\u039f"),

	/**
	 * The '<em><b>WHEAT DURUM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEAT_DURUM_VALUE
	 * @generated
	 * @ordered
	 */
	WHEAT_DURUM(32, "WHEAT_DURUM", "\u03a3\u0399\u03a4\u039f\u03a3 \u03a3\u039a\u039b\u0397\u03a1\u039f\u03a3"),

	/**
	 * The '<em><b>WHEAT SOFT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEAT_SOFT_VALUE
	 * @generated
	 * @ordered
	 */
	WHEAT_SOFT(21, "WHEAT_SOFT", "\u03a3\u0399\u03a4\u039f\u03a3 \u039c\u0391\u039b\u0391\u039a\u039f\u03a3"),

	/**
	 * The '<em><b>WHEAT FLOUR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEAT_FLOUR_VALUE
	 * @generated
	 * @ordered
	 */
	WHEAT_FLOUR(365, "WHEAT_FLOUR", "\u0391\u039b\u0395\u03a5\u03a1\u0399\u0391 \u03a3\u0399\u03a4\u0391\u03a1\u0399\u039f\u03a5"),

	/**
	 * The '<em><b>WHEAT SEEDS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WHEAT_SEEDS_VALUE
	 * @generated
	 * @ordered
	 */
	WHEAT_SEEDS(11, "WHEAT_SEEDS", "\u03a3\u03a0\u039f\u03a1\u039f\u0399 \u03a3\u0399\u03a4\u0397\u03a1\u03a9\u039d"),

	/**
	 * The '<em><b>VLACHOTYRI</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VLACHOTYRI_VALUE
	 * @generated
	 * @ordered
	 */
	VLACHOTYRI(27, "VLACHOTYRI", "\u0392\u039b\u0391\u03a7\u039f\u03a4\u03a5\u03a1\u0399"),

	/**
	 * The '<em><b>VIGLA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VIGLA_VALUE
	 * @generated
	 * @ordered
	 */
	VIGLA(0, "VIGLA", "\u03a6\u0395\u03a4\u0391 \u0392\u0399\u0393\u039b\u0391"),

	/**
	 * The '<em><b>OAT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OAT_VALUE
	 * @generated
	 * @ordered
	 */
	OAT(36, "OAT", "\u0392\u03a1\u03a9\u039c\u0397"),

	/**
	 * The '<em><b>FROZEN TURKEY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FROZEN_TURKEY_VALUE
	 * @generated
	 * @ordered
	 */
	FROZEN_TURKEY(37, "FROZEN_TURKEY", "\u0393\u0391\u039b\u039f\u03a0\u039f\u03a5\u039b\u0395\u03a3 \u039a\u0391\u03a4\u0395\u03a8\u03a5\u0393\u039c\u0395\u039d\u0395\u03a3"),

	/**
	 * The '<em><b>OLIVE KERNEL LIQUID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OLIVE_KERNEL_LIQUID_VALUE
	 * @generated
	 * @ordered
	 */
	OLIVE_KERNEL_LIQUID(41, "OLIVE_KERNEL_LIQUID", "\u0395\u039b\u0391\u0399\u039f\u03a0\u03a5\u03a1\u0397\u039d\u0391\u03a3 \u03a5\u0393\u03a1\u039f\u03a3"),

	/**
	 * The '<em><b>VEGETABLES DRY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #VEGETABLES_DRY_VALUE
	 * @generated
	 * @ordered
	 */
	VEGETABLES_DRY(69, "VEGETABLES_DRY", "\u039b\u0391\u03a7\u0391\u039d\u0399\u039a\u0391 \u039e\u0395\u03a1\u0391"),

	/**
	 * The '<em><b>SPOROI SITHRWN2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SPOROI_SITHRWN2_VALUE
	 * @generated
	 * @ordered
	 */
	SPOROI_SITHRWN2(550, "SPOROI_SITHRWN2", "\u03a3\u03a0\u039f\u03a1\u039f\u0399 \u03a3\u0399\u03a4\u0397\u03a1\u03a9\u039d-\u0396\u03a9\u039f\u03a4\u03a1\u039f\u03a6\u0395\u03a3"),

	/**
	 * The '<em><b>XORTONOMES</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XORTONOMES_VALUE
	 * @generated
	 * @ordered
	 */
	XORTONOMES(899, "XORTONOMES", "\u03a7\u039f\u03a1\u03a4\u039f\u039d\u039f\u039c\u0395\u03a3"),

	/**
	 * The '<em><b>XORTONOMES2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #XORTONOMES2_VALUE
	 * @generated
	 * @ordered
	 */
	XORTONOMES2(898, "XORTONOMES2", "\u03a7\u039f\u03a1\u03a4\u039f\u039d\u039f\u039c\u0395\u03a3-\u0396\u03a9\u039f\u03a4\u03a1\u039f\u03a6\u0395\u03a3");

	/**
	 * The '<em><b>ALCOHOLE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALCOHOLE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALCOHOLE
	 * @generated
	 * @ordered
	 */
	public static final int ALCOHOLE_VALUE = 4;

	/**
	 * The '<em><b>ALEVRA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ALEVRA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ALEVRA
	 * @generated
	 * @ordered
	 */
	public static final int ALEVRA_VALUE = 34;

	/**
	 * The '<em><b>ANIMAL FOOD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANIMAL FOOD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANIMAL_FOOD
	 * @generated
	 * @ordered
	 */
	public static final int ANIMAL_FOOD_VALUE = 12;

	/**
	 * The '<em><b>ANIMAL FOOD2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANIMAL FOOD2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANIMAL_FOOD2
	 * @generated
	 * @ordered
	 */
	public static final int ANIMAL_FOOD2_VALUE = 190;

	/**
	 * The '<em><b>ANIMAL FOOD WHEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANIMAL FOOD WHEAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANIMAL_FOOD_WHEAT
	 * @generated
	 * @ordered
	 */
	public static final int ANIMAL_FOOD_WHEAT_VALUE = 50;

	/**
	 * The '<em><b>ANIMAL FOOD REMAINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ANIMAL FOOD REMAINS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANIMAL_FOOD_REMAINS
	 * @generated
	 * @ordered
	 */
	public static final int ANIMAL_FOOD_REMAINS_VALUE = 777;

	/**
	 * The '<em><b>BARLEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BARLEY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BARLEY
	 * @generated
	 * @ordered
	 */
	public static final int BARLEY_VALUE = 30;

	/**
	 * The '<em><b>BEEF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEEF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEEF
	 * @generated
	 * @ordered
	 */
	public static final int BEEF_VALUE = 28;

	/**
	 * The '<em><b>BEEF FROZEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEEF FROZEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEEF_FROZEN
	 * @generated
	 * @ordered
	 */
	public static final int BEEF_FROZEN_VALUE = 280;

	/**
	 * The '<em><b>BEEF FROZEN2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEEF FROZEN2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEEF_FROZEN2
	 * @generated
	 * @ordered
	 */
	public static final int BEEF_FROZEN2_VALUE = 281;

	/**
	 * The '<em><b>BEEF NO BONES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEEF NO BONES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEEF_NO_BONES
	 * @generated
	 * @ordered
	 */
	public static final int BEEF_NO_BONES_VALUE = 290;

	/**
	 * The '<em><b>BEEF FROZEN3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEEF FROZEN3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEEF_FROZEN3
	 * @generated
	 * @ordered
	 */
	public static final int BEEF_FROZEN3_VALUE = 289;

	/**
	 * The '<em><b>BEEF FRESH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>BEEF FRESH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BEEF_FRESH
	 * @generated
	 * @ordered
	 */
	public static final int BEEF_FRESH_VALUE = 288;

	/**
	 * The '<em><b>CEREAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CEREAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CEREAL
	 * @generated
	 * @ordered
	 */
	public static final int CEREAL_VALUE = 1;

	/**
	 * The '<em><b>CHEESE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHEESE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHEESE
	 * @generated
	 * @ordered
	 */
	public static final int CHEESE_VALUE = 9;

	/**
	 * The '<em><b>CHEESE WHITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHEESE WHITE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHEESE_WHITE
	 * @generated
	 * @ordered
	 */
	public static final int CHEESE_WHITE_VALUE = 99;

	/**
	 * The '<em><b>CHEESE HARD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHEESE HARD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHEESE_HARD
	 * @generated
	 * @ordered
	 */
	public static final int CHEESE_HARD_VALUE = 133;

	/**
	 * The '<em><b>CHEESE2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHEESE2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHEESE2
	 * @generated
	 * @ordered
	 */
	public static final int CHEESE2_VALUE = 845;

	/**
	 * The '<em><b>COTTON PIE REMAINS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COTTON PIE REMAINS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COTTON_PIE_REMAINS
	 * @generated
	 * @ordered
	 */
	public static final int COTTON_PIE_REMAINS_VALUE = 930;

	/**
	 * The '<em><b>CHICKEN FROZEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CHICKEN FROZEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHICKEN_FROZEN
	 * @generated
	 * @ordered
	 */
	public static final int CHICKEN_FROZEN_VALUE = 301;

	/**
	 * The '<em><b>CORN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORN
	 * @generated
	 * @ordered
	 */
	public static final int CORN_VALUE = 18;

	/**
	 * The '<em><b>CORN2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORN2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORN2
	 * @generated
	 * @ordered
	 */
	public static final int CORN2_VALUE = 200;

	/**
	 * The '<em><b>CORN FOR POP CORN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORN FOR POP CORN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORN_FOR_POP_CORN
	 * @generated
	 * @ordered
	 */
	public static final int CORN_FOR_POP_CORN_VALUE = 16;

	/**
	 * The '<em><b>CORN GLUTENE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORN GLUTENE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORN_GLUTENE
	 * @generated
	 * @ordered
	 */
	public static final int CORN_GLUTENE_VALUE = 20;

	/**
	 * The '<em><b>CORN GLUTENE2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CORN GLUTENE2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CORN_GLUTENE2
	 * @generated
	 * @ordered
	 */
	public static final int CORN_GLUTENE2_VALUE = 500;

	/**
	 * The '<em><b>DAIRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>DAIRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DAIRY
	 * @generated
	 * @ordered
	 */
	public static final int DAIRY_VALUE = 3;

	/**
	 * The '<em><b>ETHANOL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ETHANOL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ETHANOL
	 * @generated
	 * @ordered
	 */
	public static final int ETHANOL_VALUE = 35;

	/**
	 * The '<em><b>FLOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FLOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FLOUR
	 * @generated
	 * @ordered
	 */
	public static final int FLOUR_VALUE = 10;

	/**
	 * The '<em><b>FETA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FETA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FETA
	 * @generated
	 * @ordered
	 */
	public static final int FETA_VALUE = 15;

	/**
	 * The '<em><b>FETA CHEESE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FETA CHEESE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FETA_CHEESE
	 * @generated
	 * @ordered
	 */
	public static final int FETA_CHEESE_VALUE = 33;

	/**
	 * The '<em><b>GARLIC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GARLIC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GARLIC
	 * @generated
	 * @ordered
	 */
	public static final int GARLIC_VALUE = 277;

	/**
	 * The '<em><b>GARLIC FRESH</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GARLIC FRESH</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GARLIC_FRESH
	 * @generated
	 * @ordered
	 */
	public static final int GARLIC_FRESH_VALUE = 276;

	/**
	 * The '<em><b>GARLIC POWDER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GARLIC POWDER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GARLIC_POWDER
	 * @generated
	 * @ordered
	 */
	public static final int GARLIC_POWDER_VALUE = 19;

	/**
	 * The '<em><b>GARLIC DEHYDRATED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GARLIC DEHYDRATED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GARLIC_DEHYDRATED
	 * @generated
	 * @ordered
	 */
	public static final int GARLIC_DEHYDRATED_VALUE = 400;

	/**
	 * The '<em><b>GARLIC3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GARLIC3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GARLIC3
	 * @generated
	 * @ordered
	 */
	public static final int GARLIC3_VALUE = 275;

	/**
	 * The '<em><b>GARLIC DRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GARLIC DRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GARLIC_DRY
	 * @generated
	 * @ordered
	 */
	public static final int GARLIC_DRY_VALUE = 270;

	/**
	 * The '<em><b>GARLIC DRY2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GARLIC DRY2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GARLIC_DRY2
	 * @generated
	 * @ordered
	 */
	public static final int GARLIC_DRY2_VALUE = 95;

	/**
	 * The '<em><b>GLYCOZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GLYCOZE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GLYCOZE
	 * @generated
	 * @ordered
	 */
	public static final int GLYCOZE_VALUE = 450;

	/**
	 * The '<em><b>GRAVIERA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GRAVIERA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GRAVIERA
	 * @generated
	 * @ordered
	 */
	public static final int GRAVIERA_VALUE = 40;

	/**
	 * The '<em><b>GLUTENE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GLUTENE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GLUTENE
	 * @generated
	 * @ordered
	 */
	public static final int GLUTENE_VALUE = 29;

	/**
	 * The '<em><b>KEFALOGRAVIERA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEFALOGRAVIERA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEFALOGRAVIERA
	 * @generated
	 * @ordered
	 */
	public static final int KEFALOGRAVIERA_VALUE = 23;

	/**
	 * The '<em><b>KEFALOTYRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>KEFALOTYRI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #KEFALOTYRI
	 * @generated
	 * @ordered
	 */
	public static final int KEFALOTYRI_VALUE = 14;

	/**
	 * The '<em><b>MEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MEAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEAT
	 * @generated
	 * @ordered
	 */
	public static final int MEAT_VALUE = 0;

	/**
	 * The '<em><b>MANOYRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MANOYRI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MANOYRI
	 * @generated
	 * @ordered
	 */
	public static final int MANOYRI_VALUE = 0;

	/**
	 * The '<em><b>MUSHROOMS2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MUSHROOMS2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUSHROOMS2
	 * @generated
	 * @ordered
	 */
	public static final int MUSHROOMS2_VALUE = 98;

	/**
	 * The '<em><b>MUSHROOMS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MUSHROOMS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MUSHROOMS
	 * @generated
	 * @ordered
	 */
	public static final int MUSHROOMS_VALUE = 6;

	/**
	 * The '<em><b>MYZHTHRA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MYZHTHRA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MYZHTHRA
	 * @generated
	 * @ordered
	 */
	public static final int MYZHTHRA_VALUE = 585;

	/**
	 * The '<em><b>MYZHTRA DRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>MYZHTRA DRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MYZHTRA_DRY
	 * @generated
	 * @ordered
	 */
	public static final int MYZHTRA_DRY_VALUE = 93;

	/**
	 * The '<em><b>OLIVEOIL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OLIVEOIL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OLIVEOIL
	 * @generated
	 * @ordered
	 */
	public static final int OLIVEOIL_VALUE = 7;

	/**
	 * The '<em><b>PASTA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PASTA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PASTA
	 * @generated
	 * @ordered
	 */
	public static final int PASTA_VALUE = 8;

	/**
	 * The '<em><b>POP CORN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>POP CORN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POP_CORN
	 * @generated
	 * @ordered
	 */
	public static final int POP_CORN_VALUE = 24;

	/**
	 * The '<em><b>PITYRA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PITYRA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PITYRA
	 * @generated
	 * @ordered
	 */
	public static final int PITYRA_VALUE = 180;

	/**
	 * The '<em><b>RICE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RICE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RICE
	 * @generated
	 * @ordered
	 */
	public static final int RICE_VALUE = 2;

	/**
	 * The '<em><b>RICE BASMATI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RICE BASMATI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RICE_BASMATI
	 * @generated
	 * @ordered
	 */
	public static final int RICE_BASMATI_VALUE = 139;

	/**
	 * The '<em><b>RICE JASMINE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RICE JASMINE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RICE_JASMINE
	 * @generated
	 * @ordered
	 */
	public static final int RICE_JASMINE_VALUE = 170;

	/**
	 * The '<em><b>RICE WHITENED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RICE WHITENED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RICE_WHITENED
	 * @generated
	 * @ordered
	 */
	public static final int RICE_WHITENED_VALUE = 140;

	/**
	 * The '<em><b>RICE PARTS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RICE PARTS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RICE_PARTS
	 * @generated
	 * @ordered
	 */
	public static final int RICE_PARTS_VALUE = 59;

	/**
	 * The '<em><b>RICE GRAINS WHITENED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RICE GRAINS WHITENED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RICE_GRAINS_WHITENED
	 * @generated
	 * @ordered
	 */
	public static final int RICE_GRAINS_WHITENED_VALUE = 25;

	/**
	 * The '<em><b>RICE MEDIUM WHITENED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RICE MEDIUM WHITENED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RICE_MEDIUM_WHITENED
	 * @generated
	 * @ordered
	 */
	public static final int RICE_MEDIUM_WHITENED_VALUE = 26;

	/**
	 * The '<em><b>RYE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>RYE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RYE
	 * @generated
	 * @ordered
	 */
	public static final int RYE_VALUE = 31;

	/**
	 * The '<em><b>SOFT FLOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOFT FLOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFT_FLOUR
	 * @generated
	 * @ordered
	 */
	public static final int SOFT_FLOUR_VALUE = 13;

	/**
	 * The '<em><b>SOFT FLOUR2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOFT FLOUR2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFT_FLOUR2
	 * @generated
	 * @ordered
	 */
	public static final int SOFT_FLOUR2_VALUE = 360;

	/**
	 * The '<em><b>SOFT FLOUR3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOFT FLOUR3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOFT_FLOUR3
	 * @generated
	 * @ordered
	 */
	public static final int SOFT_FLOUR3_VALUE = 361;

	/**
	 * The '<em><b>SOYA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SOYA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOYA
	 * @generated
	 * @ordered
	 */
	public static final int SOYA_VALUE = 366;

	/**
	 * The '<em><b>SORGOS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SORGOS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SORGOS
	 * @generated
	 * @ordered
	 */
	public static final int SORGOS_VALUE = 800;

	/**
	 * The '<em><b>SUGAR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUGAR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUGAR
	 * @generated
	 * @ordered
	 */
	public static final int SUGAR_VALUE = 5;

	/**
	 * The '<em><b>SUGARCANE RAW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUGARCANE RAW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUGARCANE_RAW
	 * @generated
	 * @ordered
	 */
	public static final int SUGARCANE_RAW_VALUE = 17;

	/**
	 * The '<em><b>SUGAR WHITE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUGAR WHITE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUGAR_WHITE
	 * @generated
	 * @ordered
	 */
	public static final int SUGAR_WHITE_VALUE = 42;

	/**
	 * The '<em><b>SUGAR BROWN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUGAR BROWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUGAR_BROWN
	 * @generated
	 * @ordered
	 */
	public static final int SUGAR_BROWN_VALUE = 60;

	/**
	 * The '<em><b>SYRUP GLUCOZE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYRUP GLUCOZE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYRUP_GLUCOZE
	 * @generated
	 * @ordered
	 */
	public static final int SYRUP_GLUCOZE_VALUE = 255;

	/**
	 * The '<em><b>SYRUP SCENTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SYRUP SCENTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SYRUP_SCENTED
	 * @generated
	 * @ordered
	 */
	public static final int SYRUP_SCENTED_VALUE = 254;

	/**
	 * The '<em><b>WHEAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHEAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEAT
	 * @generated
	 * @ordered
	 */
	public static final int WHEAT_VALUE = 22;

	/**
	 * The '<em><b>WHEAT FOR BREAD</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHEAT FOR BREAD</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEAT_FOR_BREAD
	 * @generated
	 * @ordered
	 */
	public static final int WHEAT_FOR_BREAD_VALUE = 333;

	/**
	 * The '<em><b>WHEAT DURUM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHEAT DURUM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEAT_DURUM
	 * @generated
	 * @ordered
	 */
	public static final int WHEAT_DURUM_VALUE = 32;

	/**
	 * The '<em><b>WHEAT SOFT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHEAT SOFT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEAT_SOFT
	 * @generated
	 * @ordered
	 */
	public static final int WHEAT_SOFT_VALUE = 21;

	/**
	 * The '<em><b>WHEAT FLOUR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHEAT FLOUR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEAT_FLOUR
	 * @generated
	 * @ordered
	 */
	public static final int WHEAT_FLOUR_VALUE = 365;

	/**
	 * The '<em><b>WHEAT SEEDS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>WHEAT SEEDS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WHEAT_SEEDS
	 * @generated
	 * @ordered
	 */
	public static final int WHEAT_SEEDS_VALUE = 11;

	/**
	 * The '<em><b>VLACHOTYRI</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VLACHOTYRI</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VLACHOTYRI
	 * @generated
	 * @ordered
	 */
	public static final int VLACHOTYRI_VALUE = 27;

	/**
	 * The '<em><b>VIGLA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VIGLA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VIGLA
	 * @generated
	 * @ordered
	 */
	public static final int VIGLA_VALUE = 0;

	/**
	 * The '<em><b>OAT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OAT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OAT
	 * @generated
	 * @ordered
	 */
	public static final int OAT_VALUE = 36;

	/**
	 * The '<em><b>FROZEN TURKEY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FROZEN TURKEY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FROZEN_TURKEY
	 * @generated
	 * @ordered
	 */
	public static final int FROZEN_TURKEY_VALUE = 37;

	/**
	 * The '<em><b>OLIVE KERNEL LIQUID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OLIVE KERNEL LIQUID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OLIVE_KERNEL_LIQUID
	 * @generated
	 * @ordered
	 */
	public static final int OLIVE_KERNEL_LIQUID_VALUE = 41;

	/**
	 * The '<em><b>VEGETABLES DRY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VEGETABLES DRY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #VEGETABLES_DRY
	 * @generated
	 * @ordered
	 */
	public static final int VEGETABLES_DRY_VALUE = 69;

	/**
	 * The '<em><b>SPOROI SITHRWN2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SPOROI SITHRWN2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPOROI_SITHRWN2
	 * @generated
	 * @ordered
	 */
	public static final int SPOROI_SITHRWN2_VALUE = 550;

	/**
	 * The '<em><b>XORTONOMES</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XORTONOMES</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XORTONOMES
	 * @generated
	 * @ordered
	 */
	public static final int XORTONOMES_VALUE = 899;

	/**
	 * The '<em><b>XORTONOMES2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>XORTONOMES2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #XORTONOMES2
	 * @generated
	 * @ordered
	 */
	public static final int XORTONOMES2_VALUE = 898;

	/**
	 * An array of all the '<em><b>Agrix Product Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AgrixProductTypes[] VALUES_ARRAY =
		new AgrixProductTypes[] {
			ALCOHOLE,
			ALEVRA,
			ANIMAL_FOOD,
			ANIMAL_FOOD2,
			ANIMAL_FOOD_WHEAT,
			ANIMAL_FOOD_REMAINS,
			BARLEY,
			BEEF,
			BEEF_FROZEN,
			BEEF_FROZEN2,
			BEEF_NO_BONES,
			BEEF_FROZEN3,
			BEEF_FRESH,
			CEREAL,
			CHEESE,
			CHEESE_WHITE,
			CHEESE_HARD,
			CHEESE2,
			COTTON_PIE_REMAINS,
			CHICKEN_FROZEN,
			CORN,
			CORN2,
			CORN_FOR_POP_CORN,
			CORN_GLUTENE,
			CORN_GLUTENE2,
			DAIRY,
			ETHANOL,
			FLOUR,
			FETA,
			FETA_CHEESE,
			GARLIC,
			GARLIC_FRESH,
			GARLIC_POWDER,
			GARLIC_DEHYDRATED,
			GARLIC3,
			GARLIC_DRY,
			GARLIC_DRY2,
			GLYCOZE,
			GRAVIERA,
			GLUTENE,
			KEFALOGRAVIERA,
			KEFALOTYRI,
			MEAT,
			MANOYRI,
			MUSHROOMS2,
			MUSHROOMS,
			MYZHTHRA,
			MYZHTRA_DRY,
			OLIVEOIL,
			PASTA,
			POP_CORN,
			PITYRA,
			RICE,
			RICE_BASMATI,
			RICE_JASMINE,
			RICE_WHITENED,
			RICE_PARTS,
			RICE_GRAINS_WHITENED,
			RICE_MEDIUM_WHITENED,
			RYE,
			SOFT_FLOUR,
			SOFT_FLOUR2,
			SOFT_FLOUR3,
			SOYA,
			SORGOS,
			SUGAR,
			SUGARCANE_RAW,
			SUGAR_WHITE,
			SUGAR_BROWN,
			SYRUP_GLUCOZE,
			SYRUP_SCENTED,
			WHEAT,
			WHEAT_FOR_BREAD,
			WHEAT_DURUM,
			WHEAT_SOFT,
			WHEAT_FLOUR,
			WHEAT_SEEDS,
			VLACHOTYRI,
			VIGLA,
			OAT,
			FROZEN_TURKEY,
			OLIVE_KERNEL_LIQUID,
			VEGETABLES_DRY,
			SPOROI_SITHRWN2,
			XORTONOMES,
			XORTONOMES2,
		};

	/**
	 * A public read-only list of all the '<em><b>Agrix Product Types</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AgrixProductTypes> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Agrix Product Types</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AgrixProductTypes get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AgrixProductTypes result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Agrix Product Types</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AgrixProductTypes getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AgrixProductTypes result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Agrix Product Types</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AgrixProductTypes get(int value) {
		switch (value) {
			case ALCOHOLE_VALUE: return ALCOHOLE;
			case ALEVRA_VALUE: return ALEVRA;
			case ANIMAL_FOOD_VALUE: return ANIMAL_FOOD;
			case ANIMAL_FOOD2_VALUE: return ANIMAL_FOOD2;
			case ANIMAL_FOOD_WHEAT_VALUE: return ANIMAL_FOOD_WHEAT;
			case ANIMAL_FOOD_REMAINS_VALUE: return ANIMAL_FOOD_REMAINS;
			case BARLEY_VALUE: return BARLEY;
			case BEEF_VALUE: return BEEF;
			case BEEF_FROZEN_VALUE: return BEEF_FROZEN;
			case BEEF_FROZEN2_VALUE: return BEEF_FROZEN2;
			case BEEF_NO_BONES_VALUE: return BEEF_NO_BONES;
			case BEEF_FROZEN3_VALUE: return BEEF_FROZEN3;
			case BEEF_FRESH_VALUE: return BEEF_FRESH;
			case CEREAL_VALUE: return CEREAL;
			case CHEESE_VALUE: return CHEESE;
			case CHEESE_WHITE_VALUE: return CHEESE_WHITE;
			case CHEESE_HARD_VALUE: return CHEESE_HARD;
			case CHEESE2_VALUE: return CHEESE2;
			case COTTON_PIE_REMAINS_VALUE: return COTTON_PIE_REMAINS;
			case CHICKEN_FROZEN_VALUE: return CHICKEN_FROZEN;
			case CORN_VALUE: return CORN;
			case CORN2_VALUE: return CORN2;
			case CORN_FOR_POP_CORN_VALUE: return CORN_FOR_POP_CORN;
			case CORN_GLUTENE_VALUE: return CORN_GLUTENE;
			case CORN_GLUTENE2_VALUE: return CORN_GLUTENE2;
			case DAIRY_VALUE: return DAIRY;
			case ETHANOL_VALUE: return ETHANOL;
			case FLOUR_VALUE: return FLOUR;
			case FETA_VALUE: return FETA;
			case FETA_CHEESE_VALUE: return FETA_CHEESE;
			case GARLIC_VALUE: return GARLIC;
			case GARLIC_FRESH_VALUE: return GARLIC_FRESH;
			case GARLIC_POWDER_VALUE: return GARLIC_POWDER;
			case GARLIC_DEHYDRATED_VALUE: return GARLIC_DEHYDRATED;
			case GARLIC3_VALUE: return GARLIC3;
			case GARLIC_DRY_VALUE: return GARLIC_DRY;
			case GARLIC_DRY2_VALUE: return GARLIC_DRY2;
			case GLYCOZE_VALUE: return GLYCOZE;
			case GRAVIERA_VALUE: return GRAVIERA;
			case GLUTENE_VALUE: return GLUTENE;
			case KEFALOGRAVIERA_VALUE: return KEFALOGRAVIERA;
			case KEFALOTYRI_VALUE: return KEFALOTYRI;
			case MEAT_VALUE: return MEAT;
			case MUSHROOMS2_VALUE: return MUSHROOMS2;
			case MUSHROOMS_VALUE: return MUSHROOMS;
			case MYZHTHRA_VALUE: return MYZHTHRA;
			case MYZHTRA_DRY_VALUE: return MYZHTRA_DRY;
			case OLIVEOIL_VALUE: return OLIVEOIL;
			case PASTA_VALUE: return PASTA;
			case POP_CORN_VALUE: return POP_CORN;
			case PITYRA_VALUE: return PITYRA;
			case RICE_VALUE: return RICE;
			case RICE_BASMATI_VALUE: return RICE_BASMATI;
			case RICE_JASMINE_VALUE: return RICE_JASMINE;
			case RICE_WHITENED_VALUE: return RICE_WHITENED;
			case RICE_PARTS_VALUE: return RICE_PARTS;
			case RICE_GRAINS_WHITENED_VALUE: return RICE_GRAINS_WHITENED;
			case RICE_MEDIUM_WHITENED_VALUE: return RICE_MEDIUM_WHITENED;
			case RYE_VALUE: return RYE;
			case SOFT_FLOUR_VALUE: return SOFT_FLOUR;
			case SOFT_FLOUR2_VALUE: return SOFT_FLOUR2;
			case SOFT_FLOUR3_VALUE: return SOFT_FLOUR3;
			case SOYA_VALUE: return SOYA;
			case SORGOS_VALUE: return SORGOS;
			case SUGAR_VALUE: return SUGAR;
			case SUGARCANE_RAW_VALUE: return SUGARCANE_RAW;
			case SUGAR_WHITE_VALUE: return SUGAR_WHITE;
			case SUGAR_BROWN_VALUE: return SUGAR_BROWN;
			case SYRUP_GLUCOZE_VALUE: return SYRUP_GLUCOZE;
			case SYRUP_SCENTED_VALUE: return SYRUP_SCENTED;
			case WHEAT_VALUE: return WHEAT;
			case WHEAT_FOR_BREAD_VALUE: return WHEAT_FOR_BREAD;
			case WHEAT_DURUM_VALUE: return WHEAT_DURUM;
			case WHEAT_SOFT_VALUE: return WHEAT_SOFT;
			case WHEAT_FLOUR_VALUE: return WHEAT_FLOUR;
			case WHEAT_SEEDS_VALUE: return WHEAT_SEEDS;
			case VLACHOTYRI_VALUE: return VLACHOTYRI;
			case OAT_VALUE: return OAT;
			case FROZEN_TURKEY_VALUE: return FROZEN_TURKEY;
			case OLIVE_KERNEL_LIQUID_VALUE: return OLIVE_KERNEL_LIQUID;
			case VEGETABLES_DRY_VALUE: return VEGETABLES_DRY;
			case SPOROI_SITHRWN2_VALUE: return SPOROI_SITHRWN2;
			case XORTONOMES_VALUE: return XORTONOMES;
			case XORTONOMES2_VALUE: return XORTONOMES2;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AgrixProductTypes(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AgrixProductTypes
