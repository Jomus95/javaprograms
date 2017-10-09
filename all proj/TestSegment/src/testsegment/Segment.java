/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testsegment;

import java.util.Arrays;
/**
 *Написан класс, который соответствует всем требованиям в задаче
 */
public class Segment {
  protected double x0;
  protected double x1;
  protected double y0;
  protected double y1;
  protected double length;
  

    public Segment(){
        this(Math.random()*100, Math.random()*100, Math.random()*100, Math.random()*100);
    }
    
  public Segment(double x0, double x1, double y0, double y1){
        this.x0 = x0;
        this.x1 = x1;
        this.y0 = y0;
        this.y1 = y1;
    }
    
    public double getX0 () {
        return x0;
    }
    
    public double getY0 () {
        return y0;
    }
    
    public double getX1 () {
        return x1;
    }
    
    public double getY1 () {
        return y1;
    }
    
    public double getLengthOfSegment () {
        double x0 = this.getX0();
        double y0 = this.getY0();
        double x1 = this.getX1();
        double y1 = this.getY1();
     
        length = (double) (Math.sqrt(((x1-x0)*(x1-x0))+(y1-y0)*(y1-y0)));
             
        return length;
    }
    
     public void setX1Y1 (double x1,double y1) {
        this.x1 = x1;
        this.y1 = y1;
    }
    
   
    
    @Override
    public String toString() {
        return "Отрезок с координатами: ( " + x0 + ", "+ y0 +" ), и ( " + x1 + ", "+ y1 +" ), и c длиной отрезка: " + getLengthOfSegment() + ".";
    }    
    
}