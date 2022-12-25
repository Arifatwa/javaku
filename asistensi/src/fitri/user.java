 
package fitri;

public class user {
    public static void main(String[] args) {
        mahasiswa fitri = new mahasiswa();
        fitri.setNama_barang("hp");
        fitri.setStatus_barang(true);
        fitri.setBerat_barang(30);
        System.out.println("nama barang saya: "+fitri.getNama_barang());
        System.out.println("status barang saya aktif : "+fitri.isStatus_barang());
        System.out.println("berat badan saya : "+fitri.getBerat_barang());
        
        mahasiswa sari = new mahasiswa();
        sari.setNama_barang("kunci");
        sari.setStatus_barang(false);
        sari.setBerat_barang(15);
        System.out.println("nama barang saya : "+sari.getNama_barang());
        System.out.println("status barang saya aktif : "+sari.isStatus_barang());
        System.out.println("berat barang saya : "+sari.getBerat_barang());
        
        
        
        
    }
    
}
