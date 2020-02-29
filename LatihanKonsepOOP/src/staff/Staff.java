package staff;
import Main.*;

public class Staff extends Karyawan{
    
    public void Staff(int waktu){
        int gaji = 20000;
        super.setGaji(super.getGaji()+waktu*gaji);
    }
    public Staff(int waktu,String nama){
        Staff(waktu);
        super.setNama(nama);
    }
}
