package com.wipro.day8tasks;
import java.util.Stack;
public class StringValidationusStack{
    public static boolean isValid(String s){
        Stack<Character> stack=new Stack<>();
        for(char ch:s.toCharArray()){
            if(ch =='('||ch=='{'||ch=='['){
                stack.push(ch);
            }else{
                if(stack.isEmpty()){
                    return false;
                }
                char top=stack.pop();
                if((ch==')'&&top!='(')||(ch=='}'&&top!='{')||(ch==']'&&top!='[')){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    static public void main(String... pra) {
        System.out.println(isValid("()"));//true
        System.out.println(isValid("()[]{}"));//true
        System.out.println(isValid("(]"));//false
        System.out.println(isValid("([)]"));//false
    }
}