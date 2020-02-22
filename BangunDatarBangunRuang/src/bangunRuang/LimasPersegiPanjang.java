/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

import bangunDatar.*;
import java.lang.Math.*;
/**
 *
 * @author asus
 */
public class LimasPersegiPanjang extends PersegiPanjang{
    private int tinggi;
    private double volume;
    public LimasPersegiPanjang(int panjang,int lebar,int tinggi) {
        super(panjang,lebar);
        this.tinggi = tinggi;
        volume();
        luasPermukaan();
    }
    
    public void luasPermukaan(){
        super.setLuas(super.getLuas()
                +(2*super.getLebar()*this.tinggiSegitigaLebar()/2)
                +(2*super.getPanjang()*this.tinggiSegitigaPanjang()/2));
    }
    
    public double tinggiSegitigaLebar(){
        return Math.sqrt(Math.pow(this.tinggi, 2)+Math.pow((super.getLebar()/2), 2));
    }
    
    public double tinggiSegitigaPanjang(){
        return Math.sqrt(Math.pow(this.tinggi, 2)+Math.pow((super.getPanjang()/2), 2));
    }

    public void volume(){
        this.volume = super.getLuas()*tinggi/3;
    }

    public double getVolume() {
        return volume;
    }
}
