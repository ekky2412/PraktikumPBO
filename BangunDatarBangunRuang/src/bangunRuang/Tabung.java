/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

import bangunDatar.Lingkaran;

/**
 *
 * @author asus
 */
public class Tabung extends Lingkaran{
    private double volume;
    private int tinggi;
    
    public Tabung(int jari,int tinggi){
        super(jari);
        this.tinggi=tinggi;
        volume();
        luasPermukaan();
    }
    public void luasPermukaan(){
        super.setLuas(2*super.getLuas()+super.getKeliling()*tinggi);
    }

    public void volume(){
        this.volume = super.getLuas()*this.tinggi;
    }

    public double getVolume() {
        return volume;
    }
}
