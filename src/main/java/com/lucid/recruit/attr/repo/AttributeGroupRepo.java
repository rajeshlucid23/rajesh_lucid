/**
 * All Rights Reserved. Private and Confidential. May not be disclosed without
 * permission.
 */
package com.lucid.recruit.attr.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.lucid.recruit.attr.entity.AttributeGroupDef;

/**
 * @author sgutti
 * @date 04-Feb-2023 5:18:37 pm
 */
public interface AttributeGroupRepo
        extends JpaRepository<AttributeGroupDef, String> {

    // --------------------------------------------------------------- Constants
    // --------------------------------------------------------- Class Variables
    // ----------------------------------------------------- Static Initializers
    // ------------------------------------------------------ Instance Variables
    // ------------------------------------------------------------ Constructors
    // ---------------------------------------------------------- Public Methods
    // ------------------------------------------------------- Protected Methods
    // --------------------------------------------------------- Default Methods
    // --------------------------------------------------------- Private Methods
    // ---------------------------------------------------------- Static Methods
    // ----------------------------------------------------------- Inner Classes
	
	@Modifying
	@Transactional
	@Query("UPDATE AttributeGroupDef AttributeGroupDef SET AttributeGroupDef.status=:status WHERE AttributeGroupDef.attrGroupDefID=:attrGroupDefID")
	int updateStatusById(@Param("attrGroupDefID") String attrGroupDefID, @Param("status") Integer status);
	
	Optional<AttributeGroupDef> findByInternalCode(String internalCode);
}
