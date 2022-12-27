package TP1_Java.Exo4;
/**
 * Décrivez votre classe Inventaire ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Inventaire
{
    private Pc [] pc ;
    private Imprimante [] imprimante;
    private Portable [] portable;
    public Inventaire(Pc [] pc,Imprimante [] imprimante, Portable [] portable){
        this.pc = pc;
        this.imprimante = imprimante;
        this.portable = portable;
    }
}
