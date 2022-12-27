package TP3_Java.Exo1;
/**
 * Décrivez votre classe main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class main
{
    public static void main(){
        Arme fusil = new Arme("Fusil", 10, 20);
        Arme revolver = new Arme("Revolver", 10, 20);
        Arme  Pistolet = new Arme("Pistolet", 10, 20);
        Personnage Besart = new Personnage("Besart", 100, fusil, revolver);
        Personnage Etienne = new Personnage("Etienne", 100, Pistolet, revolver);
        
        Besart.attaquer(Etienne);
        System.out.println(Besart.toString());
        System.out.println("=================================");
        System.out.println(Etienne.toString());
    }
}
