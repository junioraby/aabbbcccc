package com.gp.domainnews;

// Generated 10 nov. 2014 19:05:50 by Hibernate Tools 3.4.0.CR1

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
 * Prime generated by hbm2java
 */
@Entity
@Table(name = "prime", catalog = "gp")
public class Prime implements java.io.Serializable {

	private Integer primeId;
	private Salarie salarie;

	public Prime() {
	}

	public Prime(Salarie salarie) {
		this.salarie = salarie;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "primeID", unique = true, nullable = false)
	public Integer getPrimeId() {
		return this.primeId;
	}

	public void setPrimeId(Integer primeId) {
		this.primeId = primeId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "salarieID")
	public Salarie getSalarie() {
		return this.salarie;
	}

	public void setSalarie(Salarie salarie) {
		this.salarie = salarie;
	}

}
