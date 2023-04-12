package Homework5;

import java.util.HashMap;
import java.util.Map;
//Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.

import java.util.*;

public class Task51 {
    public static void menuTellBook() {
        Map<String, ArrayList> tellbook = new HashMap<>();
        ArrayList<String> list1 = new ArrayList<>();
        Collections.addAll(list1, "890500", "Sidorov");
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "890900", "Petrov");
        ArrayList<String> list3 = new ArrayList<>();
        Collections.addAll(list3, "890901", "Petrov");

        tellbook.put("0", list1);
        tellbook.put("1", list2);
        tellbook.put("2", list3);

        System.out.println("Command Options: ");
        System.out.println("1: Добавить контакт");
        System.out.println("2: Удалить контакт");
        System.out.println("3: Поиск контакта ");
        System.out.println("4: Показать все контакты");
        System.out.println("5: Quit");
        Scanner scan = new Scanner(System.in);
        String choice = scan.nextLine();
//        while (true) {
        switch (choice) {

            case "1":
                while (true) {
                    System.out.print("new contakt, (for exit enter - *) ");
                    Scanner in = new Scanner(System.in);
                    System.out.print("Input tel: ");
                    String tell = in.nextLine();
                    System.out.print("Input name: ");
                    String name = in.nextLine();
                    ArrayList<String> listN = new ArrayList<>();
                    Collections.addAll(listN, tell, name);
                    tellbook.put(String.valueOf((tellbook.size())), listN);
                    System.out.println(tellbook);
                    if (tell.equals("*") || name.equals("*")) {
                        System.exit(0);
                    }
                }

            case "2":
                while (true) {
                    System.out.print("delete contakt, (for exit enter - *)");
                    System.out.println(tellbook);
                    Scanner in1 = new Scanner(System.in);
                    System.out.print("Enter id contakt for delete");
                    String id = in1.nextLine();
                    tellbook.remove(id);
                    System.out.println(tellbook);
                    if (id.equals("*")) {
                        System.exit(0);
                    }
                }
            case "3":
                while (true) {
                    System.out.println("search contakt, (for exit enter - *)");
                    System.out.println("Enter name");
                    String name = scan.nextLine();

                    for (ArrayList item1 : tellbook.values()) {

                        for (int j = 0; j < item1.size(); j++) {
                            if (name.equals(item1.get(j))) {
                                System.out.println(item1);
                            }
                        }
                    }
                    if (name.equals("*")) {
                        System.exit(0);
                    }
                }
            case "4":

                System.out.println("view all kontact");
                System.out.println(tellbook);
                System.exit(0);

            case "5":
                System.exit(0);

        }
    }
}