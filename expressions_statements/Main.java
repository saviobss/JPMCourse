package expressions_statements;

public class Main {
    public static void main(String[] args) {
        //Test 1
        System.out.println("Speed Converter Tests");
        SpeedConverter.toMilesPerHour(1.5);
        SpeedConverter.toMilesPerHour(10.25);
        SpeedConverter.toMilesPerHour(-5.6);
        SpeedConverter.toMilesPerHour(25.42);
        SpeedConverter.toMilesPerHour(75.114);

        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);

        //Test 2
        System.out.println("\nMega Bytes Converter Tests");
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);

        //Test 3
        System.out.println("\nDog Barking Tests");
        System.out.println(BarkingDog.shouldWakeUp(true, 1));
        System.out.println(BarkingDog.shouldWakeUp(false, 2));
        System.out.println(BarkingDog.shouldWakeUp(true, 8));
        System.out.println(BarkingDog.shouldWakeUp(true, -1));

        //Test 4
        System.out.println("\nLeap Year Tests");
        System.out.println(LeapYear.isLeapYear(-1600));
        System.out.println(LeapYear.isLeapYear(1600));
        System.out.println(LeapYear.isLeapYear(2017));
        System.out.println(LeapYear.isLeapYear(1924));

        //Test 5
        System.out.println("\nDecimal Comparator Tests");
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756,-3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.176,3.175));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(3.0,3.0));
        System.out.println(DecimalComparator.areEqualByThreeDecimalPlaces(-3.123,3.123));

        //Test 6
        System.out.println("\nEqual sim checker Tests");
        System.out.print(EqualSumChecker.hasEqualSum(1,1,1));
        System.out.print(EqualSumChecker.hasEqualSum(1,1,2));
        System.out.print(EqualSumChecker.hasEqualSum(1,-1,0));

        //Test 7
        System.out.println("\nTeen Number checker Tests");
        System.out.println(TeenNumberChecker.hasTeen(9,99,19));
        System.out.println(TeenNumberChecker.hasTeen(23,15,42));
        System.out.println(TeenNumberChecker.hasTeen(22,23,24));
        System.out.println(TeenNumberChecker.isTeen(9));
        System.out.println(TeenNumberChecker.isTeen(13));

        //Test 8
        System.out.println("\nArea Calculator Tests");
        AreaCalculator.area(5.0);
        AreaCalculator.area(-1);
        AreaCalculator.area(5.0,4.0);
        AreaCalculator.area(-1.0, 4.0);

        //Test 9
        System.out.println("\nMinutes to years and Days Calculator Tests");
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(1051200);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);

        //Test 10
        System.out.println("\nEquality printer Tests");
        IntEqualityPrinter.printEqual(1,1,1);
        IntEqualityPrinter.printEqual(1,1,2);
        IntEqualityPrinter.printEqual(-1,-1,-1);
        IntEqualityPrinter.printEqual(1,2,3);

        //Test 11
        System.out.println("\nPlaying Cat Tests");
        System.out.println(PlayingCat.isCatPlaying(true, 10));
        System.out.println(PlayingCat.isCatPlaying(false, 36));
    }
}