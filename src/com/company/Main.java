package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phim đang chiếu: ");
        int n = sc.nextInt();
        sc.nextLine();

        ArrayList<Film> listFilm = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhập mã phim thứ %d: ", i + 1);
            String id = sc.nextLine();
            System.out.printf("Nhập tên phim thứ %d: ", i + 1);
            String name = sc.nextLine();
            System.out.printf("Nhập thể loại phim thứ %d: ", i + 1);
            String type = sc.nextLine();
            System.out.printf("Nhập độ dài phim thứ %d (phút): ", i + 1);
            int length = Integer.parseInt(sc.nextLine());
            System.out.printf("Nhập tên nhà sản xuất phim thứ %d: ", i + 1);
            String producer = sc.nextLine();
            System.out.printf("Nhập năm công chiếu phim thứ %d: ", i + 1);
            int openingYear = Integer.parseInt(sc.nextLine());
            listFilm.add(new Film(id,name,type,length,producer,openingYear));
        }
        for (Film film: listFilm){
            System.out.println(film);
        }
        System.out.println("Các phim có thể loại Action là: ");
        for (int i = 0; i < listFilm.size(); i++) {
            if (listFilm.get(i).type.equals("Action")) {
                System.out.println(listFilm.get(i));
            }
        }
    }
}
