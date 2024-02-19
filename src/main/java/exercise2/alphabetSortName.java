package exercise2;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class alphabetSortName {
    public static final String FILE_NAME = "Names.txt";
    public static void main(String[] args)  {
        System.out.println(reverseSort(takeFromFile(FILE_NAME)));
    }
    public static List<String> reverseSort(List<String> list){
        return list.stream()
                .sorted(Collections.reverseOrder())
                .map(String::toUpperCase)
                .toList();
    }
    private static List<String> takeFromFile(String fileName){
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            return Arrays.stream(bufferedReader.readLine().split(" ")).toList();
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
