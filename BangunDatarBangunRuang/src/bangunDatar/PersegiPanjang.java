/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bangunDatar;

/**
 *
 * @author asus
 */
public class PersegiPanjang extends BangunDatar{
     private int panjang;
     private int lebar;

    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    public PersegiPanjang(int panjang,int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
        luas();
        keliling();
    }
    public void luas(){
        double luas = this.panjang*this.lebar;
        super.setLuas(luas);
    }

    public void keliling(){
        float keliling = 2*this.panjang + 2*this.lebar;
        super.setKeliling(keliling);
    }
    public void volume(){
        
    }
}
