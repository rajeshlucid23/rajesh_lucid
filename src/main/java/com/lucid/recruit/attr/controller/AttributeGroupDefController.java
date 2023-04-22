package com.lucid.recruit.attr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.attr.entity.AttributeGroupDef;
import com.lucid.recruit.attr.services.IAttributeGroupDefService;

import jakarta.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("api/v1/attributeGruoupDef/")
public class AttributeGroupDefController {
	
	@Autowired
	private IAttributeGroupDefService iAttributeGroupDefService;
	
	@PostMapping("createAttributeGroupDef")
	public ResponseEntity<Object> createAttributeGroupDef(@RequestBody AttributeGroupDef attributeGroupDef,HttpServletRequest request){
		try {
			return new ResponseEntity<Object>(iAttributeGroupDefService.createAttributeGroupDef(attributeGroupDef),HttpStatus.OK);	
		}
		catch (ApplicationException e) {
			return new ResponseEntity<Object>(e,HttpStatus.BAD_REQUEST);
		}
		
	}
	
	@PutMapping("updateAttributeGroupDef/{attrGroupDefID}")
	public ResponseEntity<Object> updateAttributeGrupDef(@PathVariable String attrGroupDefID,@RequestBody AttributeGroupDef attributeGroupDef){
		try {
			return new ResponseEntity<Object>(iAttributeGroupDefService.updateAttributeGroupDef(attrGroupDefID, attributeGroupDef),HttpStatus.OK);
		}
		catch (ApplicationException e) {
			return new ResponseEntity<Object>(e,HttpStatus.BAD_REQUEST);
		}
	}
	 
	
	@PatchMapping("updateStatus/{attrGroupDefID}/{status}") 
	public ResponseEntity<Object> updateStatus(@PathVariable String attrGroupDefID,@PathVariable int status){
		try {
			return  new ResponseEntity<Object>(iAttributeGroupDefService.updateStatus(attrGroupDefID, status),HttpStatus.OK);
		}
		catch(ApplicationException e) {
			return new ResponseEntity<Object>(e,HttpStatus.BAD_REQUEST);
		}
			
	}
	
	@GetMapping("fetchAttributeGroupDefs")
	public List<AttributeGroupDef> fetchAttributeGroupDefs(){
		return iAttributeGroupDefService.getAll();
	}
	
	@GetMapping("getAttributeGroupDef/{attrGroupDefID}")
	public ResponseEntity<Object> fetchAttributeGroupDefById(@PathVariable String attrGroupDefID){
		try {
			return  new ResponseEntity<Object>(iAttributeGroupDefService.getAttributeGroupDef(attrGroupDefID),HttpStatus.OK);
		}
		catch (ApplicationException e) {
			return new ResponseEntity<Object>(e,HttpStatus.BAD_REQUEST);
		}
	}

}
