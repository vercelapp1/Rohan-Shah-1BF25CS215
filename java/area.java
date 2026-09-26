class Area {

   
    void calculateArea(int side) {
        System.out.println("Area of Square = " + (side * side));
    }

  
    void calculateArea(int length, int breadth) {
        System.out.println("Area of Rectangle = " + (length * breadth));
    }

    
    void calculateArea(double radius) {
        System.out.println("Area of Circle = " + (3.14 * radius * radius));
    }
}

public class Main {
    public static void main(String[] args) {

        Area obj = new Area();

        obj.calculateArea(5);          
        obj.calculateArea(10, 5);      
        obj.calculateArea(7.0);        
    }
}
