import java.util.Scanner;

public class Rettangolo
{
    Scanner sc = new Scanner(System.in);
    public double b, h;
    public Rettangolo(double b, double h) {this.b = b; this.h = h;}
    double Perimetro() { return (2 * (b + h)); }
    double Area() { return (b * h); }

}
