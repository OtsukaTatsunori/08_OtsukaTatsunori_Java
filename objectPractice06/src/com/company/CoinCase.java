package com.company;

public class CoinCase {

    public int type;
    public int number;


    public CoinCase(int input_type, int input_number){
        type = input_type;
        number = input_number;
    }

    public void AddCoins(){

    System.out.println(type + "を" + number +"枚追加しました。");
    }
}
