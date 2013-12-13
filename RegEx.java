package com.vilpesh.jee;

import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Aim: Demonstrate understanding of Regular Expressions.
 * Program developed as part of my training in Java 7 SE.
 * @author vilpesh
 */

public class RegEx {
    public static void main(String args[]) {
        String s = "Their are either 28 or 29 days in February other months have 30 or maximum 31 days.Seasons are Summer,Winter,Rainy in India.";
        
        Pattern p = Pattern.compile("(\\d)+");
        Matcher m = p.matcher(s);
        
        while(m.find()) System.out.println("Only numbers - " + m.group());
        
        m = p.compile("(F\\w+)").matcher(s);
        while(m.find()) System.out.println("Month - " + m.group());
        
        //m = p.compile("(\\w+)+").matcher(s);
        //while(m.find()) System.out.println("Total words - " + m.groupCount());
        
        StringTokenizer st = new StringTokenizer(s,".");
        while(st.hasMoreTokens()) System.out.println("Sentences are ...."+st.nextToken());
        
        m = p.compile("(\\w+[,])").matcher(s);
        while(m.find()) System.out.println("Seasons - " + m.group());
        
        m = p.compile("(d)+").matcher(s);
        while(m.find()) { System.out.println("Found - " + m.group()); s = m.replaceAll("#D#"); }
        System.out.println(s);
        
        System.out.println(System.getProperties().toString());
        
    }
}