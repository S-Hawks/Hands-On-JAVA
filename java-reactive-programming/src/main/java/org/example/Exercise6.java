package org.example;

import javax.print.attribute.standard.RequestingUserName;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) throws IOException {
        //Use ReactiveSources.unresponsiveFlux and ReactiveSources.unresponsiveMono()

        //Get the value from the Mono into a String variable but give up after 5 seconds
        String foo = ReactiveSources.unresponsiveMono().block(Duration.ofSeconds(5));


        //Get the value from unresponsiveFlux into a String list but give up after 5 seconds
        //Collect list mainly provide mono(single element) of list

        List<String> list = ReactiveSources.unresponsiveFlux().collectList().block(Duration.ofSeconds(5));


        System.out.println("Press a key to end");
        System.in.read();
    }

}
