/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package findingpath;
import java.nio.file.*;
/**
 *
 * @author ST10437711
 */
public class FindingPath {

    public static void main(String[] args) {
        //This will take the file address and import it to the project.
        Path myPath = Paths.get("C:\\Users\\RC_Student_lab\\Documents\\NetBeansProjects");
        int count = myPath.getNameCount();
        
        //This will display the path.
        System.out.println("Path is " + myPath.toString());
        
        //This will show the file name.
        System.out.println("File name is " + myPath.getFileName());
        
        //This will tell the user the amount of elements there are within the path(User, RC Student, Docs, and NetBeans).
        System.out.println("There are " + count + " elements in the file path");
        
        //This will display what number the element is. 
        for (int x = 0; x < count; ++x){
            System.out.println("Element " + x + " is " + myPath.getName(x));
        }
    }
}