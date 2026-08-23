package org.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pen implements Writer{
    @Override
    public void writer() {
        System.out.println("You know the pen was when invented");
    }
}
