<<<<<<< HEAD
public class Kapal extends TransportasiAir{
    protected str mesin;

    public Kapal(int jumlahKursi, int biaya, str mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar Rp. " +biaya);

    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan stabil di kisaran "+kecepatan+"knot");
    }
    @Override
    public void berlabuh(){
        System.out.println(Transportasi Air jenis Kapal berlabuh di pantai);
    }
}
=======
public class Kapal extends TransportasiAir{
    protected str mesin;

    public Kapal(int jumlahKursi, int biaya, str mesin){
        super(jumlahKursi, biaya);
        this.mesin = mesin;
    }
    @Override
    public void informasi(){
        System.out.println("Transportasi Air jenis Kapal dengan kursi berjumlah" + jumlahKursi + "ditetapkan dengan biaya sebesar Rp. " +biaya);

    }
    @Override
    public void berlayar(){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan yang tidak stabil");
    }
    public void berlayar(int kecepatan){
        System.out.println("Transportasi Air jenis Kapal sedang berlayar menggunakan mesin Diesel dengan kecepatan stabil di kisaran "+kecepatan+"knot");
    }
    @Override
    public void berlabuh(){
        System.out.println(Transportasi Air jenis Kapal berlabuh di pantai);
    }
}
>>>>>>> 0c1ff1eb92b02d5fbf7997330a2bb015823f80e9
