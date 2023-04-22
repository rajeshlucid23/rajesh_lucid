/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.core.embeddable;

import java.math.BigDecimal;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

/**
 * 
 * An amount is a number of monetary units specified in a currency.
 * 
 * @author sgutti
 * @date 25-Feb-2023 1:50:15 pm
 *
 */
@Embeddable
public class Amount {

  // --------------------------------------------------------------- Constants
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  // The value of the amount.
  @Column(name = "amt_value", nullable = true)
  private BigDecimal amountValue;

  // The currency of the amount.
  @Column(name = "amt_crncy", nullable = true, length = 3)
  private String amountCurrency;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>Amount</code>
   */
  public Amount() {
    super();
  }

  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
