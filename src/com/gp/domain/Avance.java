package com.gp.domain;

// Generated 14 sept. 2014 16:09:18 by Hibernate Tools 3.4.0.CR1

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
 * Avance generated by hbm2java
 */
@Entity
@Table(name = "avance", catalog = "gp")
public class Avance implements java.io.Serializable {

	private Integer avanceId;
	private Set<Ordrevirement> ordrevirements = new HashSet<Ordrevirement>(0);

	public Avance() {
	}

	public Avance(Set<Ordrevirement> ordrevirements) {
		this.ordrevirements = ordrevirements;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "avanceID", unique = true, nullable = false)
	public Integer getAvanceId() {
		return this.avanceId;
	}

	public void setAvanceId(Integer avanceId) {
		this.avanceId = avanceId;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "avance")
	public Set<Ordrevirement> getOrdrevirements() {
		return this.ordrevirements;
	}

	public void setOrdrevirements(Set<Ordrevirement> ordrevirements) {
		this.ordrevirements = ordrevirements;
	}

}
