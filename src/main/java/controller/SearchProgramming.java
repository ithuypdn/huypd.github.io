/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Common.Algorithm;
import Common.Library;
import model.Element;
import view.Menu;

/**
 *
 * @author huypd
 */
public class SearchProgramming extends Menu<String> {

    static String[] mc = {"Linear search", "Binary search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
        //1. Enter a possitive number
        //size_array = library.getInt("Enter number of array", 1, 100);
        //2. Create array by generate random integer in range
        //array = library.createArray(size_array);
    }

    @Override
    public void execute(int n) {
        algorithm.buddleSort(array);
        library.display(array);
        int value = library.getInt("\n Enter number to find: ", 1, 100);
        switch (n) {
            case 1:
                System.out.println("Found value: " + value + " at index: " + algorithm.linearSearch(array, value));
                break;
            case 2:
                System.out.println("Found value: " + value + " at index: " + algorithm.binarySearch(array, value));
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
}
