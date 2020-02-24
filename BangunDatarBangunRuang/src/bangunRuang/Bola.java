/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunRuang;

import bangunDatar.Lingkaran;
import java.lang.Math.*;

/**
 *
 * @author asus
 */
public class Bola extends Lingkaran{
    private double volume;
    
    public Bola(int jari){
        super(jari);
        volume();
        luasPermukaan();
    }
    public void luasPermukaan(){
        super.setLuas(super.Luas()*4);
    }

    @Override
    public void volume(){
        this.volume = Math.pow(super.getJari(), 3)*super.getPhi()*4/3;
    }

    public double getVolume() {
        return volume;
    }
}
