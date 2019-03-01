package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        ArrayList<String> word = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
            int i = 0;
            try{
                while (true) {
                    System.out.println("単語と意味を入力(区切りはスペース) 0→終了");
                    word.add(scan.nextLine());
                    if (word.contains("0")) {
                        break;
                    }
                        i++;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("登録制限を超えました。登録済みのデータを表示します。");
            }

            for (int all = 0; all < word.size(); all++) {
                System.out.print("[" + all + "]:" + word.get(all));
                System.out.println(" ");

            }
                Word number = new Word(i);
                number.Register();
    }
}

