package com.lucid.recruit.attr.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.attr.entity.AttributeGroupDef;
import com.lucid.recruit.attr.repo.AttributeGroupRepo;
import com.lucid.recruit.attr.services.IAttributeGroupDefService;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class AttributeGroupDefServiceImpl implements IAttributeGroupDefService {
	
	
	public static final String SERVICE_NAME = "IAttributeGroupDefService";
	public static final String ERROR_ATT_G_0000 = "ERROR_ATT_G_0000";
	public static final String ERROR_ATT_G_0001 = "ERROR_ATT_G_0001";
	public static final String ERROR_ATT_G_0002 = "ERROR_ATT_G_0002";
	public static final String ERROR_ATT_G_0003 = "ERROR_ATT_G_0003";
	public static final String ERROR_ATT_G_0004 = "ERROR_ATT_G_0004";
	public static final String ERROR_ATT_G_0005 = "ERROR_ATT_G_0005";
	
	
	@Autowired
	private AttributeGroupRepo attributeGroupRepo;

	/**
	 * @param attrGroupDef
	 * @return attrGroupDef
	 */
	@Override
	public AttributeGroupDef createAttributeGroupDef(AttributeGroupDef attributeGroupDef) throws ApplicationException{
		Optional<AttributeGroupDef> optionalAttributeGroupDef = attributeGroupRepo.findByInternalCode(attributeGroupDef.getInternalCode());
		if(optionalAttributeGroupDef.isPresent()) {
			throw new ApplicationException(ERROR_ATT_G_0000,"Alredy attribute exists withm internalCode "+attributeGroupDef.getInternalCode());
		}
		return attributeGroupRepo.save(attributeGroupDef);
	}

	
	/**
	 * @param attrGroupDefID 
	 * @param attrGroupDef
	 * @return attrGroupDef
	 */
	@Override
	public AttributeGroupDef updateAttributeGroupDef(String attrGroupDefID, AttributeGroupDef attributeGroupDef)throws ApplicationException {
		Optional<AttributeGroupDef> optionalAttributeGroupDef = attributeGroupRepo.findById(attrGroupDefID);
		if(!optionalAttributeGroupDef.isPresent()) {
			throw new ApplicationException(ERROR_ATT_G_0001,"Attribute Defination Not Found with "+attrGroupDefID);
		}
		attributeGroupDef.setAttrGroupDefID(attrGroupDefID);
		return attributeGroupRepo.save(attributeGroupDef);
	}
	
	
	/**
	 * @param attrGroupDefID
	 * @param status
	 * @return boolean
	 */
	@Override
	public boolean updateStatus(String attrGroupDefID, Integer status) throws ApplicationException{
		Optional<AttributeGroupDef> optionalAttributeGroupDef = attributeGroupRepo.findById(attrGroupDefID);
		if(!optionalAttributeGroupDef.isPresent()) {
			throw new ApplicationException(ERROR_ATT_G_0001,"Attribute Defination Not Found with "+attrGroupDefID);
		}
		return attributeGroupRepo.updateStatusById(attrGroupDefID,status) >0?true:false;
	}

	/**
	 * @return List<AttributeGroupDef>
	 */
	@Override
	public List<AttributeGroupDef> getAll() {
		// TODO Auto-generated method stub
		return attributeGroupRepo.findAll();
	}

	/**
	 * @return AttributeGroupDef
	 */
	@Override
	public AttributeGroupDef getAttributeGroupDef(String attrGroupDefID)throws ApplicationException {
		Optional<AttributeGroupDef> optionalAttributeGroupDef = attributeGroupRepo.findById(attrGroupDefID);
		if(!optionalAttributeGroupDef.isPresent()) {
			throw new ApplicationException(ERROR_ATT_G_0001,"Attribute Defination Not Found with "+attrGroupDefID);
		}
		return attributeGroupRepo.findById(attrGroupDefID).get();
	}

}
