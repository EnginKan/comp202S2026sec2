package Iterator;

import java.util.EmptyStackException;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TarihIterator extends MyIterator{
    List<Mekan> filtered;
    private int current=0;

    public TarihIterator(Harita harita) {
        super(harita);
        filtered= harita.getMekanlar().stream()
                .filter(m->m.getKategori()==MekanKategori.MABET
                || m.getKategori()==MekanKategori.SARAY)
                .collect(Collectors.toList());

    }

    @Override
    public Mekan getNext() {
        if (!filtered.isEmpty()) {
            Mekan next = filtered.get(current);
            current++;
            return next;
        }
       else
           throw new EmptyStackException();
    }


    @Override
    public boolean hasNext() {
        return (current<=filtered.size());
    }

    @Override
    public Mekan getFirst() {
        return filtered.getFirst();
    }

    public void dolas(){

        filtered.forEach(
                m->System.out.println(m.toString())
        );
    }
}
