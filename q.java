package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q {
    public static void main(String[] args) {
     Queue<String> antrian = new LinkedList<>();
     Scanner pilih = new Scanner(System.in);
     String angka;
     int i=0;
     boolean bool = true;
    
     do{
        System.out.println("Pilih Operasi Queue");
        System.out.println("1. Masukkan Antrian");
        System.out.println("2. Keluarkan Antrian");
        System.out.println("3. Cek Antrian");
        System.out.println("4. Banyak Antrian");
        System.out.println("5. Selesai");
        System.out.print("MASUKAN PILIHAN [1-5]: ");
        int input=pilih.nextInt();
    switch(input){
        case 1:
            System.out.print("Banyak Antrian yang akan di masukkan: ");
            i=0;
            int h=pilih.nextInt();
            do{
                System.out.print("Masukan Antrian: ");
                angka=pilih.next();
                antrian.add(angka);
                i++;
            }
            while(i<h);
            System.out.println("Antrian: "+antrian);
            System.out.println("");
            break;

        case 2:
            System.out.println("Keluarkan antrian: "+antrian.remove());
            System.out.println("Antrian: "+antrian);
            System.out.println("");
            break;

        case 3:
            System.out.println("Cek antrian: "+antrian.isEmpty());
            System.out.println("");
            break; 

        case 4:
            System.out.println("Banyak antrian: "+antrian.size());
            System.out.println("");
            break; 
        
        case 5:
            System.exit(0);
            break;
        
        default:
        System.err.println("Pilihan tidak tersedia!");
        System.out.println("");
    }
}
while(bool);
    
    }
}
