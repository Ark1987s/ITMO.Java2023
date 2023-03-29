package Lab07;

public class Main {
    public static void main(String[] args) {
        Plane planeAirbus = new Plane();
        Plane.Wing wingAirbus = planeAirbus.new Wing();
        wingAirbus.setWingWeight(2030);
        Plane planeBoeing = new Plane();
        Plane.Wing wingBoeing = planeBoeing.new Wing();
        wingBoeing.setWingWeight(1580);
    }
}