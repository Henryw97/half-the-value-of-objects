package com.company;

class Tr {
    public double x;
    public double y;

    public Tr(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void Pr(){
        System.out.println("("+this.x+","+this.y+")");
    }

    public void Scale(){
        x = x/2;
        y = y/2;
    }
        }
public class Try {
    public static void main(String[] args){
        Tr t = new Tr(32, 32);
        for (int i=0; i<5; i++){
            t.Scale();
            t.Pr();
        }
    }
}
