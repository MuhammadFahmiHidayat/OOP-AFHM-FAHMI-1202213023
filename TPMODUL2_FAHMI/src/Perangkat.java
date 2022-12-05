public class Perangkat {
    protected String drive;
    protected int ram;
    protected floa processor;

    puublic Perangkat(String drive, int ram, float processor){
        this.drive = drive;
        this.ram = ram;
        this.processor = processor;
    }
    public void PusatInformasi(){
        System.out.println("Perangkat tidak diketauhi memiliki driver tipe" +drive+ "dengan ram sebesar" +ram+ "dan processor" +processor+ "\n");
    }
}
