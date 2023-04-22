package com.lucid.recruit.attr.service;

import java.util.List;

import com.lucid.recruit.attr.entity.AttributeDef;

public interface AttributeDefService {

	//crud operations
	//save AttributeDef
	public void saveAttributeDef(AttributeDef data);
	
	//update AttributeDef
	public AttributeDef updateAttributeDef( AttributeDef data);
	
	//delete AttributeDef
	public void deleteAttributeDef(Long attrDefID);
	
	//get all AttributeDefs
	public List<AttributeDef> getAllAttributeDef();
	
	//get AttributeDef by Id
	public AttributeDef getById(Long attrDefID);
}
