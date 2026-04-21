package Strategy;

public class ShortestPath implements RoutingStrategy{
    @Override
    public String suggestRoute(String startDestination, String finalDestination) {
        return "Shortest path from "+startDestination+" to "+finalDestination+":";
    }
}
