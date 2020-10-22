package org.progmatic.edu.bank;

import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ügyfélkód: ");
        int code = sc.nextInt();
        System.out.print("Hitel összege: ");
        int amount = sc.nextInt();
        System.out.print("Futamidő: ");
        int time = sc.nextInt();
        if (time >= 12 && time <= 60) {
            LoanRequest hitel = new LoanRequest(code, amount, time);
            LoanResponse res = new LoanResponse(hitel);
            LoanCalculator cal = new LoanCalculator(res);
            cal.respond();
        } else {
            System.out.println("Csak 12 és 60 hónap közötti időszak adható meg.");
        }
    }
}
