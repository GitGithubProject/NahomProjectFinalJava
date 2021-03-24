package com.company;

import java.util.Scanner;
import java.util.Stack;

public class RemovePuntAndSpace {

  // create that compare the character
    public static boolean contains(char a, char[] arr){
        for(char x: arr){
            if(x == a)
                return  true;
        }
        return  false;
    }
    static  char[] _punctuations = {
            ',', ';', ':', '?', '!','-','\\','\"', ' ', '.',
            '/','@','#','$','%', '&','(',')','{','}'
    };

    static String RemovePunctuationAndSpace(String input)
    {
        //declare stack of char type
        Stack<Character> outputString = new Stack<>();

        for (int i = input.length() - 1; i>=0; i--)
        {
            var character = input.charAt(i);


            if (!contains(character, _punctuations))
            {
                outputString.push(character);
            }

        }
        String output="";

        while(!outputString.isEmpty()){

            output +=outputString.pop();

        }
        return output;

    }
    public static void main(String[] args)
    {

        Scanner userInput = new Scanner(System.in);

        // Ask string input from user
        System.out.print("Enter string: ");

        var str = userInput.nextLine();



        // apply the method that remove punctaution and space
        // and return string
        String processedString = RemovePunctuationAndSpace(str);


        System.out.println("A string without Puctuation is : " + processedString);


    }
}
