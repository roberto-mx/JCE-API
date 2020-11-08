package com.amdocs.jceapi.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Municipality")
public class Municipality {

	@Id
	@GeneratedValue
	@Column(name="municipality_id")
	private Long id;

	@Column(name="Name", columnDefinition = "char(20)")
	private String name;


	@Column(name="StateID")
	private Long stateId;

	@ManyToMany(cascade = { 
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	    },fetch=FetchType.LAZY)
	    @JoinTable(name = "location_provider",
	        joinColumns = @JoinColumn(name = "municipality_id"),
	        inverseJoinColumns = @JoinColumn(name = "provider_Id")
	    )
	private List<Provider> providers = new ArrayList<Provider>();

	public Municipality() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getStateId() {
		return stateId;
	}

	public void setStateId(Long stateId) {
		this.stateId = stateId;
	}
}