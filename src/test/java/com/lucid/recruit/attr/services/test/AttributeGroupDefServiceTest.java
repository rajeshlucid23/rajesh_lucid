package com.lucid.recruit.attr.services.test;

import java.util.Date;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.lucid.core.constants.EnumAccessType;
import com.lucid.core.constants.EnumStatus;
import com.lucid.core.exception.ApplicationException;
import com.lucid.recruit.attr.entity.AttributeGroupDef;
import com.lucid.recruit.attr.repo.AttributeGroupRepo;
import com.lucid.recruit.attr.services.IAttributeGroupDefService;


@ActiveProfiles("test")
@SpringBootTest
@RunWith(SpringRunner.class)
public class AttributeGroupDefServiceTest {
	
	@Autowired
	private AttributeGroupRepo attributeGroupRepo;
	
	@Autowired
	private IAttributeGroupDefService iAttributeGroupDefService;
	
	
	@Before
	@After
	public void setUp() {
		attributeGroupRepo.deleteAll();
	}
	
	@Test
	public void createAttributeGroupDefTest() {
		AttributeGroupDef attributeGroupDef = new AttributeGroupDef();
		attributeGroupDef.setCreatedBy("System");
		attributeGroupDef.setCreatedDt(new Date());
		attributeGroupDef.setUpdatedBy("System");
		attributeGroupDef.setUpdatedDt(new Date());
		attributeGroupDef.setName("testAttributeGroup");
		attributeGroupDef.setDescription("Test");
		attributeGroupDef.setScope(EnumAccessType.PUBLIC);
		attributeGroupDef.setStatus(EnumStatus.ACTIVE);
		attributeGroupDef.setInternalCode("123");
		attributeGroupDef.setDisplayOrder(1);
		try {
			attributeGroupDef = iAttributeGroupDefService.createAttributeGroupDef(attributeGroupDef);
			attributeGroupDef = attributeGroupRepo.findById(attributeGroupDef.getAttrGroupDefID()).get();
			
			Assert.assertEquals("123",attributeGroupDef.getInternalCode());
		}
		catch (ApplicationException e) {
			Assert.assertEquals("Alredy attribute exists withm internalCode "+attributeGroupDef.getInternalCode(),e.getMessage());
		}
		
	}
	
}
