package TP5_Java;
import fr.lacl.cpo.Drawing ;
/**
 * Décrivez votre classe Triangle ici.
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 23:31 - 25/11/2021
 */
public class Triangle
{
    /**
     * Les attributs de la classe Triangle
     */
    private Point p1, p2, p3;
    private double epaisseurDuTrait;
    private Color couleur;
    /**
     * Le constructeur surchargé de la classe Triangle
     * @param trois points(p1,p2,p3)
     */
        public Triangle(Point p1, Point p2,Point p3, double epaisseurDuTrait){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.epaisseurDuTrait = epaisseurDuTrait;
        this.couleur = couleur;
    }
    /**
     * La méthode permet de modifier l'apparence du point et des lignes
     * à partir des méthodes prédefnies de la classe draw
     * @param d, le paramètre de la classe classe Draw
     */
    public void draw(Drawing d){
        //couleur.setColor(d);
        d.line(p1.getX(),p1.getY(), p2.getX(), p2.getY());
        d.line(p3.getX(),p3.getY(), p2.getX(), p2.getY());
        d.line(p1.getX(),p1.getY(), p3.getX(), p3.getY());
        d.setWidth(epaisseurDuTrait);
        couleur.setColor(d);
        d.point(p1.getX(),p1.getY());
        d.point(p2.getX(), p2.getY());
        d.point(p3.getX(), p3.getY());

    }
}