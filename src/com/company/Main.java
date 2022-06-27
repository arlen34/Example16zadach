package com.company;

import com.company.enums.Gender;
import com.company.model.User;
import com.company.service.UserService;
import com.company.service.impl.UserServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 1 деген id менен userди таап консольго чыгарыныз.
 * 2) Эгер ал id жок болсо анда RunTimeException кармасын.
 * 3) Exception ди озунуздор тузунуздорю
 * 4) Баардык userлерди консольго чыгарыныз.
 * 5) 2 деген id менен userди очурунуз.
 * 6) Баардык userлерди консольго чыгарыныз.
 */
public class Main {

    public static void main(String[] args) {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Teacher", 30, Gender.FEMALE));
        userList.add(new User(2, "Student1", 20,Gender.MALE));
        userList.add(new User(3, "Student2", 20,Gender.MALE));

        Scanner scanner = new Scanner(System.in);
        UserService userService = new UserServiceImpl();
        while (true) {
            System.out.println("\n1.Find user by ID.");
            System.out.println("2.Add new user.");
            System.out.println("3.Delete user by ID.");
            System.out.println("4.Get all users.\n");
            switch (scanner.nextInt()) {
                case 1 -> userService.findById(userList);
                case 2 -> userService.addUser(userList);
                case 3 -> userService.deleteById(userList);
                case 4 -> userService.getUsers(userList);
            }
        }
    }
}
