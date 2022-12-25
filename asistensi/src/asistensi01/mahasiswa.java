package asistensi01;
public class mahasiswa {
    private String nama_barang;
    //private int umur;
    private float berat_barang;
    private boolean status_barang;

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public float getBerat_barang() {
        return berat_barang;
    }

    public void setBerat_barang(float berat_barang) {
        this.berat_barang = berat_barang;
    }

    public boolean isStatus_barang() {
        return status_barang;
    }

    public void setStatus_barang(boolean status_barang) {
        this.status_barang = status_barang;
    }

    
    
    public void hasil(){
        System.out.println("nama barang : " + nama_barang);
       // System.out.println("umur saya adalah : " + umur);
        System.out.println("ststaus barang : " + status_barang);
        System.out.println("berat barang : " + berat_barang);
        System.out.println("_____________________________");
    }
    
   
        
}
     

