public class Main {
    public static void main(String[] args) {

        int moneyInAccount = 1_650; // Количество денег на счете
        int depositAmount = 1_450; // Сумма пополнения
        int priceBonus = 100; // Стоимость бонуса

        //Вариант с if, else.
        int bonus;
        if (depositAmount > 1_000) {
            bonus = depositAmount / priceBonus;
        } else {
            bonus = 0;
        }

        System.out.println("Количество зачисленных бонусов = " + bonus + " руб.");
        System.out.println("Итоговая сумма на счете = " + (moneyInAccount + depositAmount + bonus) + " руб.");

        //Вариант с тернанрным оператором.
        /*int bonus = depositAmount / priceBonus;
        System.out.println("Количество зачисленных бонусов = " + (depositAmount > 1_000 ? bonus : 0) + " руб.");
        System.out.println("Итоговая сумма на счете = " + (moneyInAccount + depositAmount + ((depositAmount > 1_000) ? bonus : 0) + " руб."));
        */
    }
}
