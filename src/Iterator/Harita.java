package Iterator;

import java.util.HashSet;
import java.util.Set;

public class Harita {

    private Set<Mekan> mekanlar;

    public Harita(){
        mekanlar= new HashSet<Mekan>();//empty set
        mekanlar.add(new Mekan("Sultan Ahmet Cami",MekanKategori.MABET));
        mekanlar.add(new Mekan(" Karacaahmet Cami",MekanKategori.MABET));
        mekanlar.add(new Mekan("Ayasofya",MekanKategori.MABET));
        mekanlar.add(new Mekan("Dolmabahçe",MekanKategori.SARAY));
        mekanlar.add(new Mekan("Topkapi",MekanKategori.SARAY));
        mekanlar.add(new Mekan("Burger King",MekanKategori.RESTORANT));
        mekanlar.add(new Mekan("Şişli Etfal",MekanKategori.HASTANE));
    }

    public Set<Mekan> getMekanlar() {
        return mekanlar;
    }

    public MyIterator getTarihIterator(){
              return new TarihIterator(this);

    }



}
