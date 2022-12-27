package TP3_Java.Exo2;
/**
 * Décrivez votre classe Date ici.
 *
 * @author Etienne
 * @version 19:03 21/11/2021
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
    
    public Date(Date d){
        this.year = d.year;
        this.month = d.month;
        this.day = d.day;
    }
    
    @Override
    public String toString(){
        return this.day + " /" + this.month + " /" + this.year;
    }
}
