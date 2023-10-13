package org.example;

public class RectangleCalculator {

    public int area(int side1, int side2){
        return  (side1 * side2);
    }

    public int perimeter(int side1, int side2){
        return  ((side1 * 2) + (side2 * 2));
    }

    public boolean isTriangle(int a, int b, int c){
        if ((a < b + c) && (b < a + c) && (c < b + a)){
            return true;
        } else{
            return false;
        }
    }
}
