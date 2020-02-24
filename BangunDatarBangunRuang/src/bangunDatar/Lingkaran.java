package bangunDatar;

public class Lingkaran extends BangunDatar{
    private int jari;
    final double phi=3.14159;

    public double getPhi(){
        return phi;
    }
    
    public int getJari() {
        return jari;
    }

    public Lingkaran(int jari) {
        this.jari = jari;
        luas();
        keliling();
    }
    public void luas(){
        super.setLuas(phi*jari*jari);
    }

    public void keliling(){
        super.setKeliling(phi*jari*2);
    }
    
    public void volume(){
    
    }
}
