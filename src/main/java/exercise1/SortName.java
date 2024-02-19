package exercise1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortName {
    public static void main(String[] args) {
        List<String> names = List.of("Dima","Mykola","Ivan","Olga","Oleg","Sasha","Anna","Josh");
        System.out.println("Variant1 is: " + nameToStringV1(names));
        System.out.println("Variant2 is: " + nameToStringV2("Names.txt"));
    }
    public static String nameToStringV1(List<String> names){

        String result = names.stream()
                .filter(x -> names.indexOf(x) % 2 == 1)
                .map(x -> names.indexOf(x) + ". " + x)
                .collect(Collectors.joining(", "));

        return result;
    }

    public static String nameToStringV2 (String fileName){
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))){
            List<String> names = Arrays.stream(bufferedReader.readLine().split(" ")).toList();
            String result = names.stream().filter(x -> names.indexOf(x) % 2 == 1)
                    .map(x -> names.indexOf(x) + ". " + x)
                    .collect(Collectors.joining(", "));
            return result;
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
