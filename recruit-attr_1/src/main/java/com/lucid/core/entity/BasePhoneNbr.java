/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * @author sgutti
 * @date 11-Feb-2023 4:57:33 pm
 *
 */
@MappedSuperclass
public abstract class BasePhoneNbr extends BaseEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -6475608104948467200L;
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // The country dialing code for a communication number.
  @Column(name = "cntry_dialing_code", nullable = true, length = 5)
  private String countryDialingCode;

  // The area dialing code for a communication number.
  @Column(name = "area_dialing_code", nullable = true, length = 5)
  private String areaDialingCode;


  // The communication number, not including country dialing or area dialing codes.
  @Column(name = "dial_number", nullable = false, length = 10)
  private String dialNumber;

  // The extension of the associated communication number.
  @Column(name = "phone_extn", nullable = true, length = 5)
  private String phoneExtension;

  // The text that permits access to the electronic network of the associated communication number
  // such as telephone network, for example 9, *70.
  @Column(name = "access", nullable = true, length = 10)
  private String access;


  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>BasePhoneNbr</code>
   */
  public BasePhoneNbr() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
