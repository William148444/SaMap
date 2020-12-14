package com.company;

import java.util.HashMap;

public class Person {

    private String name;
    private MyMap currentMap;
    private String currentLocation;
    private Integer distance;

    public Person(String name, MyMap mymap, String currentLocation){
        this.name = name;
        this.currentMap = mymap;
        this.currentLocation = currentLocation;
        distance = 0;
    }

    public void showAllPaths(){
        currentMap.showAllLocationsWithDistance(currentLocation);
    }

    public Integer getDistance(){
        return distance;
    }

    public void move(String newLocation){
        if(currentMap.doesLocationExist(newLocation)){
          System.out.println("Moving to" + newLocation);
          HashMap<String,Integer> availableLocations = currentMap.getAvailableLocations(currentLocation);
          distance += availableLocations.get(newLocation);
          currentLocation = newLocation;
        }
        else{
            System.out.println("Where in the world do you think you are going?")
        }
    }

}
