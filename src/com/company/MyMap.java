package com.company;

import java.util.*;


public class MyMap {
    private String mapName;
    private ArrayList<LocationNode> locationMasterList;
    private HashMap<String,Integer> locationDistanceMasterList;

    //

    public MyMap(String namName){
        this.mapName = mapName;
        locationMasterList = new ArrayList<>();
        locationDistanceMasterList = new HashMap<>();
    }
    public void addNewLocation(String newLocationName){
        LocationNode newLocation = new LocationNode(newLocationName);
        locationDistanceMasterList.add(newLocation);
    }

    public void addNewLocationConnection (String location1, String location2, Integer distance) {
        ArrayList<String> locationList = new ArrayList<>();
        locationList.add(location1);
        locationList.add(location2);
        Collections.sort(locationList);
        String sortedLocationPair = locationList.get(0) + ":" + locationList.get(1);
        if(locationDistanceMasterList.containsKey(sortedLocationPair)){
            System.out.println("Location pair already exsist! Checking for new distance"); }
            if(locationDistanceMasterList.get(sortedLocationPair) != distance) {
                System.out.println("New distance provided. Updating Value");
                locationDistanceMasterList.replace(sortedLocationPair, distance);
            }
            else {
                System.out.println("It's the same distance dumb dumb");
            }
            else{
            System.out.println("New distance pair added!");
            locationDistanceMasterList.put(sortedLocationPair,distance);
        }
            }

            public HashMap<String,Integer> getAvailableLocations (String locationToCheck) {
        HashMap<String,Integer> destinations = new HashMap<>();
        Iterator hmIterator = locationDistanceMasterList.entrySet().iterator();
        while(hmIterator.hasNext()){
            Map.Entry mapElement = (Map.Entry) hmIterator.next();
            String[] twoLocations = ((String) mapElement.getKey()).split(":");
                    String firstLocation = twoLocations[0];
                    String secondLocation = twoLocations[1];
                    if(firstLocation.equals(locationToCheck))
                        destinations.put(secondLocation,(Integer) mapElement.getValue());
              else if(secondLocation.equals(locationToCheck))
                destinations.put(firstLocation,(Integer) mapElement.getValue());
        }
        return destinations;

        }

        public void showAllLocationsWithDistance(String locationToCheck){
             System.out.println(getAvailableLocations(locationToCheck));
        }



      public void loadPreset1(){
        addNewLocation("Gate");
        addNewLocation("Cohen");
        addNewLocation("Rooks");
        addNewLocation("Gym");
        addNewLocation("Track");
        addNewLocation("Chapel");
        addNewLocation("Tiki Chapel");
        addNewLocation("Mariani");

          addNewLocationConnection("Gate","Cohen", 4);
          addNewLocationConnection("Gate","Gym", 5);
          addNewLocationConnection("Cohen","Rooks", 3);
          addNewLocationConnection("Cohen","Mariani", 2);
          addNewLocationConnection("Cohen","Gym", 4);
          addNewLocationConnection("Gym","Mariani", 5);
          addNewLocationConnection("Gym","Track", 3);
          addNewLocationConnection("Rooks","Mariani", 4);
          addNewLocationConnection("Rooks","Tiki Chapel", 2);
          addNewLocationConnection("Tiki Chapel","Chapel", 6);
          addNewLocationConnection("Tiki Chapel","Mariani", 3);
          addNewLocationConnection("Mariani","Chapel", 5);
          addNewLocationConnection("Mariani","Track", 4);
          addNewLocationConnection("Track","Chapel", 6);
      }

    public boolean doesLocationExist(String locationToCheck){
        for(int i = 0; i < locationDistanceMasterList.size(); i++){
            if(locationMasterList.get(i).getLocationName().equals(locationToCheck))
                return true;
        }
        return false;
    }



    /*

    PriorityQueue<?> locationOrder = new PriorityQueue<?>(); \\ this is to keep the order of the weighted
    paths while searching through


    Stack<?> shortestPath = new Stack<?>(); // this is to keep the shortest path through the map



 dijkstra( "SaMap (my map)", "starting point")
     G-> graph;
     S->starting vertex

    for each path X takes (X would be the Peron) in SaMap         //In the video the guy made all the paths infinite do I have to do that?
        path[X] <- infinite
        previous[V] <- NULL
        If (starting point) != (ending point), add (the current place) to Priority Queue locationOrder
        Also add all possible paths from the current location (person)
        Compare distances
        Check to make sure we haven't gone the same path twice
        (Im a little confused on whats next)
        From current location, what ever the min value path is removed from locationOrder and added to stack
         ** locationOrder.remove().node;
         currentLocation.add().node to the stack (shortestPath) **



     */










        }



