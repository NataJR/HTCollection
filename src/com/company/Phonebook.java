package com.company;

import java.util.HashMap;
import java.util.HashSet;


    public class Phonebook {


        HashMap<String, HashSet<String>> phb;

        public Phonebook() {
            this.phb = new HashMap<>();
        }

        public void addContact(String name, String phone) {
            HashSet<String> book = phb.getOrDefault(name, new HashSet<>());
            book.add(phone);
            HashSet<String> put = phb.put(name, book);
        }

        public void findAndPrint(String name) {
            System.out.println("Contact " + name + " / Phone number " + phb.getOrDefault(name, new HashSet<>()));
        }
    }


