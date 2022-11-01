public class Practice {
    public static int subtractTen(int number) {
        return number - 10;
    }

    public static double average(int[] numbers) {
        double total = 0;
        for (double number : numbers) {
            total += number;
        }
        return total / numbers.length;
    }
    public static void main(String[] args) {
        System.out.println(subtractTen(20));
        int[] numbers = {5, 10, 15};
        System.out.println(average(numbers));
        }
    }

