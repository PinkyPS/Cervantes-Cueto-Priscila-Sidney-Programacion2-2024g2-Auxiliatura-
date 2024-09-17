package points;

import points.Vector2D;

public class main {
    public static void main(String[] args) {
     
        Vector2D v1 = new Vector2D(3, 4);
        Vector2D v2 = new Vector2D(1, 2);

        // Resta 
        Vector2D resultSubtract = v1.subtract(v2);
        System.out.print("v1 - v2 = ");
        resultSubtract.print();

        // Multiplicación 
        Integer scalar = 5;
        Vector2D resultMultiply = v1.multiply(scalar);
        System.out.print(scalar + " * v1 = ");
        resultMultiply.print();
    }
}
