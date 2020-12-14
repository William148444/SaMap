package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class LocationNode {
    private String locationName;
    private ArrayList<LocationNode> attachedLocations;

    public LocationNode(String locationName){
        this.locationName = locationName;
        attachedLocations = new ArrayList<>();
    }

    public void addConnection (LocationNode newLocation){
        attachedLocations.add(newLocation);
    }

    public String getLocationName(){
        return locationName;
    }

}
