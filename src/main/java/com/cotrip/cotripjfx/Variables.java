package com.cotrip.cotripjfx;

import java.util.ArrayList;

public class Variables {
    public static Tourist currentTourist = null;
    public static ArrayList<Tourist> touristList = new ArrayList<>();
    public static ArrayList<Country> countryList = new ArrayList<>();

    public static void initialize(){
        touristList.add(new Tourist("yusuf", "abc", "Yusuf Agung", 2));
        touristList.add(new Tourist("fathan", "abc", "Fathan Malik", 1));

        countryList.add(new Country("yusuf", "abc", "America", false));
        countryList.add(new Country("yusuf", "abc", "Australia", true));
        countryList.add(new Country("yusuf", "abc", "China", false));
        countryList.add(new Country("yusuf", "abc", "India", true));
        countryList.add(new Country("yusuf", "abc", "Indonesia", false));
        countryList.add(new Country("yusuf", "abc", "Japan", false));
        countryList.add(new Country("yusuf", "abc", "South Korea", false));
        countryList.add(new Country("yusuf", "abc", "United Kingdom", false));
    }
}
