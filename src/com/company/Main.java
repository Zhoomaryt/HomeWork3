package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        BancKampanion bankAccount = new BancKampanion();
        BancKampanion.deposit(30000);

        while (true) {
            try {
                BancKampanion.withDraw(8000);
            } catch (LimitException e) {
                System.out.println(e.getMessage());

                int ostatok = (int) bankAccount.getAmount();
                try {
                    bankAccount.withDraw(ostatok);
                } catch (LimitException limitException) {
                    limitException.printStackTrace();
                }

                break;
            }
        }

    }
}