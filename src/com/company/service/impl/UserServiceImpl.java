package com.company.service.impl;

import com.company.enums.Gender;
import com.company.model.User;
import com.company.service.UserService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserServiceImpl implements UserService {
//    UserDao userDao = new UserDao();
    Scanner scanner = new Scanner(System.in);


    @Override
    public void addUser(List<User> users) {
        System.out.println("Write the gender: ");
        String gen = scanner.nextLine();
        System.out.println("Write the name: ");
        String names = scanner.nextLine();
        System.out.println("Write the Id: ");
        int id = scanner.nextInt();
        System.out.println("Write the age: ");
        int age = scanner.nextInt();
        users.add(new User(id,names,age,Gender.getGender(gen)));
    }

    @Override
    public void findById(List<User> users) {
        System.out.println("Укажите user's ID:");
        int idUsers = scanner.nextInt();
         users.stream().filter(user -> user.getId() == idUsers).forEach(System.out::println);

//        users.stream().filter(user -> {
//            if (user.getId() == idUsers) {
//                users.forEach(System.out::println);
//            } else {
//                System.out.println("Нету такого пользователь с такими ID!");
//            }
//            return false;
//        });

//        for (User user : users) {
//            if (idUsers == user.getId()) {
//                System.out.println(" User{" +
//                        "id=" + user.getId() +
//                        ", name='" + user.getName() + '\'' +
//                        ", age=" + user.getAge() +
//                        '}');
//            } else {
//                System.out.println("Нету такого пользователь с такими ID!");
//            }
        //}
    }

    @Override
    public void deleteById(List<User> users) {
        System.out.println("Уажите ID users, чтобы удалить: ");
        int idUsers = scanner.nextInt();
        if (users.removeIf(user -> user.getId() == idUsers)) {
            System.out.println("Удалено!");
        } else System.out.println("Не удалено!\n Нету пользователья с такими ID ");
    }

    @Override
    public void getUsers(List<User> users) {
        for (User user : users) {
            System.out.println(user.toString());
        }
    }
}
