package queue;

import java.io.DataInput;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class q {
    public static void main(String[] args) {
     Queue<Integer1> antrian = new LinkedList<>();
     Scanner pilih=new Scanner(System.in);
     Integer angka;
     int i=0;
     boolean bool = true;
    
     do{
        System.out.println("Pilih Operasi Queue");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Selesai");
        System.out.print("MASUKAN PILIHAN [1-3]: ");
        int input=pilih.nextInt();
    switch(input){
        case 1:
            System.out.print("Banyak data yang akan di masukkan: ");
            i=0;
            int h=pilih.nextInt();
            do{
                System.out.print("Masukan angka: ");
                angka=pilih.nextInt();
                antrian.add(angka);
                i++;
            }
            while(i<h);
            System.out.println("Queue: "+antrian);
            System.out.println("");
            break;

        case 2:
            System.out.println("Elemen yang di ambil: "+antrian.remove());
            System.out.println("");
            break;
        
        case 3:
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
