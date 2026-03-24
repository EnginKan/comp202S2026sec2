package Adapter;
//A Concrete Adapter
public class XMLToJSONAdapter implements DataAdapter{
     private DataAPI api=new DataAPI();
    @Override
    public String performConversionAndGetData() {
        String data = api.getAllData();
        //proccessing steps
        return "{"
                +"'account':{" +
                "\t'accountID':321312312,\n"
                +"\t'ownerID':f213213123,\n"
                +"\t'balance':34.5\n"
                +"\n"
                +"}";
    }
}
