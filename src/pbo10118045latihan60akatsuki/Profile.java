/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan60akatsuki;

import java.util.Scanner;

/**
 *
 * @author Ilham
 */
public abstract class Profile {
     protected String namaLengkap, asal, cincin, posisiCincin, partner;
    protected int id;
    

    public Profile() {
        System.out.println("=====Daftar Anggota Akatsuki======");
        System.out.println("----------------------------------");
        System.out.println("1. Pain");
        System.out.println("2. Konan");
        System.out.println("3. Kakuzu");
        System.out.println("4. Hidan");
        System.out.println("5. Deidara");
        System.out.println("6. Sasori");
        System.out.println("7. Itachi");
        System.out.println("8. Kisame");
        System.out.println("9. Tobi");
        System.out.println("10. Orochimaru");
        System.out.println("11. Zetsu");
        
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getAsal() {
        return asal;
    }

    public String getCincin() {
        return cincin;
    }

    public String getPosisiCincin() {
        return posisiCincin;
    }

    public String getPartner() {
        return partner;
    }

    public int getId() {
        return id;
    }
       
    public int pilihAnggota() {
        System.out.print("\nPilih Karakter = ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
    
    public abstract void tampilProfile();
}
