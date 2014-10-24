package com.gp.domainnews;

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
 * Document generated by hbm2java
 */
@Entity
@Table(name = "document", catalog = "gp")
public class Document implements java.io.Serializable {

	private Integer documentId;
	private Salarie salarie;
	private String modele;
	private String nom;

	public Document() {
	}

	public Document(Salarie salarie, String modele, String nom) {
		this.salarie = salarie;
		this.modele = modele;
		this.nom = nom;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "documentID", unique = true, nullable = false)
	public Integer getDocumentId() {
		return this.documentId;
	}

	public void setDocumentId(Integer documentId) {
		this.documentId = documentId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "salarieID")
	public Salarie getSalarie() {
		return this.salarie;
	}

	public void setSalarie(Salarie salarie) {
		this.salarie = salarie;
	}

	@Column(name = "modele")
	public String getModele() {
		return this.modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	@Column(name = "nom")
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
