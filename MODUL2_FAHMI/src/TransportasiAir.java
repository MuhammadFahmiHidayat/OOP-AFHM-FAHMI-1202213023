public class TransportasiAir {
    protected int jumlahKursi, int biaya;

    public TransportasiAir(int jumlahKursi, int biaya){
        this.jumlahKursi = jumlahKursi;
        this.biaya = biaya;
    }
    public void informasi(){
        System.out.println("Transportasi Air jenis tidak diketauhi dengan kursi berjumlah "+jumlahKursi+"ditetapkan dengan biaya sebesar"+biaya);
    }
    public void berlayar(){
        System.out.println("Transportasi Air jenis yang tidak diketauhi sedang berlayar");
    }
    public void berlabuh(){
        System.out.println("Transportasi Air jenis yang tidak diketauhi berlabuh di pantai");
    }
}
