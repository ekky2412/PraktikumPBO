package bangunRuang;

import bangunDatar.*;
import java.lang.Math.*;

public class Kubus extends Persegi{
    private double volume;
    
    public Kubus(int sisi){
        super(sisi);
        volume();
        luasPermukaan();
    }
    
    public void luasPermukaan(){
        super.setLuas(6*super.getLuas());
    }
    
    public void volume(){
        this.volume = super.getLuas()*super.getSisi();
    }

    public double getVolume() {
        return volume;
    }
    
}
