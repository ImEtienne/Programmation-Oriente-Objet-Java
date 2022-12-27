package TP5_Java;
import fr.lacl.cpo.Drawing;
/**
 * Décrivez votre classe Etoile ici.
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 23:31 - 25/11/2021
 */
public class Etoile
{
    /**
     * Les attributs de la classe Etoile
     */
    private static final int VALEUR = 5;
    private int xCentre;
    private int yCentre;
    private int rayon;
    private double [] tabX;
    private double [] tabY;
    /**
     * Le constructeur surchargé de la classe Etoile
     * @param (x,y,z)
     */
    public Etoile(int xCentre, int yCentre, int rayon){
        this.tabX = new double[VALEUR];
        this.tabY = new double[VALEUR];
        this.xCentre = xCentre;
        this.yCentre = yCentre;
        this.rayon = rayon;
    }
    /**
     * methode de la classe Etoile qui nous permet d'avoir l'affichage.
     * @param d, le paramètre de la méthode
     */
    public void dessineEtoile(Drawing d){
        for (int i= 0; i < VALEUR; i++){
            d.line(tabX[i],tabY[i],tabX[(i+5/2)%5],tabY[(i+5/2)%5]);
        }
        
        for (int i= 0; i < VALEUR; i++){
            tabX[i]= xCentre + rayon * Math.cos(i*2*Math.PI/5);
            tabY[i]= yCentre + rayon * Math.sin(i*2*Math.PI/5);
        }
    }
}
