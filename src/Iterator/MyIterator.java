package Iterator;

public abstract class  MyIterator {
    private Harita harita;
    public MyIterator(Harita harita) {
        this.harita=harita;
    }

    public abstract Mekan getNext();
    public abstract boolean hasNext();
    public abstract Mekan getFirst();

}
