package uas;

import java.time.Year;
import java.util.Scanner;

/**
 * @author
 * NAMA     : Muhammad Anggawan Ridho Islami
 * KELAS    : IF 10K
 * NIM      : 10119909
 */

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int  umur;

        Umur user = new Umur();

        System.out.print("Masukkan Umur Anda : ");
        user.setUmur(scanner.nextInt());
        umur = user.getUmur();

        System.out.println("Status Dewasa : "+ user.statusumur(umur));
    }
}
