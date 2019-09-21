/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118071.latihan4.kambing;

/**
 *
 * @author 
 * NAMA              : David Aditya Winarto
 * KELAS             : PBO2
 * NIM               : 10118071
 * Deskripsi Program : Program ini berisi program untuk membuat dan mengakses
 *                     variabel lokal jumlahKambing
 * 
 */
public class PBO210118071Latihan4Kambing {

    /**
     * @param args the command line arguments
     */
    public void tambahKambing() {
        // deklarasi variabel
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        PBO210118071Latihan4Kambing kambingJantan = new PBO210118071Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
    
}
