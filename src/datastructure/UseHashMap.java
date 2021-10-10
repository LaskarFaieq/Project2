package datastructure;

import sun.lwawt.macosx.CImage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> personalInfo = new HashMap<>();
        personalInfo.put("first name ","jhon");
        personalInfo.put("last name", "doe");
        personalInfo.put("cellphone", "3477873259");
        personalInfo.put("email address", "jhondoe@gmail.com");

        System.out.println(personalInfo.get("cellphone"));

        List<String> citiesOfUsa = new ArrayList<>();
        citiesOfUsa.add("NYC");
        citiesOfUsa.add("LA");
        citiesOfUsa.add("Miami");
        List<String> citiesOfCanada = new ArrayList<>();
        citiesOfCanada.add("Toronto");
        citiesOfCanada.add("Montreal");
        citiesOfCanada.add("Ottawa");
        List<String> citiesOfEngland = new ArrayList<>();
        citiesOfEngland.add("London");
        citiesOfEngland.add("Manchester");
        citiesOfEngland.add("Leeds");

        Map<String, List> map = new HashMap<>();
        map.put("USA",citiesOfUsa);
        map.put("Canada", citiesOfCanada);
        map.put("England", citiesOfEngland);

        System.out.println(map.get("USA"));
        for (Map.Entry entry: map.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}
