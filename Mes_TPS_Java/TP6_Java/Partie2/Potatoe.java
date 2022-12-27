package TP6_Java.Partie2;
/**
 *
 * @author Etienne KIBONGANI LOMBO
 * @version 18:07 - 08/12/2021
 */
public class Potatoe extends Vegetable
{
    /**
     * Les attributs de la classe Potatoe
     */
    private int nombreDeGermes;
    private static final int POURCENT_GERMES = 10;
    
    /**
     * Constructeur d'objets avec des paramètres
     * @param poids et nombreDeGermes, les p
     */
    public Potatoe(double poids, int nombreDeGermes){
        super(poids);
        this.nombreDeGermes = nombreDeGermes;
    }
    /**
     * constructeur avec un seul paramètre
     * @param p, le paramètre du constructeur
     */
    public Potatoe(double p){
        super(p);
        this.nombreDeGermes = (int)(POURCENT_GERMES * p);
    }
    
    @Override
    public String toString(){
        return "Patate : " + "[" + super.toString() + " - " + this.nombreDeGermes + "yeux]";
    }
    
    public double getPeelingWeight(){
        return super.getPeelingWeight() + nombreDeGermes * 0.01;
    }
}
