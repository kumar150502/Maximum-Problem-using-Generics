import java.util.Comparator;
public class FindMaximum {
    public static <T extends Comparable<T>> T findMaximum(T first, T second, T third) {
        T max = first;
        if (second.compareTo(max) > 0) {
            max = second;
        }

        if (third.compareTo(max) > 0) {
            max = third;
        }

        return max;
    }

    public static void main(String[] args) {
        Integer[] integers = {10, 20, 30};
        Float[] floats = {10.1f, 20.2f, 30.3f};
        String[] strings = {"Apple", "Peach", "Banana"};

        Integer maxInteger = findMaximum(integers[0], integers[1], integers[2]);
        Float maxFloat = findMaximum(floats[0], floats[1], floats[2]);
        String maxString = findMaximum(strings[0], strings[1], strings[2]);

        System.out.println("The maximum integer is " + maxInteger);
        System.out.println("The maximum float is " + maxFloat);
        System.out.println("The maximum string is " + maxString);
    }
}
