package com.gp.brute.domain;

// Generated 11 d�c. 2014 16:25:59 by Hibernate Tools 3.4.0.CR1

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
@Entity
@Table(name = "ferier", catalog = "gp")
public class Ferier implements java.io.Serializable {

	private Integer ferierId;
	private Date dateajout;
	private Set<Exercice> exercices = new HashSet<Exercice>(0);
	private Set<Tableferier> tableferiers = new HashSet<Tableferier>(0);

	public Ferier() {
	}

	public Ferier(Date dateajout) {
		this.dateajout = dateajout;
	}

	public Ferier(Date dateajout, Set<Exercice> exercices,
			Set<Tableferier> tableferiers) {
		this.dateajout = dateajout;
		this.exercices = exercices;
		this.tableferiers = tableferiers;
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
	@Column(name = "dateajout", nullable = false, length = 10)
	public Date getDateajout() {
		return this.dateajout;
	}

	public void setDateajout(Date dateajout) {
		this.dateajout = dateajout;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ferier")
	public Set<Exercice> getExercices() {
		return this.exercices;
	}

	public void setExercices(Set<Exercice> exercices) {
		this.exercices = exercices;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ferier")
	public Set<Tableferier> getTableferiers() {
		return this.tableferiers;
	}

	public void setTableferiers(Set<Tableferier> tableferiers) {
		this.tableferiers = tableferiers;
	}

}
