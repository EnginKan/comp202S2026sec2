package Visitor;

public abstract class Building<T> {

    private Long latitude;
    private Long longitude;
    private String name;
    private String adress;

    public abstract T accept(GeoMapDataExporter geoMapDataExporter);
}
