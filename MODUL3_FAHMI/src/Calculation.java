public class Calculation implements Runnable{
    private double radius, side, area
    private static double phi = 3.14

    public void setSquare(){
        luas = side * side;
    }
    public static getSquare(){
        return luas(setSquare);
    }
    public void setCircle(){
        luas = phi * radius * radius;
    }
    public static getCircle(){
        return luas(setCircle);
    }
    public void setTrapezoid(double a, double b, double t){
        luas = 0.5 * t (a+b);
    }
    public static getTrapezoid(){
        return luas(setTrapezoid);
    }

    @Override
    public void run(){
        
    }
}