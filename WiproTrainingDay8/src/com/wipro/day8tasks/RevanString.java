package com.wipro.day8tasks;

public class RevanString {
	 static public void main(String... pra){
	        String in="I am programming";
	        String ot = reverse(in);
	        System.out.println("Input: "+in);
	        System.out.println("Output: "+ot);
	    }
	    public static String reverse(String s){
	        String[] w=s.split(" ");
	        StringBuilder reversed=new StringBuilder();
	        for (int i=w.length-1;i>=0;i--){
	            reversed.append(w[i]);
	            if (i>0){
	                reversed.append(" ");
	            }
	        }
	        return reversed.toString();
	    }
	}

