package microprojet.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Client {
	@Id @GeneratedValue(strategy= GenerationType.AUTO)
	private int id;
	private String email;
	private String nom;
	private String prenom;
	private String adresse;
	private String codePostal;
	private String ville;
	private String tel;
	private String motDePasse;
	@OneToOne
	private List<Panier> panier;
	@ElementCollection
	private List<Achat> achats;
	
	
	
	public Client() {
		this.panier=new ArrayList<Panier>();
		this.achats=new ArrayList<Achat>();
	}
	public Client(String email, String nom, String prenom, String adresse, String codePostal, String ville, String tel,
				  String motDePasse) {
		
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.tel = tel;
		this.motDePasse = motDePasse;
		this.panier=new ArrayList<Panier>();
		this.achats=new ArrayList<Achat>();
		
	}
	public Client(int id, String email, String nom, String prenom, String adresse, String codePostal, String ville,
				  String tel, String motDePasse) {
		super();
		this.id = id;
		this.email = email;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.ville = ville;
		this.tel = tel;
		this.motDePasse = motDePasse;
		this.panier=new ArrayList<Panier>();
		this.achats=new ArrayList<Achat>();
		
	}
	
	public List<Achat> getAchats() {
		return achats;
	}
	public void setAchats(List<Achat> achats) {
		this.achats = achats;
	}
	public void ajouterAuPanier(Panier input)
	{
		this.panier.add(input);
	}
	public void SupprimerDuPanier(Panier input)
	{
		this.panier.remove(input);
	}
	public List<Panier> getPanier() {
		return panier;
	}
	public void setPanier(List<Panier> panier) {
		this.panier = panier;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getCodePostal() {
		return codePostal;
	}
	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

}