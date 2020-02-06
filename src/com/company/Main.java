package com.company;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        String[] words = {"table", "chair", "shelf", "cupboard", "locker", "cabinet", "bar", "locker", "sofa", "couch", "couch"};

        HashMap<String, Integer> furniture = new HashMap<>();

        for (String x : words) {

            furniture.put(x, furniture.getOrDefault(x,0)+1);
                }
                System.out.println(furniture);





                /* here we create a phone book and look for a number by last name */


                Phonebook book = new Phonebook();
                book.addContact("Ivanoff", "987-987");
                book.addContact("Petroff", "567-765");
                book.addContact("Sidoroff", "123-321");
                book.addContact("Ivanoff", "345-543");
                book.addContact("Ivanoff", "567-765");
                book.addContact("Zajac", "123-321");

                book.findAndPrint("Ivanoff");
                book.findAndPrint("Petroff");
                book.findAndPrint("Zajac");
            }
        }


//* home woke done

//*commit for pull request
