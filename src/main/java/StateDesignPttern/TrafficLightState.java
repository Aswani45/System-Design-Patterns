package StateDesignPttern;

public interface TrafficLightState {

    TrafficLightState action();

    String getName();
}
