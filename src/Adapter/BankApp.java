package Adapter;
//Adapter Client
public class BankApp {

    public static void main(String[] args) {

        DataAdapter adapter= new XMLToJSONAdapter();

        DataAnalysisLib lib=new DataAnalysisLib();

        lib.performAnalysis(adapter.performConversionAndGetData());
     }
}
