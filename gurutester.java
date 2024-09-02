import java.util.Scanner;

//Driver class
public class gurutester {
    //contructor 
    public static void main(String[] args) {
    //    Scanner input = new Scanner(System.in);
    //    System.out.println("NAMA: ");
    //    String nama = input.nextLine();
    //    System.out.println("MAPEL: ");
    //    String mapel = input.nextLine();
    //    System.out.println("STATUS: ");
    //    String status = input.nextLine();
    //    System.out.println("NIP: ");
    //    int nip = input.nextInt();
    //    input.close();

    //    guru Guru = new guru(nip, nama, mapel, status);
       

    //    guru BuPasha = new guru(3456, "Pasha", "RPL", "Tetap");
    //    guru PakThoriq = new guru(1567, "Thoriq", "Pj"," Part-Time");
    //    guru Bujevi = new guru(4980, "Jevi", "Inggris", "Full-Time");
    //    guru PakAndre = new guru(8976, "Andre", "Inggris", "Tetap");
    //    guru PakFalah = new guru(4569, "Falah", "Bahasa indo", "Tetap");

        // Guru.print();

        guru BuPasha = new guru(3456, "Pasha", "RPL", "Tetap");

        BuPasha.setNama("Bu Pasha");
        BuPasha.setMapel("RPL");
        BuPasha.setStatus("Tetap");
        BuPasha.setNip(3456);

        BuPasha.print();
        

        // System.out.println("-----------------");
        // PakThoriq.print();
        // System.out.println("-----------------");
        // Bujevi.print();
        // System.out.println("-----------------");
        // PakAndre.print();
        // System.out.println("-----------------");
        // PakFalah.print();
        // System.out.println("-----------------");
        




    }
    
}
