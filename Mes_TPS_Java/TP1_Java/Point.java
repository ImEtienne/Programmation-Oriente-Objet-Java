
package TP1_Java;
/**
 * Décrivez votre classe Point ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Point
{
    private int x;
    private int y;
    public Point(int x, int y){
        this.x = x;
        this.y= y;
    }
    public Point(Point p){
        this (p.x,p.y);
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    @Override // redéfinir une méthode (c'est un décorateur)
    public boolean equals(Object o){
        if (o==null) return false;
        if(this==o) return true;
        if(this.getClass() != o.getClass()) return false;  // getClass  renvoie le type
        Point p= (Point) o;
        if (this.x == p.x && this.y == p.y)return true;
        else return false;
        //ou (this.x == p.x && this.y == p.y)
        
    }
    
    
}
