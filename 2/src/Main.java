import tariffs.*;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tariff> tariffs = new ArrayList<>();
        tariffs.add(new Basic("Простий", 99.0, 120, 500));
        tariffs.add(new Business("Бізнес PRO", 499.0, 30, 3));
        tariffs.add(new Internet("Інтернет 100", 199.0, 70, 100));

        System.out.println("Усі тарифи:");
        for (Tariff t : tariffs) {
            System.out.println(t);
        }

        System.out.println("Деталі тарифів:");
        for (Tariff t : tariffs) {
            System.out.println(t.getDetails());
        }

        System.out.println("Загальна кількість клієнтів:");
        int total = tariffs.stream().mapToInt(Tariff::getNumberOfClients).sum();
        System.out.println("Всього клієнтів: " + total);

        System.out.println("Сортування за абонплатою:");
        tariffs.stream()
                .sorted(Comparator.comparingDouble(Tariff::getMonthlyFee))
                .forEach(System.out::println);

        System.out.println("Тарифи в межах 150 – 400 грн:");
        tariffs.stream()
                .filter(t -> t.getMonthlyFee() >= 150 && t.getMonthlyFee() <= 400)
                .forEach(System.out::println);
    }
}