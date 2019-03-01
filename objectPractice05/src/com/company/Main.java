package com.company;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {


        ArrayList<Person> teacher = new ArrayList<>();
        teacher.add(new Person("森田","奈良"));
        teacher.add(new Person("木村","埼玉"));
        teacher.add(new Person("高山","東京"));
        teacher.add(new Person("茂木","沖縄"));

        for (int i = 0; i < teacher.size(); i++) {
            teacher.get(i).getSelfIntroduction();
        }
    }
}