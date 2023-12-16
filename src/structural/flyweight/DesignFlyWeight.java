package structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class DesignFlyWeight {
    private final Map<String, DesignCar> designs = new HashMap<>();

    public DesignCar getDesign(String name){
        DesignCar designCar = designs.get(name.toLowerCase());
        if (designCar == null){
            if (name.equalsIgnoreCase("ford")){
                designCar = new FordDesign(name);
            } else if (name.equalsIgnoreCase("tesla")){
                designCar = new TeslaDesign(name);
            }
        }
        designs.put(name.toLowerCase(), designCar);
        return designCar;
    }
}
