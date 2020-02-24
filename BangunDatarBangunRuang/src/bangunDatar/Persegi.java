package bangunDatar;

/**
 *
* @author asus
 */
public class Persegi extends BangunDatar {
    private int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
        luas();keliling();
    }
    public void luas(){
        double luas = this.sisi*this.sisi;
        super.setLuas(luas);
    }

    public void keliling(){
        super.setKeliling(4*this.sisi);
    }

    public int getSisi() {
        return sisi;
    }

    public void volume() {
    }
    
}
