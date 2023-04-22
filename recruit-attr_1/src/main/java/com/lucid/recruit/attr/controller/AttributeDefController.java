package com.lucid.recruit.attr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lucid.recruit.attr.entity.AttributeDef;
import com.lucid.recruit.attr.service.AttributeDefService;

@RestController
@RequestMapping("/api/v1/attributeDef/")
public class AttributeDefController {

	@Autowired
	private AttributeDefService attributeDefService;
	
	//save AttributeDef
	@PutMapping("updateAttributeDef")
	public void updateAttributeDef(@RequestBody AttributeDef data) {
		attributeDefService.updateAttributeDef(data);
		
	}
	
	//deleting
	@DeleteMapping("deleteAttributeDef")
	public void deleteAttributeDef(@RequestParam(name = "id") Long attrDefID) {
		attributeDefService.deleteAttributeDef(attrDefID);
	}
	//gett by id
	@SuppressWarnings("unchecked")
	@GetMapping("getAttributeDef`````id")
	public List<AttributeDef> getAttributeDef(@PathVariable(name="id")  AttributeDef data) {
		attributeDefService.updateAttributeDef(data);
		return (List<AttributeDef>) data;
	}
	
	//get all
	@SuppressWarnings("unchecked")
	@GetMapping("getall")
	public List<AttributeDef> getAllAttributeDef(@PathVariable(name="findAll")  AttributeDef data)  {
		attributeDefService.updateAttributeDef(data);
		return (List<AttributeDef>) data;
		
	
	}
}
