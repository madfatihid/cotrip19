package com.cotrip.cotripjfx;

import java.util.ArrayList;

public class Variables {
    public static Tourist currentTourist = null;
    public static Country currentCountry = null;
    public static ArrayList<Tourist> touristList = new ArrayList<>();
    public static ArrayList<Country> countryList = new ArrayList<>();
    public static ArrayList<Admin> adminList = new ArrayList<>();

    public static void initialize(){
        touristList.add(new Tourist("yusuf", "abc", "Yusuf Agung", 2));
        touristList.add(new Tourist("fathan", "abc", "Fathan Malik", 1));

        countryList.add(new Country("america", "abc", "America", false));
        countryList.add(new Country("australia", "abc", "Australia", true));
        countryList.add(new Country("china", "abc", "China", false));
        countryList.add(new Country("india", "abc", "India", true));
        countryList.add(new Country("indonesia", "abc", "Indonesia", false));
        countryList.add(new Country("japan", "abc", "Japan", false));
        countryList.add(new Country("sk", "abc", "South Korea", false));
        countryList.add(new Country("uk", "abc", "United Kingdom", false));

        adminList.add(new Admin("admin", "admin"));
    }
}
