package com.company;

public class Color {

    String zvet;

    public String zvet(String a){

    String b = "неизвестно";

    switch(a){
        case "Leto":
            b = "желтый";
            break;
            
        case "Zima":
            b = "белый";
            break;
            
        case "Osen":
            b = "серый";
            break;
            
        case "Vesna":
            b = "черный";
            break;

    }
    return b;
    }



}
