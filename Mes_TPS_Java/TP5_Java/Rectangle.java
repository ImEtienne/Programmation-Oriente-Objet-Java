package TP5_Java;
import fr.lacl.cpo.Drawing ;

/**
 * Décrivez votre classe Rectangle ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Rectangle
{
    /**
     * Les attributs de la classe Rectangle
     */
    private Point p1, p2, p3, p4;
    private double epaisseurDuTrait;
    private Color couleur;
    /**
     * Le construction d'objets avec paramètre
     * @param p1, p2, p3, p4, epaisseurDuTrait
     */
    public Rectangle(Point p1, Point p2, Point p3, Point p4, double epaisseurDuTrait){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.epaisseurDuTrait = epaisseurDuTrait;;
    }
    /**
     * La méthode permet de modifier l'apparence du point et des lignes à partir 
     * des méthodes prédefnies de la classe draw
     * @param d, le paramètre de la classe classe Draw
     */
    public void draw(Drawing d){
        //couleur.setColor(d);
        d.line(p1.getX(),p1.getY(), p2.getX(), p2.getY());
        d.line(p1.getX(),p1.getY(), p3.getX(), p3.getY());
        d.line(p2.getX(),p2.getY(), p4.getX(), p4.getY());
        d.line(p3.getX(),p3.getY(), p4.getX(), p4.getY());
        d.setWidth(epaisseurDuTrait);
        
        //couleur.setColor(d);
        d.point(p1.getX(),p1.getY());
        d.point(p2.getX(), p2.getY());
        d.point(p3.getX(), p3.getY());
        d.point(p4.getX(), p4.getY());
    }
}
