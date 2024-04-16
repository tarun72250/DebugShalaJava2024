package day_10_inheritanceAssignment;
import java.util.Arrays;
public class ColorPoint extends Point {

    String color;
    
    static String[] colors = {"red", "blue", "green", "yellow"};

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        if (Arrays.asList(colors).contains(color)) {
            this.color = color;
        } else 
        {
            this.color = "white";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " - Color: " + color;
    }

}
