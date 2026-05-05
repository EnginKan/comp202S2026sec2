package Iterator;

public class HaritaClient {


    public static void main(String[] args) {

        Harita harita = new Harita();

        TarihIterator iterator = (TarihIterator) harita.getTarihIterator();

        iterator.dolas();
    }


}
