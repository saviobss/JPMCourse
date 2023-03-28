public class SpeedConverter {
    public static long toMilesPerHour (double kilometersPerHour) {
        long milesPerHour = Math.round(kilometersPerHour / 1.609);
        if (kilometersPerHour >= 0) {
            return milesPerHour;
        }
        return -1;

    }

    public static void printConversion(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            long milesPerHour = toMilesPerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        } else {
            System.out.println("Invalid Value");
        }
    }

}