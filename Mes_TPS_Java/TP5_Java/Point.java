package TP5_Java;
import fr.lacl.cpo.Drawing ;
/**
 * Décrivez votre classe Point ici.
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 23:31 - 25/11/2021
 */
public class Point
{
    /**
     * Les attributs de la classe Point 
     */
    private double x, y;
    private Color couleur;
    private double epaisseurDuTrait;
    /**
     * Le contruction d'objets de la classe Point 
     * @param le point des coordonnées (x,y,z) et trait
     */
    public Point(double x, double y, Color couleur, double trait ){
        this.x = x;
        this.y = y;
        this.couleur = couleur;
        this.epaisseurDuTrait = trait;
    }
    /**
     * Methode de la classe Point qui permet de modifier la couleur, l'épaisseur
     * et le point.
     * @param d le paramètre de la méthode
     */
    public void draw(Drawing d){
        //d.setColor(d);
        couleur.setColor(d);
        d.setWidth(epaisseurDuTrait);
        d.point(x,y);
    }
    /**
     * le getter du point X
     * @return x
     */
    public double getX(){
        return this.x;
    }
    /**
     * le getter du point Y
     * @return y
     */
    public double getY(){
        return this.y;
    }
}
