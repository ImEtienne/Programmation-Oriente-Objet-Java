package TP5_Java;
import fr.lacl.cpo.Drawing ; 
/**
 * Décrivez votre classe Main ici.
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 23:31 - 25/11/2021
 */
public class Main
{
    public static void main(String [] args){
        //Drawing drawing = new Drawing("Drawing", 500, 500);
        // Color c = new Color(0.1, 0.56, 0.20);
        // Point p = new Point(200., 300., c, 50.);
        // p.draw(drawing);
        
        
        //Etoile
        // Drawing d = new Drawing("Etoile", 500, 500);
        // Etoile e = new Etoile(200, 200, 100);
        // e.dessineEtoile(d);
        
        //Triangle
        // Drawing d = new Drawing("Triangle", 500, 500);
        // Color c1 = new Color(0.10, 0.20, 0.30);
        // Color c2 = new Color(0.20, 0.30, 0.40);
        // Color c3 = new Color(0.30, 0.40, 0.50);
        
        // Point p1 = new Point(100., 100., c1, 0.);
        // Point p2 = new Point(50., 100., c2, 0.);
        // Point p3 = new Point(50., 50., c3, 0.);
        // Triangle t = new Triangle(p1, p2, p3, 100.);
        // t.draw(d);
        
        //Rectangle
        // Drawing d = new Drawing("Rectangle", 650, 500);
        
        // Color c1 = new Color(0.10, 0.20, 0.30);
        // Color c2 = new Color(0.20, 0.30, 0.40);
        // Color c3 = new Color(0.30, 0.40, 0.50);
        // Color c4 = new Color(0.30, 0.40, 0.50);
        
        // Point p1 = new Point(100., 100., c1, 0.);
        // Point p2 = new Point(500., 100., c2, 0.);
        // Point p3 = new Point(100., 300., c3, 0.);
        // Point p4 = new Point(500., 300., c4, 0.);
        
        // Rectangle r = new Rectangle(p1, p2, p3, p4, 50.);
        // r.draw(d);
        
        
        //Maison
        //Drawing d = new Drawing("Maison", 650, 500);
        // Color c1 = new Color(0.10, 0.20, 0.90);
        // Color c2 = new Color(0.20, 0.30, 0.70);
        // Color c3 = new Color(0.30, 0.40, 0.50);
        // Color c4 = new Color(0., 0., 0.);
        
        // Point p1 = new Point(150., 50., c4, 0.);
        // Point p2 = new Point(100., 100., c4, 0.);
        // Point p3 = new Point(200., 100., c4, 0.);
        // Maison m = new Maison(p1, p2, p3, c1, 10.);
        // m.draw(d);
        
        // Point p4 = new Point(120., 100., c4, 0.);
        // Point p5 = new Point(180., 100., c4, 0.);
        // Point p6 = new Point(120., 150., c4, 0.);
        // Point p7 = new Point(180., 150., c4, 0.);
        // Maison m2 = new Maison(p4, p5, p6, p7,9.);
        // m2.draw2(d);
        
        //Maison 2 animation 
        Drawing d = new Drawing("Maison Animée", 650, 500);
        Color c1 = new Color(0.10, 0.20, 0.90);
        Color c2 = new Color(0.20, 0.30, 0.70);
        Color c3 = new Color(0.30, 0.40, 0.50);
        Color c4 = new Color(0., 0., 0.);

        for(double i = 0.; i < 1000. ; i +=10){
                Point p1 = new Point(150.+i, 50.+i, c4, 0.);
                Point p2 = new Point(100. +i, 100. +i, c4, 0.);
                Point p3 = new Point(200.+i, 100. +i, c4, 0.);
                Maison m = new Maison(p1, p2, p3, c1, 10.);
                m.draw(d);
            
                Point p4 = new Point(120. +i, 100. +i, c4, 0.);
                Point p5 = new Point(180. +i, 100. +i, c4, 0.);
                Point p6 = new Point(120. +i, 150. +i, c4, 0.);
                Point p7 = new Point(180. +i, 150. +i, c4, 0.);
                Maison m2 = new Maison(p4, p5, p6, p7,9.);
                m2.draw2(d);
                
                try {
                Thread.sleep(200); 
                }
                catch (InterruptedException e) {
                e.printStackTrace();
                }
        
                d.clear();
        }
    }
}
