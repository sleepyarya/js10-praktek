public class AntrianKRS {
    private Mahasiswa[] data;
    private int front, rear, size, max;
    private int jumlahDilayani;

    public AntrianKRS(int max) {
        this.max = max;
        this.data = new Mahasiswa[max];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
        this.jumlahDilayani = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void clear() {
        front = 0;
        rear = -1;
        size = 0;
        System.out.println("Antrian telah dikosongkan");
    }

    public void tambahAntrian(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        rear = (rear + 1) % max;
        data[rear] = mhs;
        size++;
        System.out.println(mhs.getNama() + " ditambahkan ke antrian.");
    }

    public void prosesKRS() {
        if (size < 2) {
            System.out.println("Tidak cukup mahasiswa untuk proses KRS (minimal 2)");
            return;
        }
        System.out.println("Mahasiswa yang diproses KRS:");
        for (int i = 0; i < 2; i++) {
            Mahasiswa m = data[front];
            m.tampilkanData();
            front = (front + 1) % max;
            size--;
            jumlahDilayani++;
        }
    }

    public void tampilkanSemua() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }
        System.out.println("Daftar Antrian:");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            System.out.print((i + 1) + ". ");
            data[index].tampilkanData();
        }
    }

    public void tampilkanTerdepan() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2 orang.");
            return;
        }
        System.out.println("2 Mahasiswa terdepan:");
        for (int i = 0; i < 2; i++) {
            int index = (front + i) % max;
            data[index].tampilkanData();
        }
    }

    public void tampilkanBelakang() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Mahasiswa di posisi terakhir:");
            data[rear].tampilkanData();
        }
    }

    public int getJumlahAntrian() {
        return size;
    }

    public int getJumlahDilayani() {
        return jumlahDilayani;
    }

    public int getSisaKuotaDPA() {
        return 30 - jumlahDilayani;
    }

    public int getBelumDiproses() {
        return size;
    }
}