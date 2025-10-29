package model;

public class Mahasiswa {
    private String nama;
    private String nim;
    private Dosen pembimbing;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public void setPembimbing(Dosen dosen) {

        this.pembimbing = dosen;
    }

    public void lihatDosenPembimbing() {
        if (this.pembimbing != null) {
            System.out.println("INFO: Dosen pembimbing " + this.nama + " adalah " + this.pembimbing.getNama());
        } else {
            System.out.println("INFO " + this.nama + " belum memiiki dosen pembimbing.");
        }
    }
    public String getNama() {
        return this.nama;
    }
    public String getNim() {
        return this.nama;
    }
}
