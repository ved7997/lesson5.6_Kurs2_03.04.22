package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("один ", "два ", "три ", "два ", "четыре", "два ", "пять ", "два ", "шесть ", "два "));
        System.out.println("выводим нечётные числа:");
        oddNumbers(nums);
        System.out.println("выводим чётные числа:");
        evenNumbers(nums);
        printString(words);
        printDuplicatesNumbers(words);

    }
    public static void oddNumbers(List<Integer> nums){
        for (int num : nums){
            if (num % 2 != 0){
                System.out.println(num);
            }
        }
    }

    public static void evenNumbers(List<Integer> nums){
        List<Integer> uniqueElements = new ArrayList<>(Set.copyOf(nums));
        Collections.sort(uniqueElements);
        uniqueElements.removeIf(num -> num % 2 != 0);
        for (Integer num : uniqueElements){
            System.out.println(num + " ");
        }
    }

    public static void printString(List<String> words){
        Set<String> uniqueWords = new HashSet<>(words);
        List<String> duplicatedWords = new ArrayList<>(words);
        for (String uniqueWord : uniqueWords){
            duplicatedWords.remove(uniqueWord);
        }
        uniqueWords.remove(duplicatedWords);
        System.out.println(uniqueWords);
    }

    public static void  printDuplicatesNumbers(List<String> words){
        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(words.size() - uniqueWords.size());

    }

}
