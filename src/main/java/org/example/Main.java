package org.example;


import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        System.out.println(checkForPalindrome("ada12ada,ad   aa-da"));
//        System.out.println("**********************");
//        System.out.println(checkForPalindrome("A man, a plan, a canal, Panama"));

    }

    public static boolean checkForPalindrome(String text){
        boolean isPalindrome = true;
        String[] words = text.toLowerCase().replaceAll("[^a-zA-Z0-9]", "")
                .split("");
        for (int i = 0; i < words.length ; i++){
//            System.out.println(words[i] + " - " + words[(words.length-1)-i]);
            if(!words[i].equals(words[(words.length-1)-i])){
                return isPalindrome = false ;
            }
        }
        return isPalindrome;
    }

    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList = new LinkedList<>();
        while(decimal>0){
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal = decimal/2;
        }
        StringBuilder binaryString = new StringBuilder();
        for(int digit: binaryList){
            binaryString.append(digit);
        }
        return binaryString.toString();
    }

}