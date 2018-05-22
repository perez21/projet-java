/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circulation;

/**
 *
 * @author PerezHack
 */
public class Feu {
    
    private int id;
    private String couleur;
    private boolean etat;
    
    public Feu(){}
    
    public Feu(int id, String couleur, boolean etat){
        this.id=id;
        this.couleur=couleur;
        this.etat=etat;
        
    }

    public int getId() {
        return id;
    }

    public String getCouleur() {
        return couleur;
    }

    public boolean isEtat() {
        return etat;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public void setEtat(boolean etat) {
        this.etat = etat;
    }

    @Override
    public String toString() {
        return "Feu{" + "id=" + id + ", couleur=" + couleur + ", etat=" + etat + '}';
    }
    
    
}
