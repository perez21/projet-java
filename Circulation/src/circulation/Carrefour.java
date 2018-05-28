/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulation;

/**
 *
 * @author thewind
 */
public class Carrefour {
    
    private int id;
    private String nom;
    private Chemin chemin[];

    public Carrefour(String nom, Chemin[] chemin) {
        this.id +=1;
        this.nom = nom;
        this.chemin = chemin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Chemin[] getChemin() {
        return chemin;
    }

    public void setChemin(Chemin[] chemin) {
        this.chemin = chemin;
    }

    @Override
    public String toString() {
        return "Carrefour{" + "id=" + id + ", nom=" + nom + ", chemin=" + chemin + '}';
    }
    
  
    
    
}
