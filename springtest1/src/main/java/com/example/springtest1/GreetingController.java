package com.example.springtest1;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value="name", defaultValue="Hello world") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(name));
    }

    @RequestMapping("/as")
    public Greeting as(@RequestParam(value="name", defaultValue="świat po co") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format(name));
    }
}