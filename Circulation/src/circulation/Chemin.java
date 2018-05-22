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
    private String position;
    private String nomChemin;
    private Panneau panneau[];

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getNomChemin() {
        return nomChemin;
    }

    public void setNomChemin(String nomChemin) {
        this.nomChemin = nomChemin;
    }

    public Panneau[] getPanneau() {
        return panneau;
    }

    public void setPanneau(Panneau[] panneau) {
        this.panneau = panneau;
    }
    public Chemin(){
        super();
    }

    public Chemin(int id, String position, String nomChemin) {
        this.id = id;
        this.position = position;
        this.nomChemin = nomChemin;
    }
    
}
