package TP_noté_2020;
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
    
    public Date(int year, int month, int day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
    
    public Date copy(){
        return new Date (this.year, this.month, this.day);
    }
    
    @Override
    public String toString(){
        return this.day + "/" + this.month + "/" + this.year; 
    }
}
