package TP1_Java;
import java.util.ArrayList;

/**
 * Décrivez votre classe main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class main
{
    public static void main(String [] Args){
        /*Point p = new Point();
        System.out.println(p.getX() +" "+ p.getY());
        p.setX(5);
        System.out.println(p.getX() +" "+ p.getY());*/
        
        /*Point p1 = new Point(1,2);
        Point p2 = p1;
        Point p3 = new Point(1,2);
        System.out.println(p1== p2);
        System.out.println(p1 == p3);*/
        
        Point p1 = new Point(1,2);
        Point p2 = p1;
        Point p3 = new Point(1,2);
        ArrayList<Point> list = new ArrayList();
        list.add(p1);
        System.out.println(list.indexOf(p2));
        System.out.println(list.indexOf(p3));
    }
}
