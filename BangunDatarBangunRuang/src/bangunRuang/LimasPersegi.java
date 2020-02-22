/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;
import java.lang.Math.*;
import bangunDatar.*;

/**
 *
 * @author asus
 */
public class LimasPersegi extends Persegi{
    private int tinggi;
    private double volume;
    public LimasPersegi(int sisi,int tinggi) {
        super(sisi);
        this.tinggi = tinggi;
        volume();
        luasPermukaan();
    }
    
    public void luasPermukaan(){
        super.setLuas(super.getLuas()+(4*super.getSisi()*this.tinggiSegitiga()/2));
    }
    
    public double tinggiSegitiga(){
        return Math.sqrt(Math.pow(this.tinggi, 2)+Math.pow((super.getSisi()/2), 2));
    }

    public void volume(){
        this.volume = super.getLuas()*tinggi/3;
    }

    public double getVolume() {
        return volume;
    }
}
