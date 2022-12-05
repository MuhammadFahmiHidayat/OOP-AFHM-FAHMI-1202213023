public class MainApp {
    public static void main(String[] args) throws Exception {
        Perngkat pr = new Perangkat("Adata", 2, 1.80F);
        pr.PusatInformasi();

        Laptop lp = new Laptop("Seagate", 8, 2.40F, true);
        lp.PusatInformasi();
        lp.BukuGame("Dota 2");
        lp.Email("tarnoru@gmail.com");
        lp.Email("juanaidi@gmail.com","asepail@gmail.com");
        
        Handphone hp = new Handphone("Sandisk", 3, 2.20F, false);
        hp.PusatInformasi();
        hp.Telefon(628121284923);
        hp.SMS(6281231772340);
        hp.SMS(6281293248234, 62812932102371);
    }
}
