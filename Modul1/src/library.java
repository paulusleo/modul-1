
import java.util.Scanner;
public class library {
    void mahasiswa(long nim){
        long[] Nim = {202310370311189L,202310370311194L,202310370311203L};

        for (long I : Nim){
            if (I == nim){
                System.out.println("Login Sebagai Mahasiswa Berhasil !");
                break;
            }else{
                System.out.println("Anda Gagal Login");
                break;
            }
        }
    }
    void admin(String user,String Password) {
        if    (user.equals("admin") && Password.equals("leo"))
        {
            System.out.println("\nSukses Login Sebagai Admin");
        }else{
            System.out.println("\nAnda Gagal Login");
        }
    }
    public static void main(String[] args){
        library LB = new library();
        Scanner input = new Scanner(System.in);

        System.out.println("=== Library System ===");
        System.out.println("1. Login sebagai Mahasiswa");
        System.out.println("2. Login sebagai Admin");
        System.out.println("3. Exit");
        System.out.print("Pilihan anda (1-3) :  ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1 :
                System.out.print("Masukkan Nim Anda : ");
                long nim = input.nextLong();
                LB.mahasiswa(nim);
                break;
            case 2 :
                System.out.print("Masukkan User Anda : ");
                String user = input.next();
                System.out.print("Masukan Password Anda : ");
                String Password = input.next();
                LB.admin(user,Password);
                break;
            case 3 :
                System.exit(0);
                break;
            default:
                System.out.println("MAAF ANDA SALAH INPUT");
                break;
        }

    }
}
