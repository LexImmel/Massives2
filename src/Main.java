public class Main {
    public static void main(String[] args) {
        //Задача 1: Просчёт суммы, потраченной за первые дни месяца
        System.out.println("Задача 1");
        int[] spending = {12500, 41120, 99000, 50124, 19700};
        int totalSpent = 0;
        for (int i : spending) {
            totalSpent += i;
        }
        System.out.println("Сумма трат за месяц составила " + totalSpent + " рублей.");
        //Задача 2: Найти максимальное и минимальное значения трат за неделю
        System.out.println("Задача 2");
        int[] spentWeekly = {10900, 40000, 30000, 20000, 9000};
        int leastSpent = Integer.MAX_VALUE;//получилось только через данную функцию или установку макс значения больше, чем остальные значения, решил, что так лучше
        int mostSpent = 0;
        for (final int weekly : spentWeekly) {
            if (weekly > mostSpent) {
                mostSpent = weekly;
                for (int x : spentWeekly) {
                    if (x < leastSpent) {
                        leastSpent = x;
                    }
                }
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + leastSpent + " рублей. Максимальная сумма трат за неделю составила " + mostSpent + " рублей");
        //Задача 3: подсчет среднего значения трат за день, учитывая возможность дробного результата
        System.out.println("Задача 3");
        int[] weeklyMoney = {15000, 20000, 17009, 22000, 11000};
        int sum = 0;
        int day = 0;
        double total = 0;
        for (int weekSum : weeklyMoney) {
            sum += weekSum;
            day = day + 1;
            total = ((double) sum / day);
        }
        System.out.println("Средняя сумма трат за месяц составила " + total + " рублей");
        //Задача 4: Вывести массив с буквенными значениями наоборот, чтоб получились имя и фамилия
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}
