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
        Feu tabfeu[] = new Feu[3];
        tabfeu[0]= new Feu("Rouge",false);
        tabfeu[1]= new Feu("Vert",true);
        tabfeu[2]= new Feu("Jaune",false);
        

//Creation d'un  tableau de panneaux
        
      Panneau tabpanneau[] = {new Panneau("PSud",tabfeu), new Panneau("PNord",tabfeu),new Panneau("PEst",tabfeu),new Panneau("Pouest",tabfeu)}; 
        
      //Creation d'un tableau de chemin
      Chemin tabchemin[] = {new Chemin("cheminSud",tabpanneau[0]), new Chemin("cheminNord",tabpanneau[1]), new Chemin("cheminEst",tabpanneau[2]),new Chemin("cheminOuest",tabpanneau[3])};
      
      //Creation du tableau carrefour
      
      Carrefour carrefour[] = {new Carrefour("Nord",tabchemin),new Carrefour("Sud",tabchemin),new Carrefour("Est",tabchemin),new Carrefour("Sud",tabchemin)}; 
      if (carrefour[0].getNom()=="Nord"){
          if (tabfeu[0].getCouleur()=="Vert"){
              if (tabfeu[0].isEtat()){
                  System.out.println("Passage des vehicules du cote Nord et sud");
              }
          }
      } 

    }
    
}
