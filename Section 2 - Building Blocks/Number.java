// this is a demo of how packages works

import java.util.Random;

public class Number{
    public static void main(String[] args){
        Random randomNumber = new Random();
        System.out.println(randomNumber.nextInt(100));
    }
}