/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.entity;

import com.lucid.core.entity.AuditableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 04-Feb-2023 2:59:25 pm
 */
@Entity
@Table(name = AttributeRegxValue.TABLE_NAME)
public class AttributeRegxValue extends AuditableEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = -7638335243565202211L;
  public static final String TABLE_NAME = "t_attr_regx_value";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @Column(name = "attr_def_id", nullable = false)
  private Long attrDefID;

  @Column(name = "value", nullable = false, length = 200)
  private String value;

  @ManyToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "attr_def_id", nullable = false, insertable = false, updatable = false)
  private AttributeDef attributeDef;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AttributeRegxValue</code>
   */
  public AttributeRegxValue() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
