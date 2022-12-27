package TP7_Java.Exercice1;
import java.util.ArrayList;
/**
 * Décrivez votre classe Test ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Test
{
    public static void main(String [] agrs){
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Integer> integer = new ArrayList<>();
        str.add("Tata");
        str.add("Toto");
        str.add("Tata Toto");
        str.add("Tata");
        str.add("gg");
        integer.add(10);
        integer.add(15);
        integer.add(20);
        integer.add(10);
        Exo1.afficher(str);
        System.out.println("==================");
        System.out.println("Doublons : " + Exo1.doublons(str));
        System.out.println("Simple Doublons : "+ Exo1.unDouble(str));
        System.out.println("===================");
        System.out.println("Doublons : " + Exo1.doublons(integer));
        System.out.println("Simple Doublons : "+ Exo1.unDouble(integer));
        // Exo1.unDouble(str);
        // Exo1.afficher(str);
    }
}
