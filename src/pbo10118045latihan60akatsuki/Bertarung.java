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
public class Bertarung extends Akatsuki implements Senjata, Jurus{

    private String senjata, jurus;
    
    public Bertarung () {
        int pilih = pilihAnggota();
        switch (pilih) {
            case 1:
                this.id = 1;
                this.namaLengkap = "Pain";
                this.asal = "Amegakure";
                this.cincin = "零 (\"Nol\",\"Tidak ada\")";
                this.posisiCincin = "Jempol kanan";
                this.partner = "Konan";
                break;
            case 2:
                this.id = 2;
                this.namaLengkap = "Konan";
                this.asal = "Amegakure";
                this.cincin = "白 (\"Putih\")";
                this.posisiCincin = "Jari Tengah, Tangan Kanan";
                this.partner = "Pain";
                break;
            case 3:
                this.id = 3;
                this.namaLengkap = "Kakuzu";
                this.asal = "Takigakure";
                this.cincin = "北 (\"Utara\")";
                this.posisiCincin = "Jari tengah kiri";
                this.partner = "Hidan";
                break;
            case 4:
                this.id = 4;
                this.namaLengkap = "Hidan";
                this.asal = "Yugakure";
                this.cincin = "三 (\"Tiga\")";
                this.posisiCincin = "Telunjuk kiri";
                this.partner = "Kakuzu";
                break;
            case 5:
                this.id = 5;
                this.namaLengkap = "Deidara";
                this.asal = "Iwagakure";
                this.cincin = "青(\"Biru/Hijau\")";
                this.posisiCincin = "Telunjuk kanan";
                this.partner = "Sasori";
                break;
            case 6:
                this.id = 6;
                this.namaLengkap = "Sasori";
                this.asal = "Sunagakure";
                this.cincin = "玉 (\"Virgo\")";
                this.posisiCincin = "Jempol kiri";
                this.partner = "Orochimaru (dulu), Deidara";
                break;
            case 7:
                this.id = 7;
                this.namaLengkap = "Itachi Uchiha";
                this.asal = "Konohagakure";
                this.cincin = "朱 (\"Merah Darah\")";
                this.posisiCincin = "Jari manis kanan";
                this.partner = "Kisame";
                break;
            case 8:
                this.id = 8;
                this.namaLengkap = "Kisame Hoshigaki";
                this.asal = "Kirigakure";
                this.cincin = "南 (\"Selatan\")";
                this.posisiCincin = "Jari manis kiri";
                this.partner = "Itachi";
                break;
            case 9:
                this.id = 9;
                this.namaLengkap = "Tobi (Obito Uchiha)";
                this.asal = "Konohagakure";
                this.cincin = "玉 (\"Berlian\")";
                this.posisiCincin = "Jempol kiri";
                this.partner = "Deidara";
                break;
            case 10:
                this.id = 10;
                this.namaLengkap = "Orochimaru";
                this.asal = "Konohagakure";
                this.cincin = "空 (\"Langit\")";
                this.posisiCincin = "Jari Kelingking Kiri";
                this.partner = "Sasori";
                break;
            case 11:
                this.id = 11;
                this.namaLengkap = "Zetsu";
                this.asal = "";
                this.cincin = "";
                this.posisiCincin = "";
                this.partner = "";
                break;
            default:
                break;
        }
    }
    
    @Override
    public int tampilSenjata() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n==========Pilih Senjatamu=========");
        System.out.println("----------------------------------");
        System.out.println("1. Kunai");
        System.out.println("2. Samehada");
        System.out.println("3. Sabit Beramata Tiga");
        System.out.println("4. Kertas");
        System.out.println("5. Tanah Liat");
        System.out.print("\nPilih Senjata: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public int tampilJurus() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        System.out.println("\n===========Pilih Jurusmu==========");
        System.out.println("----------------------------------");
        System.out.println("1. Shinra Tensei");
        System.out.println("2. Amaterasu");
        System.out.println("3. Suiton: Suikodan no Jutsu");
        System.out.println("4. Kagebunshin no Jutsu");
        System.out.println("5. Katon: Gokakyuu no Jutsu");
        System.out.print("\nPilih Jurus: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    @Override
    public void keluarakanSenjata(int pilih) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        switch (pilih) {
            case 1:
                System.out.println("\n" + getNamaLengkap() + " mengeluarkan Kunai");
                break;
            case 2:
                if (getId() != 2) System.out.println(getNamaLengkap() + " tidak bisa mengeluarkan Samehada karena sedang digunakan Kisame untuk memotong daging");
                else System.out.println(getNamaLengkap() +" mengeluarkan Samehada");
                break;
            case 3:
                if (getId() != 4) System.out.println(" tidak bisa mengeluarkan Sabit Bermata tiga karena sedang digunakan Hidan untuk Ritual-nya");
                else System.out.println(getNamaLengkap() + " mengeluarkan Sabit Bermata Tiga");
                break;
            case 4:
                if (getId() != 2) System.out.println(getNamaLengkap() + " tidak bisa mengeluarkan kertas karena habis dipake buat origami oleh Konan");
                else System.out.println(getNamaLengkap() + " mengeluarkan Kertas");
                break;
            case 5:
                if (getId() != 5) System.out.println(getNamaLengkap() + " tidak bisa mengeluarkan tanah liat karena Deidara sedang sibuk membuat seni");
                break;
            default:
                break;
        }
    }

    @Override
    public void keluarkanJurus(int pilih) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        if (pilih == 1) {
            if (getId() != 1) System.out.println(getNamaLengkap() + " tidak bisa mengeluarkan Shinra tensei karena tidak mempunyai Rinnegan");
            else System.out.println(getNamaLengkap() + " mengeluarkan Shinra Tensei dan melempar objek di sekitarnya");
        }
        if (pilih == 4) {
            System.out.println(getNamaLengkap() + " menggunakan jurus Kagebunshin untuk menggandakan dirinya");
        }
    }
    
    
}

