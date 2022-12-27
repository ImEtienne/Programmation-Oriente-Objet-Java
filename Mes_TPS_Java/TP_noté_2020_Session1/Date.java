package TP_noté_2020_Session1;


/**
 * Décrivez votre classe Date ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Date
{
    private int year;
    private int month;
    private int day;
    
    public Date(int year,int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public Date(Date d){
        this.year = d.year;
        this.month = d.month;
        this.day = d.day;
    }
    
    @Override
    public String toString(){
        return this.year + "/" + this.month + "/" + this.day;
    }
}
