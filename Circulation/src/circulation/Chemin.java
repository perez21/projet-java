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
public class Chemin {
    private int id;
    private String nomChemin;
    private Panneau panneau;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getNomChemin() {
        return nomChemin;
    }

    public void setNomChemin(String nomChemin) {
        this.nomChemin = nomChemin;
    }

    public Panneau getPanneau() {
        return panneau;
    }

    public void setPanneau(Panneau panneau) {
        this.panneau = panneau;
    }
    

    public Chemin( String nomChemin,Panneau panneau) {
        this.id += 1;
        this.nomChemin = nomChemin;
        this.panneau=panneau;
    }

    @Override
    public String toString() {
        return "Chemin{" + "id=" + id + ", nomChemin=" + nomChemin + ", panneau=" + panneau + '}';
    }
    
    
    
}
