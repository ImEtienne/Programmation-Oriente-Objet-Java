package TP4_Java;
/**
 * Décrivez votre classe Racine ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Racine
{
    private double precision;
    Racine(double precision){
         this.precision = precision;
    }
    public double racine(double operande) throws EtendantException {
        if (operande < 0) {
            throw (new EtendantException("erreur : l'operande doit être > 0, valeur entree : " + operande));
        }
         double solution, carre, a, b;
         a = 0;
         b = operande;
         solution = (a + b) / 2;
        while (b - a > precision){
            carre = solution * solution;
            if (carre > operande) b = solution;
            else a = solution;
            solution = (a + b) / 2;
        }
        return solution;
    }
    public double getPrecision() { 
        return precision; 
    }
    public void setPrecision(double precision) { 
        this.precision = precision; 
    }
}