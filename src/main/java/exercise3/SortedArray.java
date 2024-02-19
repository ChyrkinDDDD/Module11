package exercise3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortedArray {
    public static void main(String[] args) {
        String[] arr = {"1, 2, 0", "4, 5"};
        sortArray(arr);
    }
    public static void sortArray(String[] arr){
        System.out.println(Arrays.stream(arr)
                .flatMap(element -> Arrays.stream(element.split(", ")))
                .sorted()
                .collect(Collectors.joining(", ")));
    }
}
