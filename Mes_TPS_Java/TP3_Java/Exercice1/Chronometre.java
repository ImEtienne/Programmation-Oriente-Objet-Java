package TP3_Java.Exercice1;
/**
 * Décrivez votre classe Chronometre ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Chronometre
{
    /**
     * Les attributs
     */
    private long debut; 
    /**
     * @param debut
     * Les constructeurs 
     */
    public Chronometre(){
        debut = System.nanoTime();
    }
    /**
     * @dureeMicro
     * @return
     */
    public long dureeMicro(){
        return (System.nanoTime() - debut) / 1000;
    }
    public long dureeMilli(){
        return  dureeMicro()/1000000;
    }
    public void reset(){
        debut = System.nanoTime();
    }
}
