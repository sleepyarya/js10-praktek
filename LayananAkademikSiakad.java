import java.util.Scanner;

public class LayananAkademikSiakad {
    public static void main(String[] args) {
        // Initialize scanner
        Scanner input = new Scanner(System.in);
        
        // Input queue capacity
        System.out.print("Masukkan kapasitas antrian: ");
        int kapasitas = input.nextInt();
        input.nextLine(); // consume newline
        
        // Initialize queue
        AntrianLayanan antrian = new AntrianLayanan(kapasitas);
        
        int pilih;
        do {
            System.out.println("\n=== Menu Antrian Layanan Akademik ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Layani Mahasiswa");
            System.out.println("3. Lihat Antrian Terdepan");
            System.out.println("4. Lihat Semua Antrian");
            System.out.println("5. Cek Jumlah Antrian");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            pilih = input.nextInt();
            input.nextLine(); // consume newline

            switch (pilih) {
                case 1:
                    System.out.print("NIM: ");
                    String nim = input.nextLine();
                    System.out.print("Nama: ");
                    String nama = input.nextLine();
                    System.out.print("Prodi: ");
                    String prodi = input.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = input.nextLine();
                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.tambahAntrian(mhs);
                    break;
                    
                case 2:
                    Mahasiswa dilayani = antrian.layaniMahasiswa();
                    if (dilayani != null) {
                        System.out.println("Mahasiswa yang dilayani:");
                        dilayani.tampilkanData();
                    }
                    break;
                    
                case 3:
                    antrian.lihatTerdepan();
                    break;
                    
                case 4:
                    antrian.tampilkanSemua();
                    break;
                    
                case 5:
                    System.out.println("Jumlah antrian: " + antrian.getJumlahAntrian());
                    break;
                    
                case 6:
                    System.out.println("Terima kasih");
                    break;
                    
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        } while (pilih != 6);
        
        input.close();
    }
}