/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author Dinar F V M
 */
import java.util.Scanner;

public class LuasPermukaanBola {

    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        float phi, r, luas;
        System.out.print("Masukkan nilai phi : ");
        phi = masukan.nextFloat();
        System.out.print("Masukkan nilai jari-jari : ");
        r = masukan.nextFloat();
        luas = 4 * phi * r * r;
        System.out.println("Luas Permukaan Bola : " + luas);
    }
}
