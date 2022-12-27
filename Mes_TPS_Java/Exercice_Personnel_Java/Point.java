package Exercice_Personnel_Java;
/**
 * Décrivez votre classe Point ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Point
{
    private char nom;
    private double abscisse;
    
    public Point(char nom, double abscisse){
        this.nom = nom;
        this.abscisse = abscisse;
    }
    
    @Override
    public String toString(){
        return "Point de nom : " + nom + " \n" + 
                "d'abscisse : " + abscisse + "\n" + "============== \n";
                
    }
    
    public void setAbscisse(double dx){
        abscisse = dx;
    }
}
