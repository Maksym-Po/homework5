package ua.ithillel.lms;

public class Main {
    public static void main(String[] args) {

        int s = 0;
        int a = 13;
        int b = 66;
        for (int i = 1; i < 101; i++) {
            s++;
            if (s != a && s != b) {
                System.out.println(s);
            }
        }
        System.out.println("Конец первого задания");


        int d = 1;
        for (int i = 1; i < 100; i++) {
            d = d * i;
            if (d < 1000) {
            } else {
                System.out.println(d);
                System.out.println("Конец второго задания");
                break;
            }
        }

        CreditCard client = new CreditCard();

        client.cardNumber = "2323 2355 3363";
        client.owner = "Ivanov";
        client.typeCard = "Мир";

        switch (client.typeCard) {
            case "Visa":
                System.out.println(" Ув." + client.owner + " поздравляем, вы используете нормальную карту");
                break;
            case "Mastercard":
                System.out.println(" Ув." + client.owner + " поздравляем, вы используете нормальную карту");
                break;
            case "Мир":
                System.out.println(client.owner + " пошел ты на х#й вместе со своим русским кораблем!!");
                break;
            default:
                System.out.println("Неизвестный тип карты:" + client.typeCard);
        }
    }
}