package TP7_Java.Exercice2;
import java.util.ArrayList;

/**
 * Décrivez votre classe Test ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Test
{
    public static void main(String [] args){
        ArrayList<Integer> tel = new ArrayList<>();
        ArrayList<String> nom = new ArrayList<>();
        
        Correspondance<Integer, String> res = new Correspondance(tel,nom);
        res.insere(33235237, "Martin");
        res.insere(30749836, "Jean-François");
        res.insere(32376234, "Thomas");
        res.insere(74764747, "Mathieu");
        
        System.out.println("Le nom correspond à ce numéro '30749836' est : " + res.get(30749836));
        
        System.out.println("Remplacer le nom du '32376234' par Henry");
        System.out.println("Le nom avant le remplacement est : " + res.get(32376234));
        
        System.out.println(res.remplace(30749836,"Henry") + ", " + "le nom a été remplacé par Henry.");
        
        System.out.println("Suppression du : '32376234'.");
        System.out.println("Le num '32376234' vient d'être supprimé ? " + res.efface(32376234));
        System.out.println("Après suppression : Le num existe-il toujours ? " + res.existe(32376234));
        
        System.out.println("Vérification après la suppression : " + res.get(32376234));
    }
}