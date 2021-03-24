package com.company;

import java.util.Scanner;

 public class MathematicalExpression {

        // Node structure containing powere
        // and coefficient of variable
        public class Node
        {
            public int coefficient, power;
            public Node next;
        };


        // Function add a new node at the end of list
        public Node AddNode(Node first, int coeff, int power)
        {
            // Create a new node
            Node newNode = new Node();

            newNode.coefficient = coeff;
            newNode.power = power;
            newNode.next = null;


            // If linked list is empty
            if (first == null)
                return newNode;

            // If linked list has nodes
            Node current = first;

            while (current.next != null)
                current = current.next;
            current.next = newNode;

            return first;
        }

        // Method to Display th linked list
        public void PrintList(Node theList)
        {
            while (theList.next != null)
            {
                System.out.print(theList.coefficient + "x^" + theList.power + " + ");

                theList = theList.next;
            }
            System.out.print(theList.coefficient + "\n");
        }
        public double ComputeEquation(Node equationIntheLinkedList, double xVariable)
        {
            double result = 0;

            Node evaluator = equationIntheLinkedList;

            while (evaluator != null)
            {
                result += evaluator.coefficient * Math.pow(xVariable, evaluator.power);
                evaluator = evaluator.next;
            }
            return result;
        }




        public static void main(String[] args) {


            //create instance of the class MathematicalExpression
            com.company.MathematicalExpression objectOfTheEquation = new com.company.MathematicalExpression();

            // declare node
            com.company.MathematicalExpression.Node eqaution = null;

            // Creation of the polymonial equation
            //: 3X^4 – 2X^3 + 5X^2 – 6X + 2\"
            eqaution = objectOfTheEquation.AddNode(eqaution, 3, 4);
            eqaution = objectOfTheEquation.AddNode(eqaution, -2, 3);
            eqaution = objectOfTheEquation.AddNode(eqaution, 5, 2);
            eqaution = objectOfTheEquation.AddNode(eqaution, -6, 1);
            eqaution = objectOfTheEquation.AddNode(eqaution, 2, 0);


            // Displaying the polynomial equation
            System.out.println("The expression of the Polynomial eqaution:- ");

            //Display the eqaution
            objectOfTheEquation.PrintList(eqaution);

            //ask user for input


            Scanner userInput = new Scanner(System.in);

            System.out.print("\nEnter value for xVariable ");

            var xValue = userInput.nextInt();



            //evaluate the expression using the input for value for x
            var result = objectOfTheEquation.ComputeEquation(eqaution, xValue);

            System.out.print("\nThe result of the equation is : " + result);



        }
 }

