/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Main;

import Common.Library;
import controller.SearchProgramming;
import model.Element;

/**
 *
 * @author huypd
 */
public class Project2 {

    public static void main(String[] args) {
        Library library = new Library();
        Element element = new Element();
        //1. Enter a possitive number
        element.setSize_array(library.getInt("Enter number of array", 1, 100));
        //2. Create array by generate random integer in range
        element.setArray(library.createArray(element.size_array));
        new SearchProgramming(element).run();
    }
}
