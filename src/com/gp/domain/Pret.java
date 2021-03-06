package com.gp.domain;

// Generated 18 nov. 2014 13:28:11 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Pret generated by hbm2java
 */
@Entity
@Table(name = "pret", catalog = "gp")
public class Pret implements java.io.Serializable {

	private Integer pretId;
	private Float montant;

	public Pret() {
	}

	public Pret(Float montant) {
		this.montant = montant;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "pretID", unique = true, nullable = false)
	public Integer getPretId() {
		return this.pretId;
	}

	public void setPretId(Integer pretId) {
		this.pretId = pretId;
	}

	@Column(name = "montant", precision = 12, scale = 0)
	public Float getMontant() {
		return this.montant;
	}

	public void setMontant(Float montant) {
		this.montant = montant;
	}

}
