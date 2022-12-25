package latihan_soal;
public class tugaslatihan {
    public static void main(String[] args) {
        tugas tugaslatihan = new tugas();
        tugaslatihan.setNama("ARIFATWA");
        tugaslatihan.setUmur(19);
        tugaslatihan.setTinggi(60.3f);
        
        tugaslatihan.hasil();
        
        System.out.println("==============================");
        tugas namaku = new tugas();
        namaku.setNama("FISAH");
        namaku.setUmur(19);
        namaku.setTinggi(50.9f);
        namaku.hasil();
    }
}