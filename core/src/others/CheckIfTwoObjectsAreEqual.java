package others;

/**
 Demo program to show how to check if two objects are equal.

 Sources Used ->
 Youtube Video - https://www.youtube.com/watch?v=X2AjBFZfFCY

 @author Rajan Baliwal
 @username - rbaliwal00
 @version - 2021-08-25

 */


public class CheckIfTwoObjectsAreEqual {

    public static void main(String args[]){
        System.out.println(2 == 2);

        Employee e1 = new Employee("Sachin", 45, 50000);
        Employee e2 = new Employee("Sachin", 45, 50000);
        Employee e3 = new Employee("Utkarsh", 50, 100000);

        System.out.println(e1.equals(e2));
    }
}
