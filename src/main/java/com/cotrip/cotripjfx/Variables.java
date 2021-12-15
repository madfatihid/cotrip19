package com.cotrip.cotripjfx;

import java.util.ArrayList;

public class Variables {
    public static Tourist currentTourist = null;
    public static ArrayList<Tourist> touristList = new ArrayList<>();
    public static ArrayList<Country> countryList = new ArrayList<>();

    public static void initialize(){
        touristList.add(new Tourist("yusuf", "abc", "Yusuf Agung", 2));
        touristList.add(new Tourist("fathan", "abc", "Fathan Malik", 1));

        countryList.add(new Country("America", false));
        countryList.add(new Country("Australia", true));
        countryList.add(new Country("China", false));
        countryList.add(new Country("India", true));
        countryList.add(new Country("Indonesia", false));
        countryList.add(new Country("Japan", false));
        countryList.add(new Country("South Korea", false));
        countryList.add(new Country("United Kingdom", false));
    }
}
