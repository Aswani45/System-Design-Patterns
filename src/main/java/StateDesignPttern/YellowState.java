package StateDesignPttern;

public class YellowState implements TrafficLightState{
    String stateName = "YELLOW";


    @Override
    public TrafficLightState action() {
        return new GreenState();
    }

    @Override
    public String getName() {
        return stateName;
    }
}

