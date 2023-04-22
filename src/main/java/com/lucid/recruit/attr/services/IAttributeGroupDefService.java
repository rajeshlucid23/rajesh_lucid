package com.lucid.recruit.attr.services;

import java.util.List;

import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.attr.entity.AttributeGroupDef;

public interface IAttributeGroupDefService {
public AttributeGroupDef createAttributeGroupDef(AttributeGroupDef attributeGroupDef) throws ApplicationException;
public AttributeGroupDef updateAttributeGroupDef(String attrGroupDefID  , AttributeGroupDef attributeGroupDef)throws ApplicationException;
public boolean updateStatus(String attrGroupDefID,Integer status ) throws ApplicationException;
public List<AttributeGroupDef> getAll();
public AttributeGroupDef getAttributeGroupDef(String attrGroupDefID)throws ApplicationException;
}
