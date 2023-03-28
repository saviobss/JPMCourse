public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes (int kyloBytes){
        if(kyloBytes >=0) {
            int megaBytes = kyloBytes / 1024;
            System.out.println(kyloBytes + " KB = " + megaBytes + " MB and " + kyloBytes % 1024 + " KB");
        } else {
            System.out.println("Invalid Value");
        }
    }
}