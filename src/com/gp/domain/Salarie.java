package com.gp.domain;

// Generated 18 nov. 2014 13:28:11 by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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

import org.joda.time.DateTime;

import com.gp.domain.Conge;
import com.gp.domain.Salariebareme;
import com.gp.domain.Societebareme;
import com.outils.gp.Anciennete;
import com.outils.gp.Tool;

/**
 * Salarie generated by hbm2java
 */
@Entity
@Table(name = "salarie", catalog = "gp")
public class Salarie implements java.io.Serializable {

	private Integer salarieId;
	private Contrat contrat;
	private Etatcivile etatcivile;
	private Paie paie;
	private Poste poste;
	private Coordonneebancaire coordonneebancaire;
	private Immatriculation immatriculation;
	private Societe societe;
	private String dossier;
	private String image;
	private int nbrejour;
	private Set<Avance> avances = new HashSet<Avance>(0);
	private Set<Commission> commissions = new HashSet<Commission>(0);
	private Set<Conge> conges = new HashSet<Conge>(0);
	private Set<Salariebareme> salariebaremes = new HashSet<Salariebareme>(0);
	private Set<Primesalarie> primesalaries = new HashSet<Primesalarie>(0);
	private Set<Document> documents = new HashSet<Document>(0);

	public Salarie() {
	}

	public Salarie(String dossier, int nbrejour) {
		this.dossier = dossier;
		this.nbrejour = nbrejour;
	}

	public Salarie(Contrat contrat, Etatcivile etatcivile, Paie paie,
			Poste poste, Coordonneebancaire coordonneebancaire,
			Immatriculation immatriculation, Societe societe, String dossier,
			String image, int nbrejour, Set<Avance> avances,
			Set<Commission> commissions, Set<Conge> conges,
			Set<Salariebareme> salariebaremes, Set<Primesalarie> primesalaries,
			Set<Document> documents) {
		this.contrat = contrat;
		this.etatcivile = etatcivile;
		this.paie = paie;
		this.poste = poste;
		this.coordonneebancaire = coordonneebancaire;
		this.immatriculation = immatriculation;
		this.societe = societe;
		this.dossier = dossier;
		this.image = image;
		this.nbrejour = nbrejour;
		this.avances = avances;
		this.commissions = commissions;
		this.conges = conges;
		this.salariebaremes = salariebaremes;
		this.primesalaries = primesalaries;
		this.documents = documents;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "salarieID", unique = true, nullable = false)
	public Integer getSalarieId() {
		return this.salarieId;
	}

	public void setSalarieId(Integer salarieId) {
		this.salarieId = salarieId;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "contratID")
	public Contrat getContrat() {
		return this.contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "etatcivileID")
	public Etatcivile getEtatcivile() {
		return this.etatcivile;
	}

	public void setEtatcivile(Etatcivile etatcivile) {
		this.etatcivile = etatcivile;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "paieID")
	public Paie getPaie() {
		return this.paie;
	}

	public void setPaie(Paie paie) {
		this.paie = paie;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "posteID")
	public Poste getPoste() {
		return this.poste;
	}

	public void setPoste(Poste poste) {
		this.poste = poste;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "coordoneebancaireID")
	public Coordonneebancaire getCoordonneebancaire() {
		return this.coordonneebancaire;
	}

	public void setCoordonneebancaire(Coordonneebancaire coordonneebancaire) {
		this.coordonneebancaire = coordonneebancaire;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "immatriculationID")
	public Immatriculation getImmatriculation() {
		return this.immatriculation;
	}

	public void setImmatriculation(Immatriculation immatriculation) {
		this.immatriculation = immatriculation;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "societeID")
	public Societe getSociete() {
		return this.societe;
	}

	public void setSociete(Societe societe) {
		this.societe = societe;
	}

	@Column(name = "dossier", nullable = false)
	public String getDossier() {
		return this.dossier;
	}

	public void setDossier(String dossier) {
		this.dossier = dossier;
	}

	@Column(name = "image")
	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	@Column(name = "nbrejour", nullable = false)
	public int getNbrejour() {
		return this.nbrejour;
	}

	public void setNbrejour(int nbrejour) {
		this.nbrejour = nbrejour;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "salarie")
	public Set<Avance> getAvances() {
		return this.avances;
	}

	public void setAvances(Set<Avance> avances) {
		this.avances = avances;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "salarie")
	public Set<Commission> getCommissions() {
		return this.commissions;
	}

	public void setCommissions(Set<Commission> commissions) {
		this.commissions = commissions;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "salarie")
	public Set<Conge> getConges() {
		return this.conges;
	}

	public void setConges(Set<Conge> conges) {
		this.conges = conges;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "salarie")
	public Set<Salariebareme> getSalariebaremes() {
		return this.salariebaremes;
	}

	public void setSalariebaremes(Set<Salariebareme> salariebaremes) {
		this.salariebaremes = salariebaremes;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "salarie")
	public Set<Primesalarie> getPrimesalaries() {
		return this.primesalaries;
	}

	public void setPrimesalaries(Set<Primesalarie> primesalaries) {
		this.primesalaries = primesalaries;
	}

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "salarie")
	public Set<Document> getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set<Document> documents) {
		this.documents = documents;
	}
	
	/*
	 * Mes fonctions
	 */
	public String profil() {
		if (this.image != null) {
			return this.societe.compteDefaut().getLogin() + "/salaries/"
					+ this.dossier + "/images/" + this.image;
		} else {
			return "profil/default.png";
		}
	}
	public boolean baremeAjour(){
	
		for(Societebareme b : this.societe.baremeObligatoires()){
			if(!this.possederBareme(b.getSocietebaremeId())) return false;
		}
		return true;
	}
	
	public boolean possederBareme(Integer baremeId){
		for(Salariebareme sb : this.salariebaremes){
			if(sb.getSocietebareme().getSocietebaremeId().equals(baremeId)) return true;
		}
		return false;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Salarie : "+
				this.etatcivile.getNom()+" "+this.etatcivile.getPrenom();
	}
	
	public String dateDeConges(){
		DateTime d = new DateTime();
		if(this.conges.size() > 0){
			Conge s = (Conge) this.conges.toArray()[0];
			d = new DateTime(s.getDatefin());
		}
			
		for(Conge c:this.conges){
			if(new DateTime(c.getDatefin()).getMillis() > d.getMillis())
				d = new DateTime(c.getDatefin());
		}
		
		return d.toString("MM/d/YYYY");
	}
	
	public boolean notifiable(){
		
		if(new DateTime().getMillis() < new DateTime(this.contrat.getDatedefinperiodeessai()).getMillis()
		&&
		this.societe.getParametre().getAlertefinperiodeessai() != null
		&&
		(((((new DateTime(this.contrat.getDatedefinperiodeessai()).getMillis() - new DateTime().getMillis())/1000)/60)/60)/24) <= this.societe.getParametre().getAlertefinperiodeessai()
		) return true;
		
		return false;
	}
	
	public Integer delaiFinEssai(){
		if(this.notifiable()){
			DateTime debut = new DateTime();
			DateTime fin = new DateTime(this.contrat.getDatedefinperiodeessai());
			DateTime temp =debut;
			int j = 0;
			while(temp.getMillis() < fin.getMillis()){
				j++;
				temp = new DateTime(temp.plusDays(1).toString("YYYY-MM-dd"));
			}
			return new Integer(j);
		}
		return null;
	}
	public List<Avance> avanceExercice(Exercice exo){
		List<Avance> avances = new ArrayList<Avance>();
		for(Avance a:this.avances){
			if(a.getExercice().getExerciceId().equals(exo.getExerciceId()))
				avances.add(a);
		}
		return avances;
	}
	
	public List<Commission> commissionExercice(Exercice exo){
		List<Commission> avances = new ArrayList<Commission>();
		for(Commission a:this.commissions){
			if(a.getExercice().getExerciceId().equals(exo.getExerciceId()))
				avances.add(a);
		}
		return avances;
	}
	public boolean possedePrime(Prime prime){
		for(Primesalarie ps:this.primesalaries){
			if(ps.getPrime().getPrimeId().equals(prime.getPrimeId()))
				return true;
		}
		
		return false;
	}
	public List<Primesalarie> primeExercice(Exercice exo){
		List<Primesalarie> avances = new ArrayList<Primesalarie>();
		for(Primesalarie ps:this.primesalaries){
			if(ps.getExercice().getExerciceId().equals(exo.getExerciceId()))
				avances.add(ps);
		}
		return avances;
	}
	
	public Anciennete anciennete(){
		return Tool.anciennete(new DateTime(this.poste.getDateembauche()), new DateTime());
	}


}
