package org.example.test_junitest.stream_api;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MainApi {

    public static Map<String, Stream<?>> mapStream = new HashMap<>();

    static {

        //stream from collections
        Stream<String> sString = Arrays.asList("Java", "C++", "Pyton", "ruby", "java", "Hello World").stream();
        mapStream.put("streamStringOfCollection", sString);
        // stream from value /значений
        Stream<Integer> sInt = Stream.of(1, 22, 3, 4, 67, 13, 2, 4, 56, 56, 6, 9, 10, 10);
        mapStream.put("streamIntegerOfValue", sInt);
        //stream from arrays
        String[] arrStr = {"A1", "a2", "a2", "A1", "aa12", "bb12", "a12", "A34"};
        Stream<String> s = Arrays.stream(arrStr);
//add of char cast intstream
        IntStream ii =  "HelloWorld new year , very good".chars();//IntStream
        mapStream.put("streamIntOfChars", ii.boxed());
        Stream<Object> object = Stream.builder().add("bb1").add("bb2").add("bb3").add("bb4").add("bb4").build();
// iterator
        sInt = Stream.iterate(0, (i) -> i + 1).limit(100L);
        mapStream.put("streamIntIterator", sInt);
        //Generator
        String str = "ss11";
        sString = Stream.generate(() -> str + "a").limit(10);
        mapStream.put("streamStringGenerator", sString);
    }

    public static void main(String[] args) {
        for(Map.Entry<String, Stream<?>> entry: mapStream.entrySet()){
            System.out.println(entry.getKey());
            entry.getValue().forEach(System.out::println);


        }
    }

    private static Stream getStream(String type) {
        return mapStream.get(type);
    }
}