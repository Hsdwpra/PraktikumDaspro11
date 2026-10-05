import java.util.Scanner;

public class StudiKasus211 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Nama mahasiswa : ");
        String nama = input.nextLine();
        
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA): ");
        String jenisKegiatan = input.nextLine();
        
        // Pemilihan cabang lomba
        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || 
            jenisKegiatan.equalsIgnoreCase("BAKORMA") || 
            jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            
            System.out.print("Jumlah dokumen: ");
            int dokumen = input.nextInt();
            
            System.out.print("Peringkat juara: ");
            int peringkat = input.nextInt();
            
            
            if (peringkat >= 1 && peringkat <= 3) {
                // Cek kelengkapan dokumen
                if (dokumen == 4) {
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurang = 4 - dokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " + kurang + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status: Tidak memperoleh dana penghargaan (hanya untuk Juara 1/2/3).");
            }
            
        } 
      
        
        input.close();
    }
}