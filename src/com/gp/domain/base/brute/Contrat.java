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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Contrat generated by hbm2java
 */
@Entity
@Table(name = "contrat", catalog = "gp")
public class Contrat implements java.io.Serializable {

	private Integer contratId;
	private Date datedebut;
	private Date datedefin;
	private Date datedefinperiodeessai;
	private String intituleemploi;
	private String nature;
	private Float salairebrute;
	private Float salairedebase;
	private Set<Salarie> salaries = new HashSet<Salarie>(0);

	public Contrat() {
	}

	public Contrat(Date datedebut, Date datedefin, Date datedefinperiodeessai,
			String intituleemploi, String nature, Float salairebrute,
			Float salairedebase, Set<Salarie> salaries) {
		this.datedebut = datedebut;
		this.datedefin = datedefin;
		this.datedefinperiodeessai = datedefinperiodeessai;
		this.intituleemploi = intituleemploi;
		this.nature = nature;
		this.salairebrute = salairebrute;
		this.salairedebase = salairedebase;
		this.salaries = salaries;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "contratID", unique = true, nullable = false)
	public Integer getContratId() {
		return this.contratId;
	}

	public void setContratId(Integer contratId) {
		this.contratId = contratId;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datedebut", length = 10)
	public Date getDatedebut() {
		return this.datedebut;
	}

	public void setDatedebut(Date datedebut) {
		this.datedebut = datedebut;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datedefin", length = 10)
	public Date getDatedefin() {
		return this.datedefin;
	}

	public void setDatedefin(Date datedefin) {
		this.datedefin = datedefin;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "datedefinperiodeessai", length = 10)
	public Date getDatedefinperiodeessai() {
		return this.datedefinperiodeessai;
	}

	public void setDatedefinperiodeessai(Date datedefinperiodeessai) {
		this.datedefinperiodeessai = datedefinperiodeessai;
	}

	@Column(name = "intituleemploi")
	public String getIntituleemploi() {
		return this.intituleemploi;
	}

	public void setIntituleemploi(String intituleemploi) {
		this.intituleemploi = intituleemploi;
	}

	@Column(name = "nature")
	public String getNature() {
		return this.nature;
	}

	public void setNature(String nature) {
		this.nature = nature;
	}

	@Column(name = "salairebrute", precision = 12, scale = 0)
	public Float getSalairebrute() {
		return this.salairebrute;
	}

	public void setSalairebrute(Float salairebrute) {
		this.salairebrute = salairebrute;
	}

	@Column(name = "salairedebase", precision = 12, scale = 0)
	public Float getSalairedebase() {
		return this.salairedebase;
	}

	public void setSalairedebase(Float salairedebase) {
		this.salairedebase = salairedebase;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contrat")
	public Set<Salarie> getSalaries() {
		return this.salaries;
	}

	public void setSalaries(Set<Salarie> salaries) {
		this.salaries = salaries;
	}

}
