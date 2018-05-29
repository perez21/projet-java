package circulation;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PerezHack
 */
public class Circulation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
        
//Creation d'un feu
        Feu tabfeu[] = {new Feu("Rouge",false),new Feu("Vert",true),new Feu("Jaune",false)};
     
        
       

//Creation d'un  tableau de panneaux
        
      Panneau tabpanneau[] = {new Panneau("PSud",tabfeu), new Panneau("PNord",tabfeu),new Panneau("PEst",tabfeu),new Panneau("Pouest",tabfeu)}; 
        
      //Creation d'un tableau de chemin
      Chemin chemin[] = {new Chemin("cheminSud",tabpanneau[0]), new Chemin("cheminNord",tabpanneau[1]), new Chemin("cheminEst",tabpanneau[2]),new Chemin("cheminOuest",tabpanneau[3])};
       
        PassageVehicule();
    }
    
    public static void PassageVehicule(){
       System.out.println("passage de voiture en cours...");
        //ici on vas ecrire la methode que nous allons appeler chaque fois que nous voulons afficher le passage de vehicule
        
    
    }
    
    public static void PassagePieton(){
    
        //ici on vas ecrire la methode que nous allons appeler chaquefois que nous voulons afficher le passage des pietons
        
    }
    
}
