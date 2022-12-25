<<<<<<< HEAD
public class Handphone extends Perangkat{
    protected boolean fingerprint;
    public Handphone (String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint
    }
    @override
    public void PusatInformasi(){
        System.out.println("Handphone ini memiliki driver tipe" +drive+ "dengan ram sebesar" +ram+ "GB dan processor" +processor);
    }
    public void Telefon(int Hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke no" +HP)
    }
    public void SMS(int HP1, int HP2){
        System.out.println("Handphone berhasil mengirim sms ke no" +HP1+ "dan kepada no" +HP2)
    }
}
=======
public class Handphone extends Perangkat{
    protected boolean fingerprint;
    public Handphone (String drive, int ram, float processor, boolean fingerprint){
        super(drive, ram, processor);
        this.fingerprint = fingerprint
    }
    @override
    public void PusatInformasi(){
        System.out.println("Handphone ini memiliki driver tipe" +drive+ "dengan ram sebesar" +ram+ "GB dan processor" +processor);
    }
    public void Telefon(int Hp){
        System.out.println("Handphone berhasil menyambungkan telfon ke no" +HP)
    }
    public void SMS(int HP1, int HP2){
        System.out.println("Handphone berhasil mengirim sms ke no" +HP1+ "dan kepada no" +HP2)
    }
}
>>>>>>> 0c1ff1eb92b02d5fbf7997330a2bb015823f80e9
