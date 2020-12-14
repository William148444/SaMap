package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	MyMap saintAndrews = new MyMap("Saint Andrews");
	saintAndrews.loadPreset1();
	Person me = new Person("Me", saintAndrews,"School");

	while(true){
	    me.showAllPaths();
	    System.out.println("Where would you like to go?");
	    Scanner userInput = new Scanner(System.in);
	    Scanner userResponse = userInput.nextLine();
	    me.move(userResponse);
    }
    }
}
