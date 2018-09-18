/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Dinar F V M
 */
public class BiodataDiri {

    public static void main(String[] args) {
        //membuat variabel
        String nama, tempatlahir, tanggallahir, jeniskelamin, alamat, mottohidup;
        int nis;

        //mengisi variabel
        nama = "Dinar Fitri Vania Muti";
        nis = 12345678;
        tempatlahir = "Surabaya";
        tanggallahir = "14-12-2002";
        jeniskelamin = "Perempuan";
        alamat = "Jl. Danau Poso I G2D no. 21";
        mottohidup = "Apa Hayo?";

        //mencetak ke layar isi variabel
        System.out.println("Nama : " + nama);
        System.out.println("NIS : " + nis);
        System.out.println("Tempat Lahir : " + tempatlahir);
        System.out.println("Tanggal Lahir : " + tanggallahir);
        System.out.println("Jenis Kelamin : " + jeniskelamin);
        System.out.println("Alamat di Malang : " + alamat);
        System.out.println("Motto Hidup : " + mottohidup);
    }
}
