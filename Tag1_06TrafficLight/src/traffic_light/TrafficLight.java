package traffic_light;
public class TrafficLight {

    private final TrafficLightState redState = new RedState();
    private final TrafficLightState greenState = new GreenState();
    private final TrafficLightState offState = new OffState();

    private TrafficLightState current = offState;

    public String getColor() {
        return current.getColor();
    }

    public void nextColor() {
        current.nextColor();
    }

    public void switchOn() {
        current.switchOn();
    }

    public void switchOff() {
        current.switchOff();
    }

    interface TrafficLightState {
        public String getColor() ;
        public void nextColor();
        public void switchOn();
        public void switchOff();
    }

    class AbstractTrafficLightState implements TrafficLightState {

        @Override
        public String getColor() {
            throw new UnsupportedOperationException("Upps");
        }

        @Override
        public void nextColor() {
            throw new UnsupportedOperationException("Upps");
        }

        @Override
        public void switchOn() {
            throw new UnsupportedOperationException("Upps");
        }

        @Override
        public void switchOff() {
            throw new UnsupportedOperationException("Upps");
        }
    }

    class AbstractTrafficLightColorState extends AbstractTrafficLightState{
        @Override
        public void switchOff() {
            TrafficLight.this.current = TrafficLight.this.offState;
        }
    }

    class OffState extends AbstractTrafficLightState {

        @Override
        public void switchOn() {
            TrafficLight.this.current = TrafficLight.this.redState;
        }
    }

    class RedState extends AbstractTrafficLightColorState {

        @Override
        public String getColor() {
            return "RED";
        }

        @Override
        public void nextColor() {
            TrafficLight.this.current = TrafficLight.this.greenState;
        }
    }

    class GreenState extends AbstractTrafficLightColorState {


        @Override
        public String getColor() {
            return "GREEN";
        }

        @Override
        public void nextColor() {
            TrafficLight.this.current = TrafficLight.this.redState;
        }
    }
}
