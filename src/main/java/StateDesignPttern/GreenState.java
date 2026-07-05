package StateDesignPttern;

public class GreenState implements TrafficLightState{

    String stateName = "GREEN";


    @Override
    public TrafficLightState action() {
        return new RedState();
    }

    @Override
    public String getName() {
        return stateName;
    }

}
