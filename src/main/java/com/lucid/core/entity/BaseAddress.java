/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.entity;

import com.lucid.core.embeddable.DateTimePeriod;
import com.lucid.core.embeddable.GeoCode;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 11-Feb-2023 4:36:17 pm
 *
 */
@MappedSuperclass
public abstract class BaseAddress extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 8645126601118295467L;

  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // Provide description for particular communication item
  @Column(name = "name", nullable = true, length = 50)
  private String name;

  // Code identifying the usage of the contact point e.g. business, private, etc.
  @Column(name = "use_code", nullable = true, length = 25)
  private String useCode;

  // Provide priority for given communication item
  @Column(name = "preference", nullable = true)
  private Integer preference;

  @Column(name = "address1", nullable = true, length = 100)
  private String address1;

  @Column(name = "address2", nullable = true, length = 100)
  private String address2;

  @Column(name = "address3", nullable = true, length = 100)
  private String address3;

  @Column(name = "address4", nullable = true, length = 100)
  private String address4;

  @Column(name = "address5", nullable = true, length = 100)
  private String address5;

  @Column(name = "city", nullable = true, length = 100)
  private String city;

  @Column(name = "postal_code", nullable = true, length = 25)
  private String postalCode;

  @Column(name = "post_office_box", nullable = true, length = 15)
  private String postOfficeBox;

  @Column(name = "cntry_code", nullable = true, length = 15)
  private String countryCode;


  @Embedded
  private DateTimePeriod availablePeriod;

  @Embedded
  private GeoCode geoCode;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BaseAddress</code>
   */
  public BaseAddress() {
    super();
  }

  // ---------------------------------------------------------- Public Methods

  /**
   * @return Returns the name.
   */
  public String getName() {
    return name;
  }


  /**
   * @param name The name to set.
   */
  public void setName(String name) {
    this.name = name;
  }


  /**
   * @return Returns the useCode.
   */
  public String getUseCode() {
    return useCode;
  }


  /**
   * @param useCode The useCode to set.
   */
  public void setUseCode(String useCode) {
    this.useCode = useCode;
  }


  /**
   * @return Returns the preference.
   */
  public Integer getPreference() {
    return preference;
  }


  /**
   * @param preference The preference to set.
   */
  public void setPreference(Integer preference) {
    this.preference = preference;
  }


  /**
   * @return Returns the address1.
   */
  public String getAddress1() {
    return address1;
  }


  /**
   * @param address1 The address1 to set.
   */
  public void setAddress1(String address1) {
    this.address1 = address1;
  }


  /**
   * @return Returns the address2.
   */
  public String getAddress2() {
    return address2;
  }


  /**
   * @param address2 The address2 to set.
   */
  public void setAddress2(String address2) {
    this.address2 = address2;
  }


  /**
   * @return Returns the address3.
   */
  public String getAddress3() {
    return address3;
  }


  /**
   * @param address3 The address3 to set.
   */
  public void setAddress3(String address3) {
    this.address3 = address3;
  }


  /**
   * @return Returns the address4.
   */
  public String getAddress4() {
    return address4;
  }


  /**
   * @param address4 The address4 to set.
   */
  public void setAddress4(String address4) {
    this.address4 = address4;
  }


  /**
   * @return Returns the address5.
   */
  public String getAddress5() {
    return address5;
  }


  /**
   * @param address5 The address5 to set.
   */
  public void setAddress5(String address5) {
    this.address5 = address5;
  }


  /**
   * @return Returns the city.
   */
  public String getCity() {
    return city;
  }


  /**
   * @param city The city to set.
   */
  public void setCity(String city) {
    this.city = city;
  }


  /**
   * @return Returns the postalCode.
   */
  public String getPostalCode() {
    return postalCode;
  }


  /**
   * @param postalCode The postalCode to set.
   */
  public void setPostalCode(String postalCode) {
    this.postalCode = postalCode;
  }


  /**
   * @return Returns the postOfficeBox.
   */
  public String getPostOfficeBox() {
    return postOfficeBox;
  }


  /**
   * @param postOfficeBox The postOfficeBox to set.
   */
  public void setPostOfficeBox(String postOfficeBox) {
    this.postOfficeBox = postOfficeBox;
  }


  /**
   * @return Returns the availablePeriod.
   */
  public DateTimePeriod getAvailablePeriod() {
    return availablePeriod;
  }


  /**
   * @param availablePeriod The availablePeriod to set.
   */
  public void setAvailablePeriod(DateTimePeriod availablePeriod) {
    this.availablePeriod = availablePeriod;
  }


  /**
   * @return Returns the geoCode.
   */
  public GeoCode getGeoCode() {
    return geoCode;
  }


  /**
   * @param geoCode The geoCode to set.
   */
  public void setGeoCode(GeoCode geoCode) {
    this.geoCode = geoCode;
  }

  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
