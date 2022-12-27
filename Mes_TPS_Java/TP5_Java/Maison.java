package TP5_Java;
import fr.lacl.cpo.Drawing ;
/**
 * Décrivez votre classe Maison ici.
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 21:24 - 30/11/2021
 */
public class Maison
{
    /**
     * Les attributs de la classe Maison
     */
    private Point p1, p2, p3, p4;
    private double epaisseurDuTrait;
    private Color couleur;
    /**
     * Le constructeur d'objet de la classe Maison (La tête de la classe maison avec 
     * une forme triangulaire)
     * @param p1, p2, p3, couleur, epaisseurDuTrait, le paramètre du constructeur
     */
    public Maison(Point p1, Point p2, Point p3, Color couleur, double epaisseurDuTrait){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.couleur = couleur;
        this.epaisseurDuTrait = epaisseurDuTrait;
    }
    /**
     * Le constructeur d'objet (surchargé) permet de construire la suite de la classe maison avec
     * une forme rectangulaire
     * @param p1, p2, p3, p4, epaisseurDuTrait
     */
    public Maison(Point p1, Point p2, Point p3,Point p4, double epaisseurDuTrait){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        //this.couleur = couleur;
        this.epaisseurDuTrait = epaisseurDuTrait;
    }
    /**
     * La méthode dessine 3 lignes et 3 points de cette même classe.(Le triangle ou notre dessin)
     * @param d, le paramètre du méthode 
     */
    public void draw(Drawing d){
        couleur.setColor(d);
        d.setWidth(epaisseurDuTrait);
        d.line(p1.getX(),p1.getY(), p2.getX(), p2.getY());
        d.line(p3.getX(),p3.getY(), p2.getX(), p2.getY());
        d.line(p1.getX(),p1.getY(), p3.getX(), p3.getY());
        //couleur.setColor(d);
        d.setWidth(epaisseurDuTrait);
        d.point(p1.getX(),p1.getY());
        d.point(p2.getX(), p2.getY());
        d.point(p3.getX(), p3.getY());
    }
    /**
     * La méthode dessine 4 lignes et 4 points afin de former un rectangle qui nous permet d'avoir
     * notre maison en entière.
     * @param d, le paramètre de la méthode 
     */
    public void draw2(Drawing d){
        //couleur.setColor(d);
        d.setWidth(epaisseurDuTrait);
        d.line(p1.getX(),p1.getY(), p2.getX(), p2.getY());
        d.line(p1.getX(),p1.getY(), p3.getX(), p3.getY());
        d.line(p2.getX(),p2.getY(), p4.getX(), p4.getY());
        d.line(p3.getX(),p3.getY(), p4.getX(), p4.getY());
        
        //couleur.setColor(d);
        d.setWidth(epaisseurDuTrait);
        d.point(p1.getX(), p1.getY());
        d.point(p2.getX(), p2.getY());
        d.point(p3.getX(), p3.getY());
        d.point(p4.getX(), p4.getY());
    }
}
