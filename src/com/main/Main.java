package com.main;

import com.java8.domain.Transaction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by himanshu1920 on 16-06-2017.
 */
public class Main {

    private static List<Transaction> TRANSACTIONS = new ArrayList<>();
    public static void main(String st[]) {
        generateTransactions();
        sortAllByValueForYear2011();
        findAllTheUniqueCities();
        findAllTheTradersFromDelhiAndSortByName();

    }

    private static void sortAllByValueForYear2011() {
        TRANSACTIONS.stream().filter(transaction -> transaction.getYear() == 2011).sorted(Comparator.comparing(Transaction::getValue)
        ).forEach(System.out::println);
    }

    private static void findAllTheUniqueCities() {
        TRANSACTIONS.stream().map(transaction -> transaction.getCity()).distinct().forEach(System.out::println);
    }

    private static void findAllTheTradersFromDelhiAndSortByName() {
        TRANSACTIONS.stream().filter(transaction -> "Delhi".equalsIgnoreCase(transaction.getCity()))
                .sorted(Comparator.comparing(Transaction::getName)).forEach(System.out::println);
    }

    private static void generateTransactions() {
        Transaction transaction1 = new Transaction(200, 2011, "Delhi","Himanshu");
        Transaction transaction2 = new Transaction(100, 2011, "Banglore", "Milind");
        Transaction transaction3 = new Transaction(250, 2011, "Gurgaon", "Deepak");
        Transaction transaction4 = new Transaction(120, 2011, "Delhi", "Aakash");
        Transaction transaction5 = new Transaction(2000, 2011, "Banglore", "Bhavuk");
        Transaction transaction6 = new Transaction(2000, 2012, "Delhi", "Ramesh");
        TRANSACTIONS = Arrays.asList(transaction1, transaction2, transaction3, transaction4, transaction5, transaction6);
    }
}
