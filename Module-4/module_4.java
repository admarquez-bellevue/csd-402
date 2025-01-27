public class module_4 {

    public static short average(short[] array) {
        int sum = 0;
        for (short num : array) sum += num;
        return (short) (sum / array.length);
    }

    public static int average(int[] array) {
        int sum = 0;
        for (int num : array) sum += num;
        return sum / array.length;
    }

    public static long average(long[] array) {
        long sum = 0;
        for (long num : array) sum += num;
        return sum / array.length;
    }

    public static double average(double[] array) {
        double sum = 0;
        for (double num : array) sum += num;
        return sum / array.length;
    }

    public static void main(String[] args) {
        short[] shortArray = {10, 20, 30};
        int[] intArray = {15, 25, 35, 45};
        long[] longArray = {100L, 200L, 300L, 400L, 500L};
        double[] doubleArray = {1.5, 2.5, 3.5, 4.5, 5.5, 6.5};

        System.out.println("Short array: " + arrayToString(shortArray));
        System.out.println("Average (short): " + average(shortArray));

        System.out.println("\nInt array: " + arrayToString(intArray));
        System.out.println("Average (int): " + average(intArray));

        System.out.println("\nLong array: " + arrayToString(longArray));
        System.out.println("Average (long): " + average(longArray));

        System.out.println("\nDouble array: " + arrayToString(doubleArray));
        System.out.println("Average (double): " + average(doubleArray));
    }

    public static String arrayToString(short[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) sb.append(array[i]).append(i < array.length - 1 ? ", " : "");
        return sb.append("]").toString();
    }

    public static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) sb.append(array[i]).append(i < array.length - 1 ? ", " : "");
        return sb.append("]").toString();
    }

    public static String arrayToString(long[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) sb.append(array[i]).append(i < array.length - 1 ? ", " : "");
        return sb.append("]").toString();
    }

    public static String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) sb.append(array[i]).append(i < array.length - 1 ? ", " : "");
        return sb.append("]").toString();
    }
}
