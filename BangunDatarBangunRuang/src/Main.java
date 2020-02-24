import java.util.Scanner;
import bangunDatar.*;
import bangunRuang.*;

public class Main {

    public static void main(String[] args) {
        char kembali;
        Scanner input = new Scanner(System.in);
        do{
        int menu,menu2;
        System.out.println("== Menu ==");
        System.out.println("1. Bangun Datar");
        System.out.println("2. Bangun Ruang");
        System.out.print("Pilih : ");
        menu=input.nextInt();
        switch(menu){
            case 1:
                System.out.println("== Menu Bangun Datar ==");
                System.out.println("1. Persegi");
                System.out.println("2. Persegi Panjang");
                System.out.println("3. Lingkaran");
                System.out.print("Pilih : ");
                menu2=input.nextInt();
                switch(menu2){
                    case 1:
                        System.out.print("Input Sisi : ");
                        BangunDatar bPersegi = new Persegi(input.nextInt());
                        System.out.println("Luas Persegi : "+bPersegi.Luas());
                        System.out.println("Keliling Persegi : "+bPersegi.Keliling());
                        break;
                    case 2:
                        System.out.print("Input Panjang : ");
                        int panjang=input.nextInt();
                        System.out.print("Input Lebar : ");
                        BangunDatar bPersegiPanjang = new PersegiPanjang(panjang,input.nextInt());
                        System.out.println("Luas Persegi : "+bPersegiPanjang.Luas());
                        System.out.println("Keliling Persegi : "+bPersegiPanjang.Keliling());
                        break;
                    case 3:
                        System.out.print("Input Jari-jari : ");
                        BangunDatar bLingkaran = new Lingkaran(input.nextInt());
                        System.out.println("Luas Persegi : "+bLingkaran.Luas());
                        System.out.println("Keliling Persegi : "+bLingkaran.Keliling());
                        break;
                }
                break;
            case 2:
                System.out.println("== Menu Bangun Ruang ==");
                System.out.println("1. Kubus");
                System.out.println("2. Balok");
                System.out.println("3. Tabung");
                System.out.println("4. Limas Persegi");
                System.out.println("5. Limas Persegi Panjang");
                System.out.println("6. Bola");
                System.out.print("Pilih : ");
                menu2=input.nextInt();
                switch(menu2){
                    case 1:
                        System.out.print("Input Sisi : ");
                        Kubus bKubus = new Kubus(input.nextInt());
                        System.out.println("Luas Kubus : "+bKubus.Luas());
                        System.out.println("Volume Kubus : "+bKubus.getVolume());
                        break;
                    case 2:
                        System.out.print("Input Panjang : ");
                        int panjang=input.nextInt();
                        System.out.print("Input Lebar : ");
                        int lebar=input.nextInt();
                        System.out.print("Input Tinggi : ");
                        Balok bBalok = new Balok(panjang,lebar,input.nextInt());
                        System.out.println("Luas Permukaan Balok : "+bBalok.Luas());
                        System.out.println("Volume Balok : "+bBalok.getVolume());
                        break;
                    case 3:
                        System.out.print("Input Jari-jari : ");
                        int jari=input.nextInt();
                        System.out.print("Input Tinggi : ");
                        Tabung bTabung = new Tabung(jari,input.nextInt());
                        System.out.println("Luas Permukaan Tabung : "+bTabung.Luas());
                        System.out.println("Volume Tabung : "+bTabung.getVolume());
                        break;
                    case 4:
                        System.out.print("Input Sisi Persegi : ");
                        int sisi=input.nextInt();
                        System.out.print("Input Tinggi : ");
                        LimasPersegi bLimas = new LimasPersegi(sisi,input.nextInt());
                        System.out.println("Luas Permukaan Limas Persegi : "+bLimas.Luas());
                        System.out.println("Volume Limas Persegi : "+bLimas.getVolume());
                        break;
                    case 5:
                        System.out.print("Input Panjang : ");
                        panjang=input.nextInt();
                        System.out.print("Input Lebar : ");
                        lebar=input.nextInt();
                        System.out.print("Input Tinggi : ");
                        LimasPersegiPanjang bLimasPersegiPanjang = new LimasPersegiPanjang(panjang,lebar,input.nextInt());
                        System.out.println("Luas Permukaan Limas Persegi Panjang : "+bLimasPersegiPanjang.Luas());
                        System.out.println("Volume Limas Persegi Panjang : "+bLimasPersegiPanjang.getVolume());
                        break;
                    case 6:
                        System.out.print("Input Jari-jari : ");
                        Bola bBola = new Bola(input.nextInt());
                        System.out.println("Luas Permukaan Limas Bola : "+bBola.Luas());
                        System.out.println("Volume Limas Bola : "+bBola.getVolume());
                        break;
                }
                break;
        }
            System.out.print("Kembali? (y/n):");
            kembali=input.next().charAt(0);
    }while(kembali=='y');
}
    
}
