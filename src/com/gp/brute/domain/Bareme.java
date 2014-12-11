package com.gp.brute.domain;

// Generated 11 d�c. 2014 16:25:59 by Hibernate Tools 3.4.0.CR1

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
import javax.persistence.Version;

/**
 * Bareme generated by hbm2java
 */
@Entity
@Table(name = "bareme", catalog = "gp")
public class Bareme implements java.io.Serializable {

	private Integer baremeId;
	private String version;
	private Compagnie compagnie;
	private String nom;
	private String tranche;
	private String type;
	private String caractere;
	private String description;
	private Set<Tranche> tranches = new HashSet<Tranche>(0);
	private Set<Societebareme> societebaremes = new HashSet<Societebareme>(0);

	public Bareme() {
	}

	public Bareme(Compagnie compagnie, String nom, String tranche, String type,
			String caractere, String description) {
		this.compagnie = compagnie;
		this.nom = nom;
		this.tranche = tranche;
		this.type = type;
		this.caractere = caractere;
		this.description = description;
	}

	public Bareme(Compagnie compagnie, String nom, String tranche, String type,
			String caractere, String description, Set<Tranche> tranches,
			Set<Societebareme> societebaremes) {
		this.compagnie = compagnie;
		this.nom = nom;
		this.tranche = tranche;
		this.type = type;
		this.caractere = caractere;
		this.description = description;
		this.tranches = tranches;
		this.societebaremes = societebaremes;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "baremeID", unique = true, nullable = false)
	public Integer getBaremeId() {
		return this.baremeId;
	}

	public void setBaremeId(Integer baremeId) {
		this.baremeId = baremeId;
	}

	@Version
	@Column(name = "version", nullable = false, length = 50)
	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "compagnieID", nullable = false)
	public Compagnie getCompagnie() {
		return this.compagnie;
	}

	public void setCompagnie(Compagnie compagnie) {
		this.compagnie = compagnie;
	}

	@Column(name = "nom", nullable = false)
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Column(name = "tranche", nullable = false)
	public String getTranche() {
		return this.tranche;
	}

	public void setTranche(String tranche) {
		this.tranche = tranche;
	}

	@Column(name = "type", nullable = false, length = 50)
	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Column(name = "caractere", nullable = false)
	public String getCaractere() {
		return this.caractere;
	}

	public void setCaractere(String caractere) {
		this.caractere = caractere;
	}

	@Column(name = "description", nullable = false, length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bareme")
	public Set<Tranche> getTranches() {
		return this.tranches;
	}

	public void setTranches(Set<Tranche> tranches) {
		this.tranches = tranches;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bareme")
	public Set<Societebareme> getSocietebaremes() {
		return this.societebaremes;
	}

	public void setSocietebaremes(Set<Societebareme> societebaremes) {
		this.societebaremes = societebaremes;
	}

}
