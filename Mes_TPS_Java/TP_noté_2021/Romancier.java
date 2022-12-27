package TP_noté_2021;


/**
 * Décrivez votre classe Romancier ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Romancier
{
    private String nomMaisonEdition;
    private TypeAuteur type;
    
    public Romancier(String nomMaisonEdition, TypeAuteur type){
        this.nomMaisonEdition = nomMaisonEdition;
        this.type = type;
    }
    
    @Override
    public String toString(){
        return this.nomMaisonEdition;
    }
}
