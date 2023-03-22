public class Cockroach {
    public int cockroachSpeed(double x){
        double cmPerSecond = x * 27.7778; // 1 km/h = 27.7778 cm/s
        return (int) cmPerSecond; // rounding down to the nearest integer
    }
}