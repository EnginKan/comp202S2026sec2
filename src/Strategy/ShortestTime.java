package Strategy;

public class ShortestTime implements RoutingStrategy{
    @Override
    public String suggestRoute(String startDestination, String finalDestination) {
        return "Fastest path from "+startDestination+" to "+finalDestination+":";
    }
}
