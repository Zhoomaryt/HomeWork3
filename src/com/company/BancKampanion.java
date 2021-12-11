package com.company;

public class BancKampanion {
    private static double amount;

    public static double getAmount() {
        return amount;
    }


    public static void deposit(double sum) {
        amount += sum;
        System.out.println("вы положили депозит: " + sum + "сом На вашем лицевом счете : " + getAmount());
    }

    public static void withDraw(int sum) throws LimitException {
        if (sum > amount) {
            throw new LimitException("Вы не можете снять наличные, так как вы хотите  больше чем у вас есть ", amount);
        } else {
            amount -= sum;
            System.out.println("Вы сняли: " + sum + " Остаток на вашем лицивом счете: " + getAmount());
        }
    }
}
