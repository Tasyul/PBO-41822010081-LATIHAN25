import java.util.Scanner;
/**
 * @author nstsy
 * Nama : Anastasya azami
 * NIM : 41822010081
 * Nama : Syadella Putri Ardana
 * NIM: 41822010037
 */
public class PBO_41822010081_LATIHAN25 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Masukkan nama depan anda untuk di eja: ");
            String nama = input.nextLine();
            
            System.out.println("Ejaan untuk " +" '"+ nama +"' "+ " adalah:");
            
            // Loop melalui setiap karakter dalam nama dan eja sesuai urutan yang diinginkan
            for (int i = 0; i < nama.length(); i++) {
                char karakter = nama.charAt(i);
                String ejaan = String.valueOf(karakter);
                
                // Tampilkan ejaan karakter sesuai urutan
                System.out.println("Huruf ke-" + (i + 1) + ": " + ejaan);
            }
        }
    }
}