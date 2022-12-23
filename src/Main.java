public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            System.out.println("Сумма трат за месяц составила " + sum + " рублей ");
        }
    }

    private static void task2() {
        int[] arr = generateRandomArray();
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                if (arr[i] < min)
                    min = arr[i];
                System.out.println("Максимальная сумма трат за день составила" + max + "рублей.Минимальная сумма трат за день составила" + min);
            }
        }
    }

    private static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        int day = 30;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            sum = sum / day;
            System.out.println("Средняя сумма трат за месяц составила" + sum + "рублей");
        }
    }

    private static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length -1; i >= 0; i--) {
                System.out.print(reverseFullName[i]);

            }
    }
}
