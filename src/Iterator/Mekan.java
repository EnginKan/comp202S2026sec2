package Iterator;

public class Mekan {

    private String name;
    private MekanKategori kategori;

    public Mekan(String name, MekanKategori kategori) {
        this.name = name;
        this.kategori = kategori;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MekanKategori getKategori() {
        return kategori;
    }

    public void setKategori(MekanKategori kategori) {
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return "Mekan{" +
                "name='" + name + '\'' +
                ", kategori=" + kategori +
                '}';
    }
}
