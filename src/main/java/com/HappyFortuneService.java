package com;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    public String getFortune(){
        return "What a lucky day!!";
    }
}
