package TP5_Java;
import fr.lacl.cpo.Drawing;

/**
 * Décrivez votre classe Color ici.
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 23:31 - 25/11/2021
 */
public class Color
{
    /**
     * Les attributs de la classe Color.
     */
    private double red;
    private double green;
    private double blue;
    
    /**
     * Le constructeur surchargé de la classe
     * @param (red,green,blue) 
     * 
     */
    public Color(double red, double green, double blue){
        this.red = red;
        this.green = green;
        this.blue = blue;
    }
    /**
     * La methode qui permet de modifier la couleur
     * @param d, le paramètre de la méthode
     */
    public void setColor(Drawing d){
        d.setColor(red, green, blue);
    }
    /**
     * cette méthode rend la varaible 'red' accessible en dehors de la classe
     * @return red
     */
    public double getRed(){
        return this.red;
    }
    /**
     * cette méthode rend la varaible 'green' accessible en dehors de la classe
     * @return 'green'
     */
    public double getGreen(){
        return this.green;
    }
    /**
     * cette méthode rend la variable 'blue' accessible en dehors de la classe
     * @return blue
     */
    public double getBlue(){
        return this.blue;
    }
}
