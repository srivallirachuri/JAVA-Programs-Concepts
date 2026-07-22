package Strings;

import java.util.HashMap;

public class Anagram{
    public static void main(String[] args) {
        String str1="anagram";
        String str2="nagaram";
        HashMap<Character,Integer>map=new HashMap<>();
        if(str1.length() != str2.length()){
            System.out.println("Not anagram");
            return;
        }
        for(int i=0; i<str1.length(); i++){
            char ch=str1.charAt(i);
             map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0; i<str2.length(); i++){
            char ch=str2.charAt(i);
            int newcount=map.getOrDefault(ch, 0)-1;
            if(newcount < 0){
                System.out.println("Not anagram");
                return;
            }
            map.put(ch, newcount);
        }
        for(int value : map.values()){
            if(value != 0){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("anagram");
    }
}