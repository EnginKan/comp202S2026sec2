package Strategy;

public class NavigationClient {

    public static void main(String[] args) {

        Navigation navigation=new Navigation();

        System.out.println(navigation.generateRoute("Home","Office"));
        navigation.setStrategy(RoutingType.SHORTESTTIME);
        System.out.println(navigation.generateRoute("Home","Office"));
    }
}
