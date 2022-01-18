package com.company;

public enum Season {

    Leto ("желтый"),
    Zima ("белый"),
    Osen ("серый"),
    Vesna ("черный");


    private String Vzvet;

    Season (String Vzvet){
        this.Vzvet = Vzvet;
    }

    public String getVZvet() {
        return Vzvet;
    }
}
