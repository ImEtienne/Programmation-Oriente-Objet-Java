package TP1_Java;
import java.util.Scanner;
/**
 * Décrivez votre classe exo1 ici.
 *
 * @author Etienne
 * @version (un numéro de version ou une date)
 */
public class exo1
{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        //int clavier = sc.nextInt(); // variable clavier de type entier
        int n1, n2;
        //System.out.println("Vous avez saisi : " + clavier);
        //Scanner sc1 = new Scanner(System.in);
        System.out.println("Entrer la valeur 1");
        n1 = sc.nextInt();
        //Scanner sc2 = new Scanner(System.in);
        System.out.println("entrer la valeur 2");
        n2 = sc.nextInt();
        System.out.println("La somme vaut : " + SommeNombre(n1, n2));
        System.out.println("La Difference donne : " + DifferenceNombre(n1, n2));
        System.out.println("Le produit vaut : " + ProduitNombre(n1, n2));
        System.out.println("Le quotient vaut : " + QuotientNombre(n1, n2));
        System.out.println("Le reste vaut : " + ResteNombre(n1, n2));
    }
    
    public static int SommeNombre(int nombre1, int nombre2){
        return nombre1 + nombre2;
    }
    
    public static int DifferenceNombre(int nombre1, int nombre2){
        return nombre1 - nombre2;
    }
    
    public static int ProduitNombre(int nombre1, int nombre2){
        return nombre1 * nombre2;
    }
    
    public static int QuotientNombre(int nombre1, int nombre2){
        return nombre1 / nombre2;
    }
    
    public static int ResteNombre(int nombre1, int nombre2){
        return nombre1 % nombre2;
    }
}
