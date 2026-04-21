package Strategy;

public class Navigation {

    private RoutingStrategy strategy;


    public Navigation(){
        strategy=RoutingStrategyFactory.giveStategy(RoutingType.SHORTESTPATH);
    }

    public String generateRoute(String startDestination,
                                String finalDestination){
        return strategy.suggestRoute(startDestination,finalDestination);
    }

    public void setStrategy(RoutingType routingType) {
        this.strategy = RoutingStrategyFactory.giveStategy(routingType);
    }
}
