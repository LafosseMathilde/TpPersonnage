 <?php
import Personnage.*;
public class jeuPersonnage{
    public static void main(String args[]) {
        Personnage UneGuerrière = new Personnage("Mathilde",100);
       System.out.println(" " + UneGuerrière.LaVie());

        Personnage UnRodeur = new Personnage("Thomas",70);
       System.out.println("Avant la vie de Thomas est " + UnMagicien.LaVie());

        System.out.println("Le nom de la guerrière = " + UnGuerrière.LeNom());
        System.out.println("Le nom du rodeur = " + UnRodeur.LeNom());

       System.out.println("Avant la vie de la guerrière est " + UneGuerrière.LaVie());
       UneGuerrière.AugmenterVie(20);
       System.out.println("Apres la vie de la guerrière est " + UneGuerrière.LaVie());

       UnRodeur.Attaque(UneGuerrière,40);
       System.out.println("Attaque La vie du Rodeur est " + UnRodeur.LaVie());
       System.out.println("Attaque La vie de la Guerrière est " + UneGuerrière.LaVie());
     
    public void AugmenterVie(int valeur) {
        this.vie = this.vie + valeur;
     }
     
     
    public class Combat {
     private Personnage UneGuerrière;
     private Personnage UnRodeur;
 
    public Combat(Personnage UneGerrière, Personnage UnRodeur) {
        this.UneGuerrière = UneGuerrière;
        this.UnRodeur = UnRodeur;
    }
 
}
}


