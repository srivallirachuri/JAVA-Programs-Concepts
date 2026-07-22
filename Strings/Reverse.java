package Strings;

import java.util.Stack;

public class Reverse {
    public static void main(String[] args) {
        String str="Java is good";
        Stack<Character>stack=new Stack<>();
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) != ' '){
                stack.push(str.charAt(i));
            }else{
                while(!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                System.out.print(" ");
            }

        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }    
}
