package StateDesignPttern;

public class TrafficLight{

    TrafficLightState state;

    TrafficLight( ){
        this.state = new RedState();


        System.out.println("Traffic Light with initial state "+ state.getName()  +" has been crataed");
    }

    void change(){
        String oldState = state.getName();
        this.state =  state.action();
        String newState = state.getName();

        System.out.println("Traffic light changed from "+oldState+ " to "+ newState);

    }

}
