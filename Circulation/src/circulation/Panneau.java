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
public class Panneau {

    private int id ;
    private String nom;
    private Feu feu[];

    public Panneau() {
    }

    public Panneau(int id, String nom, Feu[] feu) {
        this.id = id;
        this.nom = nom;
        this.feu = feu;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public Feu[] getFeu() {
        return feu;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setFeu(Feu[] feu) {
        this.feu = feu;
    }

    @Override
    public String toString() {
        return "Panneau{" + "id=" + id + ", nom=" + nom + ", feu=" + feu + '}';
    }
    
    
    
}