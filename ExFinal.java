

//Подумать над структурой класса Ноутбук для магазина техники — выделить поля и методы. Реализовать в Java.
//
//        Создать множество ноутбуков.
//
//        Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
//        отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
//
//        "Введите цифру, соответствующую необходимому критерию:
//
//        1 - ОЗУ
//
//        2 - Объём ЖД
//
//        3 - Операционная система
//
//        4 - Цвет"
//
//        Далее нужно запросить минимальные значения для указанных критериев —
//        сохранить параметры фильтрации можно также в Map.
//        Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
//

import java.util.*;

public class ExFinal {
    public static void main(String[] args) {

        List<NoteBook> noteBooks = new ArrayList<>();

        NoteBook noteOne = new NoteBook("lenovo", 17.0, "i10", "windows", 12, 256);
        NoteBook noteTwo = new NoteBook("hp", 15.6, "i3", "linux", 6, 256);
        NoteBook noteThree = new NoteBook("acer", 15.6, "i3", "windows", 12, 128);
        NoteBook noteFour = new NoteBook("macbook", 13.3, "i5", "ios", 8, 512);
        NoteBook noteFive = new NoteBook("asus", 15.6, "amd5800", "windows", 6, 128);
        NoteBook noteSix = new NoteBook("macbook", 13.3, "i5", "ios", 4, 512);
        NoteBook noteSeven = new NoteBook("acer", 15.6, "i7", "linux", 6, 512);
        NoteBook noteEight = new NoteBook("lenovo", 15.6, "i8", "windows", 16, 512);
        NoteBook noteNine = new NoteBook("macbook", 15.6, "i7", "ios", 6, 512);
        NoteBook noteTen = new NoteBook("lenovo", 15.6, "i10", "linux", 6, 512);

        Collections.addAll(noteBooks, noteOne, noteTwo, noteThree, noteFour,
                noteFive, noteSix, noteSeven, noteEight, noteNine, noteTen);

        System.out.printf("\n1 - модель" +
                "\n2 - диагональ" +
                "\n3 - процессор" +
                "\n4 - операционная система" +
                "\n5 - оперативная память" +
                "\n6 - объем накопителя" +
                "\nвведите критерий сортировки через пробел, для продолжения нажмите Enter: ");
        Scanner in = new Scanner(System.in);
        String[] option = in.nextLine().split(" ");

        try {
            for (String str : option) {
                switch (str) {
                    case "1":
                        System.out.printf("Выберете модель - Acer, Lenovo, MacBook, Mac Air, HP: ");
                        model(noteBooks, in.next().toLowerCase(Locale.ROOT));
                        noteBooks.forEach(System.out::println);
                        break;
                    case "2":
                        System.out.printf("Выберете размер экрана - 13.3, 15.6, 17.0: ");
                        size(noteBooks, in.next().toLowerCase(Locale.ROOT));
                        noteBooks.forEach(System.out::println);
                        break;
                    case "3":
                        System.out.printf("Выберете модель процессора - amd5800, i3, i5, i7, i8, i10: ");
                        cpu(noteBooks, in.next().toLowerCase(Locale.ROOT));
                        noteBooks.forEach(System.out::println);
                        break;
                    case "4":
                        System.out.printf("Выберете модель процессора - windows, linux, ios: ");
                        os(noteBooks, in.next().toLowerCase(Locale.ROOT));
                        noteBooks.forEach(System.out::println);
                        break;
                    case "5":
                        System.out.printf("Выберете объем оперативной памяти - 4, 6, 8, 12, 16: ");
                        ram(noteBooks, in.next().toLowerCase(Locale.ROOT));
                        noteBooks.forEach(System.out::println);
                        break;
                    case "6":
                        System.out.printf("Выберете объем жесткого диска - 126, 256, 512: ");
                        ssd(noteBooks, in.next().toLowerCase(Locale.ROOT));
                        noteBooks.forEach(System.out::println);
                        break;
                    default:
                        throw new Exception();
                }
            }
        }catch (Exception e){
            System.out.println("Введены не корректные данные, начните сначала!");
        }
        in.close();
    }

    private static void model(List<NoteBook> list, String input){
        list.removeIf(item -> !input.equals(item.getModel()));
    }
    private static void size(List<NoteBook> list, String input){
        list.removeIf(item -> !input.equals(item.getSize().toString()));
    }
    private static void cpu(List<NoteBook> list, String input){
        list.removeIf(item -> !input.equals(item.getCpu()));
    }
    private static void os(List<NoteBook> list, String input){
        list.removeIf(item -> !input.equals(item.getOs()));
    }
    private static void ram(List<NoteBook> list, String input){
        list.removeIf(item -> !(item.getRam() == Integer.parseInt(input)));
    }
    private static void ssd(List<NoteBook> list, String input){
        list.removeIf(item -> !(item.getSsd() == Integer.parseInt(input)));
    }
}
