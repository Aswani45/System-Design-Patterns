package StateDesignPttern;

public class RedState implements TrafficLightState{

    public String stateName = "RED";
    @Override
    public TrafficLightState action() {
        return new YellowState();
    }

    @Override
    public String getName() {
        return stateName;
    }
}
