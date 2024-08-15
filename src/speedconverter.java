public class speedconverter {
    public static void main(String[] args) {
        System.out.println(toMilesPerHour(1.5));
        System.out.println(toMilesPerHour(10.25));
        System.out.println(toMilesPerHour(-5.6));
        System.out.println(toMilesPerHour(25.42));
        System.out.println(toMilesPerHour(75.114));
    }

    public static long toMilesPerHour(double kph) {
        if (kph < 0) {
            return -1;
        } else {
            double mph = kph / 1.609;
            return Math.round(mph);
        }
    }
}
