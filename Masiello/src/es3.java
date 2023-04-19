import java.util.Scanner;

public class es3
{
    public static void main(String[] args)
    {
        double a = 0, b = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ciao, Inserisci il valore della base");
        a = sc.nextDouble();

        System.out.println("Ora inserisci il valore dell'altezza");
        b = sc.nextDouble();

        Rettangolo R1 = new Rettangolo(a,b);

        double Perimetro = R1.Perimetro();
        double Area = R1.Area();

        System.out.println("Il Perimetro del rettangolo è: " +R1.Perimetro());
        System.out.println("L'area del rettangolo è: "+R1.Area());
    }
}
