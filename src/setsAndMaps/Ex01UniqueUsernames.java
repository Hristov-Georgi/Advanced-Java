package setsAndMaps;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ex01UniqueUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<String> usernamesSet = new LinkedHashSet<>();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String username = scanner.nextLine();
            usernamesSet.add(username);
        }

        for (String name: usernamesSet) {
            System.out.println(name);
        }
    }
}
