package org.example;

import org.springframework.stereotype.Component;

@Component
public class KeyBoard implements Writer{
    @Override
    public void writer() {
        System.out.println("The key bboard are used to type ");
    }
}
