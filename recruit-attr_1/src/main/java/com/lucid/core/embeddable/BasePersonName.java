/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.embeddable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * A component for capturing summary or fine-grain data comprising a person's name.
 * 
 * @author sgutti
 * @date 21-Jan-2023 12:08:58 am
 */
@Embeddable
public class BasePersonName {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Column(name = "formatted_name", nullable = true, length = 200)
  private String formattedName;

  @Column(name = "legal_name", nullable = true, length = 200)
  private String legalName;

  @Column(name = "given_name", nullable = true, length = 100)
  private String givenName;

  @Column(name = "preferred_name", nullable = true, length = 200)
  private String preferredName;

  @Column(name = "middle_name", nullable = true, length = 100)
  private String middleName;

  @Column(name = "family", nullable = true, length = 50)
  private String family;

  @Column(name = "family_prefix", nullable = true, length = 25)
  private String familyPrefix;

  @Column(name = "alias", nullable = true, length = 100)
  private String alais;

  @Column(name = "preferred_salutation_code", nullable = true, length = 25)
  private String preferredSalutationCode;

  @Column(name = "generation_affix_code", nullable = true, length = 25)
  private String generationAffixCode;

  @Column(name = "qualification_affix_code", nullable = true, length = 25)
  private String qualificationAffixCode;

  @Column(name = "title_affix_code", nullable = true, length = 25)
  private String titleAffixCode;

  @Column(name = "initials", nullable = true, length = 50)
  private String initials;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BasePersonName</code>
   */
  public BasePersonName() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  /**
   * @return Returns the formattedName.
   */
  public String getFormattedName() {
    return formattedName;
  }

  /**
   * @param formattedName The formattedName to set.
   */
  public void setFormattedName(String formattedName) {
    this.formattedName = formattedName;
  }

  /**
   * @return Returns the legalName.
   */
  public String getLegalName() {
    return legalName;
  }

  /**
   * @param legalName The legalName to set.
   */
  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }

  /**
   * @return Returns the givenName.
   */
  public String getGivenName() {
    return givenName;
  }

  /**
   * @param givenName The givenName to set.
   */
  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  /**
   * @return Returns the preferredName.
   */
  public String getPreferredName() {
    return preferredName;
  }

  /**
   * @param preferredName The preferredName to set.
   */
  public void setPreferredName(String preferredName) {
    this.preferredName = preferredName;
  }

  /**
   * @return Returns the middleName.
   */
  public String getMiddleName() {
    return middleName;
  }

  /**
   * @param middleName The middleName to set.
   */
  public void setMiddleName(String middleName) {
    this.middleName = middleName;
  }

  /**
   * @return Returns the family.
   */
  public String getFamily() {
    return family;
  }

  /**
   * @param family The family to set.
   */
  public void setFamily(String family) {
    this.family = family;
  }

  /**
   * @return Returns the familyPrefix.
   */
  public String getFamilyPrefix() {
    return familyPrefix;
  }

  /**
   * @param familyPrefix The familyPrefix to set.
   */
  public void setFamilyPrefix(String familyPrefix) {
    this.familyPrefix = familyPrefix;
  }

  /**
   * @return Returns the alais.
   */
  public String getAlais() {
    return alais;
  }

  /**
   * @param alais The alais to set.
   */
  public void setAlais(String alais) {
    this.alais = alais;
  }

  /**
   * @return Returns the preferredSalutationCode.
   */
  public String getPreferredSalutationCode() {
    return preferredSalutationCode;
  }

  /**
   * @param preferredSalutationCode The preferredSalutationCode to set.
   */
  public void setPreferredSalutationCode(String preferredSalutationCode) {
    this.preferredSalutationCode = preferredSalutationCode;
  }

  /**
   * @return Returns the generationAffixCode.
   */
  public String getGenerationAffixCode() {
    return generationAffixCode;
  }

  /**
   * @param generationAffixCode The generationAffixCode to set.
   */
  public void setGenerationAffixCode(String generationAffixCode) {
    this.generationAffixCode = generationAffixCode;
  }

  /**
   * @return Returns the qualificationAffixCode.
   */
  public String getQualificationAffixCode() {
    return qualificationAffixCode;
  }

  /**
   * @param qualificationAffixCode The qualificationAffixCode to set.
   */
  public void setQualificationAffixCode(String qualificationAffixCode) {
    this.qualificationAffixCode = qualificationAffixCode;
  }

  /**
   * @return Returns the titleAffixCode.
   */
  public String getTitleAffixCode() {
    return titleAffixCode;
  }

  /**
   * @param titleAffixCode The titleAffixCode to set.
   */
  public void setTitleAffixCode(String titleAffixCode) {
    this.titleAffixCode = titleAffixCode;
  }

  /**
   * @return Returns the initials.
   */
  public String getInitials() {
    return initials;
  }

  /**
   * @param initials The initials to set.
   */
  public void setInitials(String initials) {
    this.initials = initials;
  }
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
