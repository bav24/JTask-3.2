package org.example;

public class Main {
    public static void main(String[] args) {
        int deposit = 300;
        int currentBalance = 100;
        int finalBalance;

        if (deposit > 1000) {
            finalBalance = currentBalance + deposit + deposit / 100;
        } else {
            finalBalance = currentBalance + deposit;
        }

        System.out.println("Итоговый счет: " + finalBalance);

    }
}