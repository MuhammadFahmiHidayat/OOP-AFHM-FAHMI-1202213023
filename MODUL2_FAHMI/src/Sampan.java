<<<<<<< HEAD
public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    @override
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar Rp. " +biaya);
    }
    @override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan 2 layar");
    }
    @override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan "+jangkar+" jangkar");
    }
}
=======
public class Sampan extends TransportasiAir{
    protected int layar;

    public Sampan(int jumlahKursi, int biaya, int layar){
        super(jumlahKursi, biaya);
        this.layar = layar;
    }
    @override
    public void informasi(){
        System.out.println("Transportasi Air jenis Sampan dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar Rp. " +biaya);
    }
    @override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Sampan sedang berlayar menggunakan 2 layar");
    }
    @override
    public void berlabuh(){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai tanpa jangkar");
    }
    public void berlabuh(int jangkar){
        System.out.println("Transportasi Air jenis Sampan berlabuh di pantai menggunakan "+jangkar+" jangkar");
    }
}
>>>>>>> 0c1ff1eb92b02d5fbf7997330a2bb015823f80e9
