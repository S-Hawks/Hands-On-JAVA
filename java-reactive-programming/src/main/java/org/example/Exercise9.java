package org.example;

import java.io.IOException;

public class Exercise9 {
    public static void main(String[] args) {
        //Use ReactiveSource.intNumberFlux()

        //Print size of intNumberFlux after the last item returns
        //TODO: Write code here.
//        ReactiveSources.intNumberFlux().count()
//                .subscribe(System.out::println);


        //Collect all items of intNumbersFlux into a signal list and print it
        //TODO: Write code here
//        ReactiveSources.intNumberFlux().collectList().subscribe(System.out::println);

        //Transform to a sequence of sums of adjacent numbers
        //TODO: Write code here
        ReactiveSources.intNumberFlux().buffer(2).map(list -> list.get(0) + list.get(1)).subscribe(System.out::println);

        //For Throwing error
        ReactiveSources.intNumberFlux().buffer(2).map(list -> list.get(0) + list.get(1))
                        .subscribe(System.out::println,
                                throwable -> {
                            if(throwable instanceof IndexOutOfBoundsException){
                                System.err.println("IndexOutOfBoundException occurred");
                            }else{
                                System.err.println("An Unexpected error occurred: " + throwable.getMessage());
                            }
                                }
                                );

        System.out.println("press a key to end");

        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
