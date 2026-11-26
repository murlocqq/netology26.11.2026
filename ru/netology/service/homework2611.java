package ru.netology.service;
import java.util.Scanner;
import static ru.netology.service.CustomsService.calculateCustoms;

public class homework2611 {
    static void main() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Здравствуйте! Для расчёта стоимости пошлины, укажите:");
            System.out.print("Стоимость товара (в руб.): ");
            int price = scanner.nextInt();
            System.out.print("Вес товара (в кг.): ");
            int weight = scanner.nextInt();
        int customs = calculateCustoms(price, weight);
        System.out.println("Размер пошлины (в руб.): " + customs);
    }
    }
