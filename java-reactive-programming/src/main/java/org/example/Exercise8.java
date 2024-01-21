package org.example;


import reactor.core.publisher.Flux;

import java.io.IOException;

public class Exercise8 {
    public static void main(String[] args) {
        //Use ReactiveSource.intNumbersFluxWithException and print a message when error happens.

        //Print  values from intNumberFluxWithException and print a message when error happen.
        //TODO: Write code here.
//        ReactiveSources.intNumberFluxWithException()
//                .subscribe(num -> System.out.println(num),
//                        err -> System.out.println("Error Happened")
//                );
        //Alternative way to handle this with doOnError.
//        ReactiveSources.intNumberFluxWithException()
//                .doOnError(e -> System.out.println("Error! " + e.getMessage()))
//                        .subscribe(num -> System.out.println(num));

        //Print values from intNumbersFluxWithException and continue an errors.
        //TODO: Write code here.
//        ReactiveSources.intNumberFluxWithException()
//                .onErrorContinue((e, item) -> System.out.println("Error!! " + e.getMessage()))
//                        .subscribe(num -> System.out.println(num));

        //Print values form intNumbersFluxWithException and when errors
        //Happen. replace with a fallback sequence of -1 and -2
        //TODO: Write code here.
        ReactiveSources.intNumberFluxWithException()
                        .onErrorResume(err -> Flux.just(-1, -2))
                                .subscribe(num -> System.out.println(num));

        //There is doFinally method, It mainly return a signal.

        System.out.println("Press a key to end");
            try {
                System.in.read();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
