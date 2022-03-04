package linked_list;

import java.util.LinkedList;

public class Tugas3 {
    public static void main(String[] args) {
        LinkedList <String> nama_mahasiswa = new LinkedList<>();
        LinkedList <Integer> no_bp = new LinkedList<>();
        LinkedList <String> alamat = new LinkedList<>();

        nama_mahasiswa.add("khairin nisa");
        no_bp.add(2111523024);
        alamat.add("Bunga pasang 1");

        System.out.println("nama mahasiswa : "+nama_mahasiswa);
        System.out.println("no bp : "+no_bp);
        System.out.println("alamat : "+alamat);

        System.out.println("-----------------------------");
        
        //menambahkan element
        //nama mahasiswa
        nama_mahasiswa.addFirst("Puti Dian");
        nama_mahasiswa.add("Nayla");
        nama_mahasiswa.add("abelgia");
        nama_mahasiswa.addLast("abimanyu");
        System.out.println("output tambah nama mahasisswa : "+nama_mahasiswa+", Ukuran :" +nama_mahasiswa.size());

        //no bp
        no_bp.addFirst(2111521011);
        no_bp.addLast(2111523027);
        no_bp.add(2111522032);
        no_bp.add(2111521017);
        System.out.println("output tambah no bp : "+no_bp+", Ukuran :" +no_bp.size());

        //alamat
        alamat.addFirst("pasar baru");
        alamat.addLast("Painan");
        alamat.add("bayang");
        alamat.add("kambang");
        System.out.println("output tambah alamat : "+alamat+", Ukuran :" +alamat.size());

        System.out.println("-----------------------------");

        //sisipkan element
         //nama mahasiswa
         nama_mahasiswa.set(3,"alvaro febryan");
         nama_mahasiswa.set(1,"lyana");
         nama_mahasiswa.set(2,"arga jordan");
         nama_mahasiswa.set(4,"celine alexandra");
         System.out.println("output sisip nama mahasiswa : "+nama_mahasiswa+", Ukuran :" +nama_mahasiswa.size());
 
         //no bp
         no_bp.set(2,2011521031);
         no_bp.set(1,1911522019);
         no_bp.set(3,2011523027);
         no_bp.set(4,2111521029);
         System.out.println("output sisip no bp : "+no_bp+", Ukuran :" +no_bp.size());
 
         //alamat
         alamat.set(1,"jl.kemerdekaan");
         alamat.set(4,"jl.perintis");
         alamat.set(3,"jl.raden saleh");
         alamat.set(2,"jl.irigasi");
         System.out.println("output sisip alamat : "+alamat+", Ukuran :" +alamat.size());

         System.out.println("-----------------------------");

         //remove element
         //nama mahasiswa
         nama_mahasiswa.removeFirst();
         nama_mahasiswa.remove("lyana");
         nama_mahasiswa.removeLast();
         System.out.println("output hapus nama mahasiswa : "+nama_mahasiswa+", Ukuran :" +nama_mahasiswa.size());
 
         //no bp
         no_bp.removeFirst();
         no_bp.remove(1);
         no_bp.removeLast();
         System.out.println("output hapus no bp : "+no_bp+", Ukuran :" +no_bp.size());
 
         //alamat
         alamat.removeFirst();
         alamat.remove("jl.irigasi");
         alamat.removeLast();
         System.out.println("output hapus alamat : "+alamat+", Ukuran :" +alamat.size());

         System.out.println("-----------------------------");
         
         //get
         //nama mahasiswa
         System.out.println("output get nama mahasiswa : "+nama_mahasiswa.getFirst());
         System.out.println("output get nama mahasiswa : "+nama_mahasiswa.getLast());
         //no_bp
         System.out.println("output get no bp : "+no_bp.getFirst());
         System.out.println("output get no bp : "+no_bp.getLast());
 

         //alamat
         System.out.println("output get alamat : "+alamat.getFirst());
         System.out.println("output get alamat : "+alamat.getLast());

         System.out.println("-----------------------------");

         //push dan pop
         //pop
         nama_mahasiswa.pop();
         System.out.println("output pop alamat : "+nama_mahasiswa );
         no_bp.pop();
         System.out.println("output pop alamat : "+no_bp );
         alamat.pop();
         System.out.println("output pop alamat : "+alamat);

         System.out.println("-----------------------------");

         //push
         nama_mahasiswa.push("jelita");
         System.out.println("output push alamat : "+nama_mahasiswa);
         no_bp.push(2011521001);
         System.out.println("output push alamat : "+no_bp);
         alamat.push("jl.sumpah pemuda");
         System.out.println("output push alamat : "+alamat );


         
 





 






    }
}
