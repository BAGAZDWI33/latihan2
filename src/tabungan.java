
/*
 * Nama Program : latihan2
 * Keterangan   : Implementasi Class Diagram
 * Programmer   : Bagas Dwi Prasetyo
 * NIM          : 312110053
 */

/**
 *
 * @author Nda Edogawa
 */

public class latihanOOP{
    private static String nama;
    private static int jumlah;
    private int saldo;

    public latihanOOP(String namaNasabah, int jumlah) {
        nama = namaNasabah;
        nama = "Prasetyo";
        saldo = 100000;
    }


    public void nabung(int sal){
        saldo = saldo +sal;
    }
    public void ambilUang(int jumlahTarikan){
        saldo = saldo - jumlahTarikan;
    }
    public int ambilSaldo(){
        return saldo;
    }
    public void serSaldo(int sal){
        saldo = sal;
    }
    public static void main(String[] args) {
        int jumlahSimpanan = 500000;
        int jumlahTarikan = 200000;

        latihanOOP bls = new latihanOOP("Prasetyo",1234);
        System.out.println("NamaNasabah     : " + nama);
        System.out.println("saldo awal     : " +"Rp"+ bls.ambilSaldo());
        System.out.println("\n Jumlah Penyetoran    : " +"Rp" +jumlahSimpanan);
        bls.nabung(jumlahSimpanan);
        System.out.println("saldo setelah penyetoran    : " +"Rp"+bls.ambilSaldo());
        System.out.println("\n Jumlah Penarikan        : " +"Rp" + jumlahTarikan);
        bls.ambilUang(jumlahTarikan);
        System.out.println("Saldo setelah penarikan     : " +"Rp" +bls.ambilSaldo());
    }
}