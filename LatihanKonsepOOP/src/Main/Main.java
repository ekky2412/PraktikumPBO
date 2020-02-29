package Main;

import java.util.Scanner;
import dosen.*;
import staff.*;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input nama : ");
        String nama = input.nextLine();
        System.out.print("Input jumlah SKS : ");
        int sks = input.nextInt();
        Karyawan user1 = new Dosen(sks,nama);
        System.out.println("Dosen 1 : "+user1.getNama()
                           +" dengan gaji : "+user1.getGaji());
        System.out.println("");
        input.nextLine();
        System.out.print("Input nama : ");
        String nama2 = input.nextLine();
        System.out.print("Input jumlah jam kerja : ");
        int jam = input.nextInt();
        Karyawan user2 = new Staff(jam,nama2);
        System.out.println("Staff 1 : "+user2.getNama()
                           +" dengan gaji : "+user2.getGaji());
    }
    
}
