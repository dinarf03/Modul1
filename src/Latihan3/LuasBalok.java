/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author Dinar F V M
 */
public class LuasBalok {

    public static void main(String[] args) {
        int p = 15;
        int l = 10;
        int t = 5;
        System.out.println("Nilai Panjang Balok : " + p);
        System.out.println("Nilai Lebar Balok : " + l);
        System.out.println("Nilai Tinggi Balok : " + t);
        System.out.println("==========================================");
        System.out.println("Menghitung Luas Permukaan Balok");
        System.out.println("Luas Permukaan Balok = " + ((2 * p * l) + (2 * p * t) + (2 * t * l)));
        System.out.println("==========================================");
        System.out.println("Menghitung Volume Balok");
        System.out.println("Volume Balok = " + p * l * t);
        System.out.println("==========================================");
    }
}
