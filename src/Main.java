public class Main {

    public static void main(String[] args) {

        int check = 100; // счет клиента
        int newAmount = 1400;// пополнение счета
        int bonus = 0;//бонус
        int finalCheck = 0; // итоговый счет

        if (newAmount > 1000) {

            bonus = newAmount / 100;
            finalCheck = bonus + newAmount + check;
        } else {

            bonus = 0;
            finalCheck = bonus + newAmount + check;
        }

        System.out.println("Счет клиента=" + check);
        System.out.println("Пополнение счета = " +  newAmount);
        System.out.println("Итоговый счет = " + finalCheck);
        System.out.println("Бонусные рубли = " +  bonus);

    }


}
