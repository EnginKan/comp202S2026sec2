package Visitor;

public class XMLGeoMapExporter extends GeoMapDataExporter<String>{
    @Override
    public String export(Farmacy farmacy) {
        return (String) farmacy.accept(this);
    }

    @Override
    public String export(Hospital hospital) {
        return (String) hospital.accept(this);
    }

    @Override
    public String export(Residance residance) {
        return (String) residance.accept(this);
    }
}
