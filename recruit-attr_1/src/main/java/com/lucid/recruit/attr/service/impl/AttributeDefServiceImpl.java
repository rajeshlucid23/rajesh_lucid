package com.lucid.recruit.attr.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lucid.recruit.attr.entity.AttributeDef;
import com.lucid.recruit.attr.repo.AttributeDefRepo;
import com.lucid.recruit.attr.service.AttributeDefService;

@Service
public class AttributeDefServiceImpl implements AttributeDefService {

	@Autowired
	private AttributeDefRepo attributeDefRepo;
	@Override
	public void saveAttributeDef(AttributeDef data) {
		attributeDefRepo.save(data);
	}

	@Override
	public AttributeDef updateAttributeDef(AttributeDef data) {
		if(data != null && data.getAttrDefID() != null && getById(data.getAttrDefID()) != null) {
			data = attributeDefRepo.save(data);
		}else {
			//throw Coludnt update Exception
		}
		return data;
	}

	@Override
	public void deleteAttributeDef(Long attrDefID) {
		// TODO Auto-generated method stub
		if(getById(attrDefID) != null) {
			attributeDefRepo.deleteById(attrDefID);
		}
	}

	@Override
	public List<AttributeDef> getAllAttributeDef() {
		// TODO Auto-generated method stub
		return attributeDefRepo.findAll();
	}

	@Override
	public AttributeDef getById(Long attrDefID) {
		// TODO Auto-generated method stub
		return attributeDefRepo.getReferenceById(attrDefID);
	}

}
