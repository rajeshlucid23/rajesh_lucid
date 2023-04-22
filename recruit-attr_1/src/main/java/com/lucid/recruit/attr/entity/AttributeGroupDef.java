/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.entity;

import com.lucid.core.entity.AuditableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 04-Feb-2023 1:20:13 pm
 */
@Entity
@Table(name = AttributeGroupDef.TABLE_NAME)
public class AttributeGroupDef extends AuditableEntity {

  // --------------------------------------------------------------- Constants
  private static final long serialVersionUID = 3743016163806117580L;
  public static final String TABLE_NAME = "t_attr_group_def";
  // --------------------------------------------------------- Class Variables
  // ----------------------------------------------------- Static Initializers
  // ------------------------------------------------------ Instance Variables
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "attr_group_def_id", nullable = false)
  private Long attrGroupDefID;

  @Column(name = "name", nullable = false, length = 50)
  private String name;

  @Column(name = "description", nullable = true, length = 400)
  private String description;

  @Column(name = "display_order", nullable = false)
  private Integer displayOrder;

  // 0-PUBLIC, 1- PRIVATE , 2-SYSTEM,3-INTERNAL
  @Column(name = "scope", nullable = false)
  private Integer scope;

  @Column(name = "internal_code", nullable = true, length = 25)
  private String internalCode;

  @Column(name = "status", nullable = false)
  private Integer status;

  // ------------------------------------------------------------ Constructors
  /**
   * Create a new <code>AttributeGroupDef</code>
   */
  public AttributeGroupDef() {
    super();
  }
  // ---------------------------------------------------------- Public Methods
  // ------------------------------------------------------- Protected Methods
  // --------------------------------------------------------- Default Methods
  // --------------------------------------------------------- Private Methods
  // ---------------------------------------------------------- Static Methods
  // ----------------------------------------------------------- Inner Classes
}
