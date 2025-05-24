public class Mahasiswa {
    private String nim;
    private String nama;
    private String prodi;
    private String kelas;

    public Mahasiswa(String nim, String nama, String prodi, String kelas) {
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.kelas = kelas;
    }

    public void tampilkanData() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Program Studi: " + prodi);
        System.out.println("Kelas: " + kelas);
        System.out.println("--------------------------");
    }

    // Getter methods
    public String getNim() { return nim; }
    public String getNama() { return nama; }
    public String getProdi() { return prodi; }
    public String getKelas() { return kelas; }

    // Setter methods
    public void setNim(String nim) { this.nim = nim; }
    public void setNama(String nama) { this.nama = nama; }
    public void setProdi(String prodi) { this.prodi = prodi; }
    public void setKelas(String kelas) { this.kelas = kelas; }
}