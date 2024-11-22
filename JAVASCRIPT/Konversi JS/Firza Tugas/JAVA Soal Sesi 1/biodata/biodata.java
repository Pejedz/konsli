import java.util.Scanner;

public class biodata {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta masukan pengguna
        System.out.print("NIS: ");
        String nis = scanner.nextLine();
        System.out.print("Nama: ");
        String nama = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Agama: ");
        String agama = scanner.nextLine();

        scanner.close();

        //tampilan biodata
        System.out.println("===================");
        System.out.println("      BIODATA       ");
        System.out.println("===================");
        System.out.println("NIS: " + nis);
        System.out.println("Nama: " + nama);
        System.out.println("Gender: " + gender);
        System.out.println("Agama: " + agama);
    }
}
