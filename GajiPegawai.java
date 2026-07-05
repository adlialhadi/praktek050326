/*
 Nama : Khairunnisah
 NoBp : 2501082018
 Tanggal : 03 maret 2025

*/

package Praktek050326;

/**
 *
 * @author adli al hadi
 */
import java.util.Scanner;
public class GajiPegawai {
    public static void main(String[]args){
            
        int upahreguler = 50000;
        int upahlembur = 70000;
        int jamkerjareguler, jamkerjalembur, gajisebulan;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("===Program Menghitung Gaji Bulanan Pegawai===");
        System.out.println("\t Jam kerja reguler=\t");
        jamkerjareguler = input.nextInt();
        System.out.println("Jam kerja lembur=\t");
        jamkerjalembur = input.nextInt();
        gajisebulan = (jamkerjareguler*upahreguler)+(jamkerjalembur*upahlembur);
        System.out.println("\t Gaji Pegawai bulan ini:" + gajisebulan);
        
        
    }
    
}
