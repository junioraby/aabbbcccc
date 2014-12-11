package com.gp.domain.base.brute;

// Generated 9 d�c. 2014 16:21:18 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Affectation generated by hbm2java
 */
@Entity
@Table(name = "affectation", catalog = "gp")
public class Affectation implements java.io.Serializable {

	private Integer affectationId;
	private String departement;
	private String service;
	private Set<Poste> postes = new HashSet<Poste>(0);

	public Affectation() {
	}

	public Affectation(String departement, String service, Set<Poste> postes) {
		this.departement = departement;
		this.service = service;
		this.postes = postes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "affectationID", unique = true, nullable = false)
	public Integer getAffectationId() {
		return this.affectationId;
	}

	public void setAffectationId(Integer affectationId) {
		this.affectationId = affectationId;
	}

	@Column(name = "departement")
	public String getDepartement() {
		return this.departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	@Column(name = "service")
	public String getService() {
		return this.service;
	}

	public void setService(String service) {
		this.service = service;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "affectation")
	public Set<Poste> getPostes() {
		return this.postes;
	}

	public void setPostes(Set<Poste> postes) {
		this.postes = postes;
	}

}
