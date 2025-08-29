package org.example;

import java.util.Scanner;

public class LongestLine {
    public static void main(String[] args) {
        String s = "Hello India";
        s=s+' ';
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if(ch!=' ')
            {
                System.out.println(ch);
            }
            else
            {
                System.out.println();
            }
        }
    }
    }

// in case of var final will make it a constant
// method - overriidn stpop
// class - stop inheritance