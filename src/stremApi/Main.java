package stremApi;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args){

        // finite stream from collection

        List<String> countries = Arrays.asList("iran", "iraq", "scotland");
        Stream<String> stream = countries.stream();
        stream.forEach(System.out::println);

        List<String> countries1 =   Arrays.asList("iran", "scotland", "england", "french");

        Stream<String> countriesStrem = countries1.stream();
        countriesStrem.filter(country -> country.startsWith("ir"))
                        .forEach(System.out::println);

        System.out.println("================================");

        // finite stream from array
        int[] numbers = {1, 2, 3, 4};
        IntStream numStream = Arrays.stream(numbers);
        numStream.forEach(System.out::println);

        int[] ages = {23, 43, 54};
        IntStream agesStream = Arrays.stream(ages);
        agesStream.filter(age -> age > 34)
                .forEach(System.out::println);

        //finite stream from file

        try(Stream<String> lines = Files.lines(Paths.get("/Users/hamedmiri/Documents/Developer/Leedcode-150/leedcode_150/src/stremApi/data.txt"))){
            lines.forEach(System.out::println);
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        try(Stream<String> lines = Files.lines(Paths.get("/Users/hamedmiri/Documents/Developer/Leedcode-150/leedcode_150/src/stremApi/data.txt"))){
                lines.forEach(System.out::println);
        }catch(IOException e){
            throw new RuntimeException(e);
        }

        System.out.println("=========================");

        // unbound sequence of elements
        Random random = new Random();

        IntStream randomStream = IntStream.generate(random::nextInt)
                .limit(10);
        randomStream.forEach(System.out::println);




        System.out.println("==========================");

        // shrinking the snip
        Random random1 = new Random();

        IntStream.generate(random::nextInt)
                .limit(5)
                .forEach(System.out::println);

        System.out.println("=========================");

        //filter() method

        List<Integer> numbers1 = Arrays.asList(1, 2,3, 4, 5, 6, 7, 8, 9);

        List<Integer> list = numbers1.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(list);

        System.out.println("=========================");

        //filter()2

        List<String> names = Arrays.asList("hamed", "clair", "hamid", "emma");

        List<String> longNames  = names.stream()
                .filter(name -> name.length() > 4)
                .collect(Collectors.toList());

        System.out.println(longNames);

        //filter() null or empty values data cleaning

        List<String> words = Arrays.asList("hamed", "", null, "bazar");

        List<String> validElements = words.stream()
                .filter(Objects::nonNull)
                .filter(word -> !word.isEmpty())
                .collect(Collectors.toList());
        System.out.println(validElements);

        System.out.println("=========================");

        //flatMap() transforms each element into streams of elements and flatens thoese streams into one stream

        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("hamed", "miri"),
                Arrays.asList("majid", "nosrati")
        );

        List<String> flatNames = namesNested.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatNames);

        System.out.println("========================");

        List<String> names1 = Arrays.asList("hamed", "novinneeee", "aashdkasda", "adhasdhasku");

        List<String> threeLongest = names1.stream()
                        .sorted(Comparator.comparingInt(String::length).reversed())
                        .collect(Collectors.toList());
        System.out.println(threeLongest);


        System.out.println("=============================");

        List<String> fruits = Arrays.asList("Bannana", "Apple", "Orange");
        Stream<String> fruitStream = fruits.stream();

        List<String> modified = fruits.stream()
                .map(String::toLowerCase)
                .collect(Collectors.toList());
        System.out.println(modified);


        System.out.println("===============================");

        List<Integer> numbers3 = Arrays.asList(1, 2, 3, 4);

        Optional<Integer> sum = numbers3.stream()
                .reduce((a , b) -> a + b);
        sum.ifPresent(System.out::println);


        System.out.println("=============================");

        List<Integer> nums = Arrays.asList(1, 2, 3, 4);

        long count = nums.stream()
                .count();
        System.out.println(count);

        System.out.println("===============================");

        //finding min and max by using reduce

        List<Integer> nums1 = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> max = nums1.stream()
                .reduce((a, b) -> a > b ? a: b);
        max.ifPresent(System.out::println);


        System.out.println("==============================");

        List<Integer> nums2 = Arrays.asList(1, 2, 3, 4,5 ,6);

        Optional<Integer> max1 = nums2.stream()
                .max(Integer::compareTo);
        System.out.println(max1.get());
        

    }
}
