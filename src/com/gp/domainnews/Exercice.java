package com.gp.domainnews;

// Generated 24 oct. 2014 14:58:33 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
			Date dateFin, boolean encours) {
		this.societe = societe;
		this.intituleExercice = intituleExercice;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.encours = encours;
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

}
