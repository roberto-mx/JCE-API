package com.amdocs.jceapi.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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
	private String Name;
	

	@Column(name="StateID",columnDefinition = "long")
	private Long StateID;
	
	@ManyToMany(cascade = { 
	        CascadeType.PERSIST, 
	        CascadeType.MERGE
	    },fetch=FetchType.LAZY)
	    @JoinTable(name = "location_provider",
	        joinColumns = @JoinColumn(name = "municipality_id"),
	        inverseJoinColumns = @JoinColumn(name = "provider_Id")
	    )
	private List<Provider> providers = new ArrayList<Provider>();
	
	public Long getID() {
		return id;
	}

	public void setID(Long id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Long getStateID() {
		return StateID;
	}

	public void setStateID(Long stateID) {
		StateID = stateID;
	}

	
	public Municipality() {
		super();
	}
	
	
	
}
