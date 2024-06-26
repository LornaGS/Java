package com.qa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)  {

        try{ ageCheck(12);


        }catch(AgeCheckException e){
            System.out.println(e);


        }

    }

        // custom exception
         static void ageCheck(int age) throws AgeCheckException {

            if(age < 16){
                throw new AgeCheckException("Age is below 16 yo"); // throw - throws an object.  Creates an object then does whats in the method

            }else{

                throw new AgeCheckException("old enough");
            }
        }


//        try(Scanner scan = new Scanner(System.in)){  // try with resources
//            System.out.println("Enter number ");
//            int a = scan.nextInt();
//            System.out.println("Enter number ");
//            int b = scan.nextInt();
//            System.out.println(a+b);
//        } catch(InputMismatchException ime){
//            System.out.println("Only allows numbers");
//
//        }



//        BadCalc badCalc = new BadCalc();
//
//          badCalc.multi(1,2);
//          badCalc.divide(4,2);
//
////        System.out.println( badCalc.multi(1,2) + badCalc.divide(4,0));
//
//// go from most specific/common to least specific / common - exception is the least specifi
//        try{
//            System.out.println(" Divide result " + badCalc.divide(4,2));
//            System.out.println(" Multiply result " + badCalc.multi(4,2));
//
//        } catch(ArithmeticException e){
//
//            System.out.println("you cant divide by 0");
//        } catch (Exception e){
//
//            System.out.println("Second catch");
//        } finally{
//            System.out.println("This still runs");
//
//        }

}
