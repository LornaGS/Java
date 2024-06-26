package com.qa;

public class TestBooks {



    public static void main(String[] args) {





     // String[] collection = {"lorna", "jeremy", "cameron" };

        Books book1 = new Books ("good", "jez", "100");
        Books book2 = new Books ("good2", "jez2", "1002");
        Books book3 = new Books ("good3", "jez3", "1003");

        System.out.println(book1.toString());
        System.out.println(book2.toString());
        System.out.println(book3.toString());

        Books [] collection = new Books[3];

        //Books[] collection = {book1, book2, book3}; or
        collection[0] = book1;
        collection[1] = book2;
        collection[2] = book3;

    for (Books b : collection){
        System.out.println(b);
    }
//      or this   for (int i=0; i<collection.length; i++ ){
//
//            System.out.println(collection[i]);
//        }


    }

}




