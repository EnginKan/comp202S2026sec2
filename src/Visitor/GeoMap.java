package Visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class GeoMap<T> {

    private static Set<Building> buildingSet= Set.of(
            new Farmacy(),
            new Hospital(),
            new Residance(),
            new Farmacy()
    );

    public List<T> getAllData(GeoMapDataExporter exporter){

        List<T> nodedata=new ArrayList<T>();

        buildingSet.forEach(
                node-> nodedata.add((T)node.accept(exporter))
        );

        return nodedata;
    }
}
