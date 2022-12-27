package TP6_Java.Partie1;
/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Main
{
    public static void main(String [] args){
        Carrot c = new Carrot(0.25, 30);
        Potatoe pdt1 = new Potatoe(0.3, 10);
        Potatoe pdt2 = new Potatoe(0.3);
        System.out.println(c);
        System.out.println(pdt1);
        System.out.println(pdt2);
    }
}
