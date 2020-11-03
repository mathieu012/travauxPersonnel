package entite;

public class Personnes{
	
	private String nom;
	private String login;
	
	public Personnes(String nom, String login) {
		this.nom = nom;
		this.login = login;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}
	
}
