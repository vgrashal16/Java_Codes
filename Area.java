import java.util.*;
class Area {
    public static void area(int len, int high){double area; area=len*high; System.out.println(area);}
    public static void area(float rad){double area; area=3.14*rad*rad;System.out.println(area);}
    public static void area(int side){double area; area=side*side;System.out.println(area);}
    public static void main(String[] args) {
        int l,h;
        float r;
        int a;
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Length and Height");
        l=s.nextInt();
        h=s.nextInt();
        area(l,h);
        System.out.println("Enter Radius");
        r=s.nextFloat();
        area(r);
        System.out.println("Enter side of square");
        a=s.nextInt();
        area(a);
    }
}