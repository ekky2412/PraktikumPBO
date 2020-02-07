import java.util.Scanner;
public class InputNilaiPerulangan {
    public static void main(String[] args) {
        Scanner scanInput = new Scanner(System.in);
        String nama;
        System.out.print("Nama : ");
        nama= scanInput.nextLine();
        int nominal;
        float rataRata=0;
        int min = 9999999,max = 0;        
        System.out.print("Banyak nilai yang diinput : ");
        nominal=scanInput.nextInt();
        int nilai[] = new int[nominal];
        for(int i=0;i<nominal;i++){
            System.out.print("Nilai ke-"+(i+1)+" : ");
            nilai[i]=scanInput.nextInt();
            rataRata+=nilai[i];
            if(i==0){
                max=nilai[0];
                min=nilai[0];
            }
                if(nilai[i]>max){
                    max=nilai[i];
                }
                if(nilai[i]<min){
                    min=nilai[i];
            }
        }
        System.out.println("");System.out.println("");
        System.out.println("Nama : "+nama);
        System.out.println("Nilai Tertinggi : "+max);
        System.out.println("Nilai Terendah : "+min);
        System.out.println("Rata-rata Nilai : "+(rataRata/nominal));
    }
    

}
