package TP6_Java.Partie2;
/**
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 18:07 - 08/12/2021
 */
public class Carrot extends Vegetable
{
    /**
     * L'attribut de la classe
     */
    private int longueur;
    /**
     * Le constructeur d'objets (surchargé) 
     * @param poids et longeur, les paramètres du constructeur
     */
    public Carrot(double poids, int longueur){
        super(poids);
        this.longueur = longueur;
    }
    /**
     * Méthode permet de faire l'affichage optimisée 
     */
    @Override
    public String toString(){
        return "Carotte : " + "[" + super.toString() + " - "+ this.longueur + "cm]";
    }
}
