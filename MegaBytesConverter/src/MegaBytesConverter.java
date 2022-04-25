public class MegaBytesConverter {
    public static void printMegaBytesAndKiloBytes(int kilobyte){
        if(kilobyte < 0){
             System.out.println("Invalid Value");
        }
        else{
            int megabyte = kilobyte / 1024;
            int remKilobyte = kilobyte % 1024;
            System.out.println(kilobyte + " KB = " + megabyte + " MB and " + remKilobyte + " KB");
        }
    }
}
