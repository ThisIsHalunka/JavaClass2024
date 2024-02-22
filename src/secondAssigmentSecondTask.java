public class secondAssigmentSecondTask {
    public static void main(String[] args){
        String exampleWord = "WhatABeautifulDay";
        String result = reversedString(exampleWord);

        System.out.println(result);
    }
    public static String reversedString(String word){
        if(word.length() < 10){
            return "Length must be > 10 chars";
        } return new StringBuilder(word).reverse().toString();
    }
}
