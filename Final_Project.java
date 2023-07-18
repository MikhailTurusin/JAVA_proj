// 1. Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
// Реализовать в java.
// 2. Создать множество ноутбуков.
// 3. Написат метод, который будет запрашивать у пользователя критерий (или критерии)
// фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
// хранить в Map.
// Например: "Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет..."
//     1. Далее нужно запросить минимальные значения для указанных критериев -
//     сохранить параметры фильтрации можно также в Map.
//     2. Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

import java.io.IOException;
import java.util.*;

public class Final_Project {
    public static void main(String[] args) throws IOException{
        Laptop laptop1 = new Laptop("Acer", "16", "Windows", "4.5", "black");
        Laptop laptop2 = new Laptop("ASUS", "16", "Windows", "3.7", "white");
        Laptop laptop3 = new Laptop("Lenovo", "32", "Windows", "5.5", "yellow");
        Laptop laptop4 = new Laptop("Apple", "32", "macOS", "2.7", "grey");

        Set<Laptop> laptops = new HashSet<>(List.of(laptop1, laptop2,
                laptop3, laptop4));

        Map<String, String> sel = selectCriteria();
        sort(sel, laptops);
    }

    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        String scan = scanner.nextLine();
        return scan;
    }

    public static Map<String, String> selectCriteria() {
        Map<String, String> resultCriterias = new HashMap<>();
        while (true) {
            System.out.println("Вы хотите выбрать критерий? Если да введите 'y', если нет введите 'n'");
            String question = scanner();
            if (question.equals("n")) {
                break;
            } else {

                System.out.println(
                        "Введите цифру, соответствующую необходимому критерию: \n 1 - Модель \n 2 - ОЗУ \n 3 - ОС \n 4 - Вес \n 5 - Цвет");
                String key = scanner();
                System.out.println("Введите значения для выбранного критерия: ");
                String value = scanner();

                resultCriterias.put(key, value);
            }
        }
        System.out.println(resultCriterias);
        return resultCriterias;

    }

    public static void sort(Map<String, String> criterias, Set<Laptop> laptops) {

        Set<Laptop> temp = new HashSet<>(laptops);
        for (Laptop laptop : laptops) {

            for (Object pair : criterias.keySet()) {

                if (pair.equals("1") && !laptop.getModel().equals(criterias.get(pair))) {
                    temp.remove(laptop);
                }
                for (Object pair1 : criterias.keySet()) {

                    if (pair1.equals("2") && !laptop.getOZU().equals(criterias.get(pair1))) {
                        temp.remove(laptop);

                    }
                    for (Object pair2 : criterias.keySet()) {

                        if (pair2.equals("3") && !laptop.getOS().equals(criterias.get(pair2))) {
                            temp.remove(laptop);

                        }
                        for (Object pair3 : criterias.keySet()) {

                            if (pair3.equals("4") && !laptop.getWeight().equals(criterias.get(pair3))) {
                                temp.remove(laptop);

                            }
                            for (Object pair4 : criterias.keySet()) {

                                if (pair4.equals("5") && !laptop.getColor().equals(criterias.get(pair4))) {
                                    temp.remove(laptop);

                                }
                            }
                        }
                    }
                }
            }

        }
        if (temp.isEmpty()) {
            System.out.println("По введенным критериям ничего не найдено!");
        } else {
            System.out.println("Вот что мы можем предложить: \n" + temp.toString());
        }

    }
}