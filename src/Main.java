public class Main {
    public static void main(String[] args) {

        int moneyInAccount = 1_650; // Количество денег на счете
        int depositAmount = 1_450; // Сумма пополнения
        int priceBonus = 100; // Стоимость бонуса

        int countBonus = depositAmount / priceBonus; // Расчет количества бонусов

        //Вариант с if, else.
        int sumAccount = moneyInAccount + countBonus; // Итоговая сумма на счете

        if (depositAmount > 1_000) {
            System.out.println("Количество зачисленных бонусов = " + countBonus);
            System.out.println("Итоговая сумма на счете = " + sumAccount);
        } else {
            System.out.println("Количество зачисленных бонусов = 0");
            System.out.println("Итоговая сумма на счете = " + moneyInAccount);
        }

        //Вариант с тернанрным оператором.
        /*int sumAccount = moneyInAccount + (depositAmount > 1_000 ? countBonus : 0);
        System.out.println("Количество зачисленных бонусов = " + (depositAmount > 1_000 ? countBonus : 0));
        System.out.println("Итоговая сумма на счете = " + sumAccount);
        */
    }
}
