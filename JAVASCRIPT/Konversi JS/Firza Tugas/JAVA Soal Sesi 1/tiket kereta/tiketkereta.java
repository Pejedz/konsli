import java.util.Scanner;

public class tiketkereta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Mengisi
        System.out.println("|===========================================|");
        System.out.println("|     JURUSAN     |       HARGA TIKET       |");
        System.out.println("|===========================================|");
        System.out.println("|                 | Busines     | Executive |");
        System.out.println("|Malang-Kediri    | Rp. 35.000  | Rp. 45.000|");
        System.out.println("|Jakarta-Surabaya | Rp. 45.000  | Rp. 55.000|");
        System.out.println("|Kertosono-Ngawi  | Rp. 40.000  | Rp. 50.000|");
        System.out.println("|===========================================|");
        System.out.println("                                             ");
        System.out.println("                                             ");
        System.out.print("Masukkan Jurusan: ");
        String jurusan = scanner.nextLine();
        System.out.print("Masukkan Tipe Tiket: ");
        String tipe = scanner.nextLine();

        scanner.close();

        //penghitung harga tiket
        int hargatiket = 0;
        if (jurusan.equals("Malang-Kediri")) {
            if (tipe.equals("Busines")) {
                hargatiket = 35000;
            } else if (tipe.equals("Executive")) {
                    hargatiket = 45000;
            }
        } else if (jurusan.equals("Jakarta-Surabaya")) {
            if (tipe.equals("Busines")) {
                    hargatiket = 45000;
            } else if (tipe.equals("Excutive")) {
                    hargatiket = 55000;
            }
        } else if (jurusan.equals("Kertosono-Ngawi")) {
            if (tipe.equals("Busines")) {
                    hargatiket = 40000;
            } else if (tipe.equals("Executive")) {
                hargatiket = 50000;    
            }   
        }       

        System.out.println("                                             ");
        System.out.println("                                             ");
        System.out.println("                                             ");
        System.out.println("                                             ");

        //Hasil
        System.out.println("|=====================================|");
        System.out.println("|          TIKET YANG DIPESAN         |");
        System.out.println("|=====================================|");
        System.out.println("|Jurusan : " + jurusan);
        System.out.println("|Tipe Tiket : " + tipe);
        System.out.println("|Harga Tiket : " + hargatiket);
        System.out.println("|=====================================|");
        System.out.println("|     TERIMA KASIH TELAH MEMESAN      |");
        System.out.println("|=====================================|");
        System.out.println("                                             ");
        System.out.println("                                             ");
    }
}