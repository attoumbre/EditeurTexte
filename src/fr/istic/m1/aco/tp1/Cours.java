package fr.istic.m1.aco.tp1;

public class Cours {
	
	private Etudiant etudiant;
	private String nomCours;
	
	public Cours(String nomCours) {
		this.nomCours= nomCours;
	}
	
	public String getNomCours() {
		return this.nomCours;
	}
	
	public Etudiant getEtudiant() {
		return this.etudiant;
	}
	
	public void setNomCours(String nomCours) {
		this.nomCours=nomCours;
	}
	
	public void setEtudiant(Etudiant etudiant) {
		
		//verifions si l'etudiant courant est associé
		if(this.etudiant != null) {
			this.etudiant.setCours(null);
		}
		
		if(this.etudiant != null && this.etudiant.getCours() != this) {
			this.etudiant.setCours(this);
		}
	}

}
