package TP6_Java.Partie2;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Décrivez votre classe Soupe ici.
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 18:07 - 08/12/2021
 * 
 */
public class Soup
{
    /**
     * 
     */
    List <Vegetable> l;
    /**
     * Le constructeur d'objets sans paramètre
     */
    public Soup(){
        l = new ArrayList();
    }
    /**
     * Méthode ajout dans une liste
     */
    public void add(Vegetable vegetable){
          l.add(vegetable);
    }
    /**
     * méthode qui permet de parcourir la liste et d'afficher avec un foreach
     */
    @Override
    public String toString(){
        String s = "Soupe \n---------\n";
        for(Vegetable vegetable : l){
            s = s + vegetable + "\n";
        }
        return s;
    }
    
    public double getPeelingWeight(){
        double resultat= 0;
        for(Vegetable vegetable : l){
            resultat += vegetable.getPeelingWeight();
        }
        return resultat;
    }
    public void sortByWeight(){
        Collections.sort(l);
    }
}
