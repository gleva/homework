package static_nested_classes.task2;

public class Distance {
    double distance;
    public void print(double distance){
        this.distance=distance;
    }

    static class Converter{

        public double getMetrToKm(double km){
            return km/100;
        }

        public double getKmToMile(double m){
            return m/8;
        }

    }
}
