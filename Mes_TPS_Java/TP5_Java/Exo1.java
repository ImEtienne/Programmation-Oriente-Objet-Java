package TP5_Java;
import fr.lacl.cpo.Drawing ; 
/**
 * Décrivez votre classe Exo1 ici.
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 23:31 - 25/11/2021 
 */
public class Exo1
{
    /**
     * Classe main qui execute le progrmamme principal.
     * @return 
     */
    public static void main(String [] args){
        Drawing drawing = new Drawing("Rectangle", 650, 500);
        //drawing.point(100.0, 300.0);
        drawing.line(100., 100., 500., 100.);
        drawing.line(100., 300., 500., 300.);
        
        drawing.line(100., 100., 100., 300.);
        drawing.line(500., 100., 500., 300.);
    }
}
