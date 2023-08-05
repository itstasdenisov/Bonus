public class Main {
    public static void main(String[] args) {

        int initialBalance = 1300;
        int addend = 400;

        int bonus = 0;
        if (addend > 1000) {
            bonus = addend / 100;
        }

        int finalBalance = initialBalance + addend + bonus;
        System.out.println("Ттоговый баланс:" + finalBalance);
        System.out.println("Бонус:" + bonus);


    }
}
