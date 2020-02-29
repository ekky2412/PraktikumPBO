/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dosen;

import Main.*;

public class Dosen extends Karyawan{
    
    public void Dosen(int sks){
        int gaji = 50000;
        super.setGaji(super.getGaji()+sks*gaji);
    }
    public Dosen(int sks,String nama){
        Dosen(sks);
        super.setNama(nama);
    }
}
