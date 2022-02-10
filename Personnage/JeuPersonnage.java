 <?php
import Personnage.*;
public class jeuPersonnage{
    public static void main(String args[]) {
        Personnage UneGuerrière = new Personnage("Mathilde",100);
       System.out.println("Avant la vie de Fred est " + UneGuerrière.LaVie());

        Personnage UnRodeur = new Personnage("Thomas",70);
       System.out.println("Avant la vie de Bob est " + UnMagicien.LaVie());

        System.out.println("Le nom du sorcier = " + UnGuerrière.LeNom());
        System.out.println("Le nom du magicien = " + UnRodeur.LeNom());

       System.out.println("Avant la vie du sorcier est " + UneGuerrière.LaVie());
       UneGuerrière.AugmenterVie(20);
       System.out.println("Apres la vie du sorcier est " + UneGuerrière.LaVie());

       UnRodeur.Attaque(UneGuerrière,40);
       System.out.println("Atak La vie du magicien est " + UnRodeur.LaVie());
       System.out.println("Atak La vie du sorcier est " + UneGuerrière.LaVie());
}
}


