package belajarscanner;



    import java.util.Scanner;

    public class BelajarScanner {
        public static void main (String[] args) {
            int user;
            System.out.print("Masukkan angka berapa saja: ");
            Scanner inputan=new Scanner(System.in);
            user= inputan.nextInt();
           
            System.out.println("Angka yang barusan anda ketik adalah "+user);
        }
       
    }