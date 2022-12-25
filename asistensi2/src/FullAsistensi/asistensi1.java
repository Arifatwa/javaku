
package FullAsistensi;



public class asistensi1 {
   private String nama;
   private int Umur;
   private float TinggiBadan;
   private double BeratBadan;
   private long angkatan;
   private char jomblo;
   private boolean statusMahasiswa; 

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int Umur) {
        this.Umur = Umur;
    }

    public float getTinggiBadan() {
        return TinggiBadan;
    }

    public void setTinggiBadan(float TinggiBadan) {
        this.TinggiBadan = TinggiBadan;
    }

    public double getBeratBadan() {
        return BeratBadan;
    }

    public void setBeratBadan(double BeratBadan) {
        this.BeratBadan = BeratBadan;
    }

    public long getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(long angkatan) {
        this.angkatan = angkatan;
    }

    public char getJomblo() {
        return jomblo;
    }

    public void setJomblo(char jomblo) {
        this.jomblo = jomblo;
    }

    public boolean isStatusMahasiswa() {
        return statusMahasiswa;
    }

    public void setStatusMahasiswa(boolean statusMahasiswa) {
        this.statusMahasiswa = statusMahasiswa;
    }
   
 public void mamnun() {
    
        System.out.println("nama: " + nama);
        System.out.println("umur:" + Umur);
        System.out.println("tinggi badan:" + BeratBadan);
        System.out.println("berat badan:" + BeratBadan);
        System.out.println("jomblo:" + jomblo);
        System.out.println("angkatan:" + angkatan);
        System.out.println("status mahasiswa:" + statusMahasiswa);
 }
   

 
    
   
    
}
