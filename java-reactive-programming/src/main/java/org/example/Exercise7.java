package org.example;

import java.io.IOException;

public class Exercise7 {
    public static void main(String[] args) {
        //Use the ReactiveSources.intNumberMono() and ReactiveSource.userMono()

        //Print all values from intNumbersFlux that's greater than 5
        //TODO: write code here
//        ReactiveSources.intNumberFlux()
//                .filter(e -> e > 5)
//                .log()
//                .subscribe(System.out::println);

        //print 10 multiply by  each value from intNumbersFlux that's greater than 5
        //TODO:Write code here.
//        ReactiveSources.intNumberFlux()
//                .filter(e -> e > 5)
//                .map(e -> e * 10)
//                .subscribe(System.out::println);

        //Print 10 multiplied by  each value from intNumbersFlux for the first 3 numbers that emitted that is greater then 5
        //TODO: Write code here.
//        ReactiveSources.intNumberFlux()
//                .filter(e -> e > 5)
//                .map(e -> e * 10)
//                .take(3)
//                .subscribe(System.out::println);

        //print each number from intNumberFlux that's greater than 20.
        //Print -1 if no elements found
        //TODO: Write code here
//        ReactiveSources.intNumberFlux()
//                .filter(e -> e > 20)
//                .defaultIfEmpty(-1)
//                .subscribe(System.out::println);

        //Switch ints from intNumberFlux to the right user from userFlux
        //TODO: Write code here
//        ReactiveSources.intNumberFlux()
//                .flatMap(id -> ReactiveSources.userFlux().filter(user-> user.getId() == id))
//                        .subscribe(System.out::println);

        //Print only distinct numbers from intNumbersFluxWithRepeat
        //TODO: Write code here
//        ReactiveSources.intNumberFluxWithRepeat()
//                .distinct()
//                .log()
//                .subscribe();

        // Print from intNumberFluxWithRepeat excluding immediately repeating value
        //TODO: Write code here
        ReactiveSources.intNumberFlux()
                .distinctUntilChanged()
                .log()
                .subscribe();

        System.out.println("Press a key to end");
        try {
            System.in.read();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
