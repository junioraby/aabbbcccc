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
import javax.persistence.UniqueConstraint;

/**
 * Utilisateur generated by hbm2java
 */
@Entity
@Table(name = "utilisateur", catalog = "gp", uniqueConstraints = @UniqueConstraint(columnNames = "login"))
public class Utilisateur implements java.io.Serializable {

	private Integer utilisateurId;
	private Societe societe;
	private Role role;
	private String login;
	private String motdepasse;
	private boolean enabled;
	private Set<Message> messagesForDestinataire = new HashSet<Message>(0);
	private Set<Message> messagesForEmetteur = new HashSet<Message>(0);

	public Utilisateur() {
	}

	public Utilisateur(Role role, String login, String motdepasse,
			boolean enabled) {
		this.role = role;
		this.login = login;
		this.motdepasse = motdepasse;
		this.enabled = enabled;
	}

	public Utilisateur(Societe societe, Role role, String login,
			String motdepasse, boolean enabled,
			Set<Message> messagesForDestinataire,
			Set<Message> messagesForEmetteur) {
		this.societe = societe;
		this.role = role;
		this.login = login;
		this.motdepasse = motdepasse;
		this.enabled = enabled;
		this.messagesForDestinataire = messagesForDestinataire;
		this.messagesForEmetteur = messagesForEmetteur;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "utilisateurID", unique = true, nullable = false)
	public Integer getUtilisateurId() {
		return this.utilisateurId;
	}

	public void setUtilisateurId(Integer utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "societeID")
	public Societe getSociete() {
		return this.societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roleID", nullable = false)
	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(name = "login", unique = true, nullable = false, length = 200)
	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	@Column(name = "motdepasse", nullable = false, length = 200)
	public String getMotdepasse() {
		return this.motdepasse;
	}

	public void setMotdepasse(String motdepasse) {
		this.motdepasse = motdepasse;
	}

	@Column(name = "enabled", nullable = false)
	public boolean isEnabled() {
		return this.enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "utilisateurByDestinataire")
	public Set<Message> getMessagesForDestinataire() {
		return this.messagesForDestinataire;
	}

	public void setMessagesForDestinataire(Set<Message> messagesForDestinataire) {
		this.messagesForDestinataire = messagesForDestinataire;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "utilisateurByEmetteur")
	public Set<Message> getMessagesForEmetteur() {
		return this.messagesForEmetteur;
	}

	public void setMessagesForEmetteur(Set<Message> messagesForEmetteur) {
		this.messagesForEmetteur = messagesForEmetteur;
	}

}
