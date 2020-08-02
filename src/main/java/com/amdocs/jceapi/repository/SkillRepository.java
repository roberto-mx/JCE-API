package com.amdocs.jceapi.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.amdocs.jceapi.domain.Skill;

@RepositoryRestResource(path = "Skills", collectionResourceRel = "Skill")
public interface SkillRepository extends PagingAndSortingRepository<Skill, Long> {

	public List<Skill> findSkillsBySkill2empleo(@Param("empleoId") Long empleo);
}
