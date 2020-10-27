package com.amdocs.jceapi.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.amdocs.jceapi.domain.Provider;
import com.amdocs.jceapi.domain.Skill;

public interface ProviderRepository extends CrudRepository<Provider, Long> {

	public List<Provider> findProvidersBySkills(Skill skillId);
}
