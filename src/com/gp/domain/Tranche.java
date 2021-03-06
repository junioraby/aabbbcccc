package com.gp.domain;

// Generated 24 oct. 2014 14:58:33 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Tranche generated by hbm2java
 */
@Entity
@Table(name = "tranche", catalog = "gp")
public class Tranche implements java.io.Serializable {

	private Integer trancheId;
	private Bareme bareme;
	private float debut;
	private float fin;
	private float taux;
	private String formule;

	public Tranche() {
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Tranche :  \ndebut : "+this.debut+"\nfin: "+this.fin+
				"\nTaux : "+this.taux+"\n"+this.bareme+"\n------------------------------\n";
	}

	public Tranche(Bareme bareme, float debut, float fin, float taux) {
		this.bareme = bareme;
		this.debut = debut;
		this.fin = fin;
		this.taux = taux;
	}

	public Tranche(Bareme bareme, float debut, float fin, float taux,
			String formule) {
		this.bareme = bareme;
		this.debut = debut;
		this.fin = fin;
		this.taux = taux;
		this.formule = formule;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "trancheId", unique = true, nullable = false)
	public Integer getTrancheId() {
		return this.trancheId;
	}

	public void setTrancheId(Integer trancheId) {
		this.trancheId = trancheId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bareme", nullable = false)
	public Bareme getBareme() {
		return this.bareme;
	}

	public void setBareme(Bareme bareme) {
		this.bareme = bareme;
	}

	@Column(name = "debut", nullable = false, precision = 12, scale = 0)
	public float getDebut() {
		return this.debut;
	}

	public void setDebut(float debut) {
		this.debut = debut;
	}

	@Column(name = "fin", nullable = false, precision = 12, scale = 0)
	public float getFin() {
		return this.fin;
	}

	public void setFin(float fin) {
		this.fin = fin;
	}

	@Column(name = "taux", nullable = false, precision = 12, scale = 0)
	public float getTaux() {
		return this.taux;
	}

	public void setTaux(float taux) {
		this.taux = taux;
	}

	@Column(name = "formule", length = 65535)
	public String getFormule() {
		return this.formule;
	}

	public void setFormule(String formule) {
		this.formule = formule;
	}

}
