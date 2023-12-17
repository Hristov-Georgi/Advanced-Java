package setsAndMaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex05Phonebook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, String> contacts = new HashMap<>();
        String contactData = scanner.nextLine();

        while(!contactData.equals("search")) {

            String name = contactData.split("-")[0];
            String phoneNumber = contactData.split("-")[1];
            contacts.put(name, phoneNumber);

            contactData = scanner.nextLine();
        }

        contactData = scanner.nextLine();
        while(!contactData.equals("stop")){

            if (contacts.containsKey(contactData)) {
                System.out.printf("%s -> %s%n", contactData, contacts.get(contactData));

            } else {
                System.out.printf("Contact %s does not exist.%n", contactData);
            }

            contactData = scanner.nextLine();
        }
    }
}
