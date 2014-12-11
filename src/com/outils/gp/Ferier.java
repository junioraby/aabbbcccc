package com.outils.gp;

// Generated 3 d�c. 2014 22:27:01 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Ferier generated by hbm2java
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "ferier", catalog = "gp")
public class Ferier implements java.io.Serializable {

	private Integer ferierId;
	private Date date;
	private Set<Exercice> exercices = new HashSet<Exercice>(0);
	private Set<Jourferier> jourferiers = new HashSet<Jourferier>(0);

	public Ferier() {
	}

	public Ferier(Date date) {
		this.date = date;
	}

	public Ferier(Date date, Set<Exercice> exercices,
			Set<Jourferier> jourferiers) {
		this.date = date;
		this.exercices = exercices;
		this.jourferiers = jourferiers;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "ferierID", unique = true, nullable = false)
	public Integer getFerierId() {
		return this.ferierId;
	}

	public void setFerierId(Integer ferierId) {
		this.ferierId = ferierId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "date", nullable = false, length = 10)
	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ferier")
	public Set<Exercice> getExercices() {
		return this.exercices;
	}

	public void setExercices(Set<Exercice> exercices) {
		this.exercices = exercices;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "ferier")
	public Set<Jourferier> getJourferiers() {
		return this.jourferiers;
	}

	public void setJourferiers(Set<Jourferier> jourferiers) {
		this.jourferiers = jourferiers;
	}

}
