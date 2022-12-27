package TP5_Java;
import fr.lacl.cpo.Drawing ; 
/**
 * Décrivez votre classe MelangeAleatoire ici.
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 19:09 - 01/12/2021
 */
public class MelangeAvecTempo
{
    public static void main(String [] args){
        Drawing d = new Drawing("Mélange Aléatoire", 650, 500);
        //drawing.point(100.0, 300.0);
        d.line(100., 100., 500., 100.);
        d.line(100., 300., 500., 300.);
        d.line(100., 100., 100., 300.);
        d.line(500., 100., 500., 300.);
        
        //========================//
        try {
            Thread.sleep(4000); //4 secs
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        d.clear();
        
        //Drawing d= new Drawing ("Etoile",200,200);
        int xCentre=100;
        int yCentre=100;
        int rayon=60;
        double []tabx =new double[5];
        double []taby =new double[5];
        for (int i=0; i<=5-1;i++){
            tabx[i]= xCentre + rayon * Math.cos(i*2*Math.PI/5);
            taby[i]= yCentre + rayon * Math.sin(i*2*Math.PI/5);
        }
    
        for (int i=0; i<=5-1;i++){
            d.line(tabx[i],taby[i],tabx[(i+5/2)%5],taby[(i+5/2)%5]);
        }
        
        //==========================
    }
    
}
