package Visitor;

public abstract class GeoMapDataExporter<T> {


    public abstract T export(Farmacy farmacy);
    public abstract T export(Hospital hospital);
    public abstract T export(Residance residance);


}
