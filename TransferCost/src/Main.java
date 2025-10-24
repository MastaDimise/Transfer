import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создание адресов.
        Adress adress = new Adress("Россия", "Москва");
        Adress adress1 = new Adress("Россия", "Нижний Новгород");
        Adress adress2 = new Adress("Россия", "Саратов");
        Adress adress3 = new Adress("США","Нью-Йорк");
        Adress adress4 = new Adress("США", "Лос-Анджелес");
        Adress adress5 = new Adress("США", "Майами");
        Adress adress6 = new Adress("Китай", "Гвуан-Джоу");
        Adress adress7 = new Adress("Китай", "Пекин");
        Adress adress8 = new Adress("Китай","Шан-Хай");


        // Создание "Мапы"
        Map<Adress, Integer> costPerAddress = new HashMap<>();
        costPerAddress.put(adress, 100);
        costPerAddress.put(adress1, 150);
        costPerAddress.put(adress2, 200);
        costPerAddress.put(adress3, 250);
        costPerAddress.put(adress4, 300);
        costPerAddress.put(adress5, 350);
        costPerAddress.put(adress6, 400);
        costPerAddress.put(adress7, 450);
        costPerAddress.put(adress8, 500);

        // Цыкл общения с пользователем

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("\nЗаполнение нового заказа. Либо введи 'end' для выхода");
            System.out.print("Введите страну: ");
            String country = scanner.nextLine();

            if ("end".equalsIgnoreCase(country)) {
                break;
            }

            System.out.print("Введите город: ");
            String city = scanner.nextLine();

            System.out.print("Введите вес (кг): ");
            int weight = scanner.nextInt();
            scanner.nextLine();

            // Создаем адрес для поиска
            Adress searchAddress = new Adress(country, city);

            // Проверяем, есть ли такой адрес в мапе
            if (costPerAddress.containsKey(searchAddress)) {
                int costPerKg = costPerAddress.get(searchAddress);
                int deliveryCost = costPerKg * weight;

                System.out.println("Стоимость доставки составит: " + deliveryCost + " руб.");
            } else {
                System.out.println("Доставки по этому адресу нет");
            }
        }
        scanner.close();
    }
    }
