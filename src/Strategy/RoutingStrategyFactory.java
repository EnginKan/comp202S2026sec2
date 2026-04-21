package Strategy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RoutingStrategyFactory {

    private static Map<RoutingType,RoutingStrategy> pool= new HashMap<RoutingType,RoutingStrategy>();

      public static RoutingStrategy giveStategy(RoutingType strategy){

          if(!pool.containsKey(strategy)) {
              pool.put(strategy,
                      (strategy == RoutingType.SHORTESTPATH) ? new ShortestPath() : new ShortestTime());
          }
                return  pool.get(strategy);
          }



      }


