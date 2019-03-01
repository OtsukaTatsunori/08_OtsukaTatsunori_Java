package com.company;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] word = new String[10];
        String[] meaning = new String[10];
        Scanner scan = new Scanner(System.in);
            int i = 0;
        while (true) {
            System.out.println("単語と意味を入力(区切りはスペース) 0 0→終了");
            word[i] = scan.next();
            meaning[i] = scan.next();
                if (word[i].equals("0")) {
                    break;
                }
                    i++;

        }
            for (int all = 0; all < word.length; all++) {
                System.out.print("単語[" + all + "]:" + word[all]);
                System.out.print(" 意味[" + all + "]:" + meaning[all]);
                System.out.println(" ");
            }
                Word number = new Word(i);
                number.Register();
    }
}
