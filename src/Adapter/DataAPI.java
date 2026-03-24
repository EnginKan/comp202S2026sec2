package Adapter;
//Adaptee- Unit that supply XML Data which should be adapted
public class DataAPI {

    public String getAllData(){

        return "<xml>"
                +"<account>\n" +
                "\t<accountID>321312312</accountID>\n"
                +"\t<ownerID>f213213123</ownerID>\n"
                +"\t<balance>34.5</balance>\n"
                +"</account>\n"
                +"</xml>";

    }


}
