public class Main {
    public static void main(String[] args) {

        int balance = 100; // Сумма на счёте

        int refill = 999; // Сумма пополнения счета

        /* int percent;
        if (refill >1000){
            percent = 1;
        } else {
            percent = 0;
        }*/

        int percent = refill >1000 ? 1 : 0;

        int bonus = refill * percent / 100;

        int newBalance = bonus + refill + balance;

        System.out.println("Спасибо, что Вы с нами:");
        System.out.println("Начисленый бонус:" + " " + bonus + " " + "₽");
        System.out.println("Остаток на счете:" + " " + newBalance + " " + "₽");

    }
}