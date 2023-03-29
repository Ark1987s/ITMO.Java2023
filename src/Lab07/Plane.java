package Lab07;

public class Plane {
    public class Wing {
        private int wingWeight;

        public void setWingWeight(int wingWeight) {
            this.wingWeight = wingWeight;
            System.out.println("Вес крыла самолёта = " + wingWeight);
        }
    }
}
