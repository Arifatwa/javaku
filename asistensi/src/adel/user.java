package adel;

public class user {
    public static void main(String[] args) {
        mahasiswa adel = new mahasiswa();
        adel.setNama_barang("kipas");
        adel.setStatus_barang(true);
        adel.setBerat_barang(10);
        
        System.out.println("Nama Barang : "+adel.getNama_barang());
        System.out.println("Status Barang Aktif : "+adel.isStatus_barang());
        System.out.println("Berat Barang : "+adel.getBerat_barang());
        
        
        mahasiswa lina = new mahasiswa();
        lina.setNama_barang("polpen");
        lina.setStatus_barang(false);
        lina.setBerat_barang(5);
        
        System.out.println("Nama Barang : "+lina.getNama_barang());
        System.out.println("Status Barang tidak terjual : "+lina.isStatus_barang());
        System.out.println("Berat Barang : "+lina.getBerat_barang());
        
    }
   
    
}
