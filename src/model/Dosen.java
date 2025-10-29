package model;

import java.util.ArrayList;
import java.util.List;
public class Dosen {
    private String nama;
    private String nidn;
    private List<Mahasiswa> mahasiswaBimbingan;

    public Dosen(String nama, String nidn) {
        this.nama = nama;
        this.nidn = nidn;
        this.mahasiswaBimbingan = new ArrayList<>();
    }

    public void tambahanMahasiswaBimbingan(Mahasiswa mhs) {
        this.mahasiswaBimbingan.add(mhs);
        System.out.println("INFO: " + mhs.getNama() + " berhasil menjadi bimbingan " + this.nama);

    }
    public void lihatDaftarBimbingan() {
        System.out.println("--- Daftar Bimbingan Dosen: " + this.nama + " ---");
        for (Mahasiswa mhs : this.mahasiswaBimbingan) {
            System.out.println("- " + mhs.getNama() + " (" + mhs.getNim() + ")");
        }
    }
    public String getNama() {
        return this.nama;
    }

}
