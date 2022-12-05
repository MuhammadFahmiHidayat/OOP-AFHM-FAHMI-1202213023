public class Laptop extends Perangkat{
    protected boolean webcam;
    public Laptop(String drive, int ram, float processor, boolean webcam){
        super(drive, ram, processor);
        this.webcam = webcam;
    }
    @override
    public void PusatInformasi(){
        System.out.println("Laptop memiliki driver tipe" +drive+ "degan ram sebesar" +ram+ "GB dan processor" + processor)
    }
    public void BukuGame(String NamaGame){
        System.out.println("Laptop berhasil membuka game" +NamaGame);
    }
    public void EMail(String Email_1, String Email_2{
        System.out.println("Laptop berhasil mengirim Email kepada" +Email_1+ "dan kepada" +Email_2+ "\n");
    })
}
