import java.time.LocalDate;
import java.time.temporal.TemporalAmount;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import static java.util.Collections.min;

import java.util.*;

import static java.util.Collections.min;

public class Main {

    public static void flowersCalc(Map<Flower, Integer> collec) {
        double sum = 0;
        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Flower, Integer> entry : collec.entrySet()) {
            sum += entry.getKey().getCost() * entry.getValue();
            list.add(entry.getKey().getLifeSpan());
            System.out.printf("Букет будет стоить %.2f и простоит %d суток", (sum + sum * 0.1), min(list));
        }
    }

    public static void main(String[] args) {

        Flower rose = new Flower("Роза обыкновенная", "", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", "", "", 15, 5);
        Flower peony = new Flower("Пион", "", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", "", "Турция", 19.5, 10);
        System.out.println(rose);


        Map<Flower, Integer> collect = new HashMap<>();
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите название цветка для букета. Доступные цветы Роза, Хризантема, Пион, Гипсофила.\nИли введите стоп для формирования букета ");
            String i = in.nextLine();
            i = i.toLowerCase();
            if (i.equals("стоп")) {
                in.close();
                break;
            }
            System.out.print("Введите количество цветов ");
            int quant = in.nextInt();
            if (i.equals("роза")) {
                collect.put(rose, quant);
            } else if (i.equals("хризантема")) {
                collect.put(chrysanthemum, quant);
            } else if (i.equals("пион")) {
                collect.put(peony, quant);
            } else if (i.equals("гипсофила")) {
                collect.put(gypsophila, quant);
            }
        }
        flowersCalc(collect);
        System.out.println(rose);
    }
}