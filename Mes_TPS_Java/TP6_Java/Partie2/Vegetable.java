package TP6_Java.Partie2;
/**
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 18:07 - 08/12/2021
 */
public abstract class Vegetable implements Comparable<Vegetable>
{
    /**
     * L'attribut de la classe 
     */
    private double poids;
    
    /**
     * le constructeur avec un seul paramètre permettant de modifier la valeur de la variable "poids"
     */
    public Vegetable(double poids){
        this.poids = poids;
    }
    /**
     * La méthode toString redefinit afin d'afficher le poids du Vegetable
     */
    @Override
    public String toString(){
        return this.poids + "Kg";
    }
    /**
     * Méthode qui donne le poids des épluchures générées lors de la préparation de cette soupe. 
     */
    public double getPeelingWeight(){
        return this.poids * 0.1;
    }
    /**
     * méthode qui permet de faire de comparer chaque Vegetable
     * @param vegetable, le paramètre de la méthode
     */
    @Override 
    public int compareTo(Vegetable vegetable){
        return (int)Math.floor(this.poids - vegetable.poids);
    }
}
