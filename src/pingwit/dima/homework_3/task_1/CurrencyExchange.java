package pingwit.dima.homework_3.task_1;

public class CurrencyExchange {
    public static void main(String[] args) {
        int usd = 1345; // технически название переменной верное, но не называй так -> usd
        int currencyId = 5;
        switch (currencyId) {
            case 1 -> System.out.println((usd * 39) + "₴");
            case 2 -> System.out.println((usd * 151) + "¥");
            case 3 -> System.out.println((usd * 7) + "¥");
            case 4 -> System.out.println((usd / 2) + "€");
            default -> System.out.println("Ваш банк не может обменять данную валюту");// лишняя строка, удали
        }
    }
}
