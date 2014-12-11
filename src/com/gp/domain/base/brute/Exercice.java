package com.gp.domain.base.brute;

// Generated 9 d�c. 2014 16:21:18 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Exercice generated by hbm2java
 */
@Entity
@Table(name = "exercice", catalog = "gp")
public class Exercice implements java.io.Serializable {

	private Integer exerciceId;
	private Societe societe;
	private String intituleExercice;
	private Date dateDebut;
	private Date dateFin;
	private boolean encours;
	private Integer feriers;
	private Set<Commission> commissions = new HashSet<Commission>(0);
	private Set<Avance> avances = new HashSet<Avance>(0);
	private Set<Salaire> salaires = new HashSet<Salaire>(0);
	private Set<Primesalarie> primesalaries = new HashSet<Primesalarie>(0);

	public Exercice() {
	}

	public Exercice(String intituleExercice, Date dateDebut, Date dateFin,
			boolean encours) {
		this.intituleExercice = intituleExercice;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.encours = encours;
	}

	public Exercice(Societe societe, String intituleExercice, Date dateDebut,
			Date dateFin, boolean encours, Integer feriers,
			Set<Commission> commissions, Set<Avance> avances,
			Set<Salaire> salaires, Set<Primesalarie> primesalaries) {
		this.societe = societe;
		this.intituleExercice = intituleExercice;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.encours = encours;
		this.feriers = feriers;
		this.commissions = commissions;
		this.avances = avances;
		this.salaires = salaires;
		this.primesalaries = primesalaries;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "exerciceID", unique = true, nullable = false)
	public Integer getExerciceId() {
		return this.exerciceId;
	}

	public void setExerciceId(Integer exerciceId) {
		this.exerciceId = exerciceId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "societeID")
	public Societe getSociete() {
		return this.societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	@Column(name = "intituleExercice", nullable = false)
	public String getIntituleExercice() {
		return this.intituleExercice;
	}

	public void setIntituleExercice(String intituleExercice) {
		this.intituleExercice = intituleExercice;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateDebut", nullable = false, length = 10)
	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "dateFin", nullable = false, length = 10)
	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	@Column(name = "encours", nullable = false)
	public boolean isEncours() {
		return this.encours;
	}

	public void setEncours(boolean encours) {
		this.encours = encours;
	}

	@Column(name = "feriers")
	public Integer getFeriers() {
		return this.feriers;
	}

	public void setFeriers(Integer feriers) {
		this.feriers = feriers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "exercice")
	public Set<Commission> getCommissions() {
		return this.commissions;
	}

	public void setCommissions(Set<Commission> commissions) {
		this.commissions = commissions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "exercice")
	public Set<Avance> getAvances() {
		return this.avances;
	}

	public void setAvances(Set<Avance> avances) {
		this.avances = avances;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "exercice")
	public Set<Salaire> getSalaires() {
		return this.salaires;
	}

	public void setSalaires(Set<Salaire> salaires) {
		this.salaires = salaires;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "exercice")
	public Set<Primesalarie> getPrimesalaries() {
		return this.primesalaries;
	}

	public void setPrimesalaries(Set<Primesalarie> primesalaries) {
		this.primesalaries = primesalaries;
	}

}
