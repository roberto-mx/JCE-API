package com.amdocs.jceapi.domain;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="catalog_skill", schema = "jceamdocs")
public class Skill {

	@Id
	@GeneratedValue
	@Column(name="skillid")
	private Long id;
	
	@Column(name="skill2empleo")
	private Long skill2empleo;

	@Column(name="name")
	private String name;

	@Column(name="description")
	private String description;

	@Column(name="version")
	private String version;

	@ManyToMany(cascade = { 
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	    })
	    @JoinTable(name = "skill_provider",
	        joinColumns = @JoinColumn(name = "skillid"),
	        inverseJoinColumns = @JoinColumn(name = "providerid")
	    )
	private Set<Provider> providers = new HashSet<Provider>();

	public void addProvider(Provider provider) {
		providers.add(provider);
		provider.getSkills().add(this);
	}
	
	public void removeIntegrante (Provider provider) {
		this.providers.remove(provider);
		provider.getSkills().remove(this);
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public Long getSkill2empleo() {
		return skill2empleo;
	}

	public void setSkill2empleo(Long skill2empleo) {
		this.skill2empleo = skill2empleo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public Set<Provider> getProviders() {
		return providers;
	}

	public void setProviders(Set<Provider> providers) {
		this.providers = providers;
	}
}
