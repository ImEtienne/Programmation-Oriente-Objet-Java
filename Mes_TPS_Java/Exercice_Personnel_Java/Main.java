package Exercice_Personnel_Java;
/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Main
{
    public static void main(String [] Args){
        Point p = new Point('M', 3.4);
        System.out.println(p);
        Point p1 = new Point('S', 4.2);
        System.out.println(p1);
        p1.setAbscisse(2.4);
        System.out.println(p1);
    }
}
