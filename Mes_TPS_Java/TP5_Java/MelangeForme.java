package TP5_Java;
import fr.lacl.cpo.Drawing ; 
import java.util.Random;
/**
 * Décrivez votre classe MelangeAleatoireForme ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class MelangeForme
{
    public static void main(String [] args){
        int choix; 
        Drawing d = new Drawing("Mélange Forme", 650, 500);
        //drawing.point(100.0, 300.0);
        
        //Drawing d= new Drawing ("Etoile",200,200);
        int xCentre=100;
        int yCentre=100;
        int rayon=60;
        double []tabx =new double[5];
        double []taby =new double[5];
        int compteur = 0;
        while(compteur <= 3){
            choix = (int) (Math.random() *2) +1;
            if(choix == 1){
                d.line(100., 100., 500., 100.);
                d.line(100., 300., 500., 300.);
                d.line(100., 100., 100., 300.);
                d.line(500., 100., 500., 300.);
            } else {
                for (int i=0; i<=5-1;i++){
                    tabx[i]= xCentre + rayon * Math.cos(i*2*Math.PI/5);
                    taby[i]= yCentre + rayon * Math.sin(i*2*Math.PI/5);
                }
        
                for (int i=0; i<=5-1;i++){
                    d.line(tabx[i],taby[i],tabx[(i+5/2)%5],taby[(i+5/2)%5]);
                }
            }
            
            try {
                Thread.sleep(1000); //1 sec
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            d.clear();
            compteur ++;
        }
    }
}
