/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without permission.
 */
package com.lucid.recruit.attr.entity;

import com.lucid.core.entity.AuditableEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author sgutti
 * @date 04-Feb-2023 1:29:32 pm
 */
@Entity
@Table(name = AttributeDef.TABLE_NAME)
public class AttributeDef extends AuditableEntity {

	// --------------------------------------------------------------- Constants
	private static final long serialVersionUID = 4232069658035044147L;
	public static final String TABLE_NAME = "t_attr_def";
	// --------------------------------------------------------- Class Variables
	// ----------------------------------------------------- Static Initializers
	// ------------------------------------------------------ Instance Variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "attr_def_id", nullable = false)
	private Long attrDefID;

	@Column(name = "name", nullable = false, length = 50)
	private String name;

	@Column(name = "description", nullable = true, length = 400)
	private String description;

	@Column(name = "display_order", nullable = false)
	private Integer displayOrder;

	@Column(name = "internal_code", nullable = true, length = 25)
	private String internalCode;

	@Column(name = "status", nullable = false)
	private Integer status;

	@Column(name = "attr_group_def_id", nullable = false)
	private Long attrGroupDefID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "attr_group_def_id", nullable = false, insertable = false, updatable = false)
	private AttributeGroupDef attributeGroupDef;

	@Column(name = "attr_type_id", nullable = false)
	private Long attrTypeID;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "attr_type_id", nullable = false, insertable = false, updatable = false)
	private AttributeType attributeType;
	//
	@Column(name = "is_required", nullable = true)
	private Boolean required;

	@Column(name = "is_multiple", nullable = true)
	private Boolean multiple;

	@Column(name = "default_value", nullable = true, length = 200)
	private String defaultValue;

	@Column(name = "mask", nullable = true, length = 200)
	private String mask;

	@Column(name = "tool_tip", nullable = true, length = 200)
	private String toolTip;

	// ------------------------------------------------------------ Constructors
	/**
	 * Create a new <code>AttributeDef</code>
	 */
	public AttributeDef() {
		super();
	}
	// ---------------------------------------------------------- Public Methods
	// ------------------------------------------------------- Protected Methods
	// --------------------------------------------------------- Default Methods
	// --------------------------------------------------------- Private Methods
	// ---------------------------------------------------------- Static Methods
	// ----------------------------------------------------------- Inner Classes

	//getters and settesrs of apis
	public Long getAttrDefID() {
		return attrDefID;
	}

	public void setAttrDefID(Long attrDefID) {
		this.attrDefID = attrDefID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getDisplayOrder() {
		return displayOrder;
	}

	public void setDisplayOrder(Integer displayOrder) {
		this.displayOrder = displayOrder;
	}

	public String getInternalCode() {
		return internalCode;
	}

	public void setInternalCode(String internalCode) {
		this.internalCode = internalCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Long getAttrGroupDefID() {
		return attrGroupDefID;
	}

	public void setAttrGroupDefID(Long attrGroupDefID) {
		this.attrGroupDefID = attrGroupDefID;
	}

	public AttributeGroupDef getAttributeGroupDef() {
		return attributeGroupDef;
	}

	public void setAttributeGroupDef(AttributeGroupDef attributeGroupDef) {
		this.attributeGroupDef = attributeGroupDef;
	}

	public Long getAttrTypeID() {
		return attrTypeID;
	}

	public void setAttrTypeID(Long attrTypeID) {
		this.attrTypeID = attrTypeID;
	}

	public AttributeType getAttributeType() {
		return attributeType;
	}

	public void setAttributeType(AttributeType attributeType) {
		this.attributeType = attributeType;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	public Boolean getMultiple() {
		return multiple;
	}

	public void setMultiple(Boolean multiple) {
		this.multiple = multiple;
	}

	public String getDefaultValue() {
		return defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public String getMask() {
		return mask;
	}

	public void setMask(String mask) {
		this.mask = mask;
	}

	public String getToolTip() {
		return toolTip;
	}

	public void setToolTip(String toolTip) {
		this.toolTip = toolTip;
	}

}
