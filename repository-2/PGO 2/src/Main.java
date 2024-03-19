import java.time.DayOfWeek;
import java.util.Scanner;
import java.time.LocalDate;
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double ticket=obliczCeneBiletu();
        double discount=rabat(ticket);
        informajeZawarteNaBilecie(ticket);


    }

   public static double obliczCeneBiletu(){
        double ticket=40;

        System.out.println("Podaj swoj wiek");
        Scanner scanner=new Scanner(System.in);
        int wiek= scanner.nextInt();

        if (wiek<10){
            ticket=ticket*0;
            System.out.println("Cena biletu wynosi: "+ticket);
        }
        else if (wiek>=10&& wiek<=18){
            ticket=ticket/2;
            System.out.println("Cena biletu wynosi: "+ticket);
        }
        System.out.println("Podaj miasto,w ktorym mieszkasz");
        String nazwaMiasta=scanner.next();
        if (nazwaMiasta.equals("Warszawa")){
            ticket=ticket*0.9;
            System.out.println("Cena biletu wynosi: "+ticket);
        }
        if (jakiJestDzienTygodnia().equals("Thursday")){
            ticket=ticket*0;
            System.out.println(ticket);
        }
            return ticket;
    }

    public static String jakiJestDzienTygodnia(){
    String dayOfWeek=LocalDate.now().getDayOfWeek().name();

    return dayOfWeek;
    }

    public static double rabat(double ticket){
        double discount= ticket*2.5;
        return discount;
    }

    public static void informajeZawarteNaBilecie(double ticket) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swoj wiek");
        int wiek = scanner.nextInt();
        System.out.println("Podaj miasto, w którym mieszkasz");
        String nazwaMiasta = scanner.next();

        System.out.println("Data: " + nazwaMiasta + ", " + wiek + " years old, " + "weekday Ticket price: " + ticket + " PLN");

        double discount = ticket * 2.5;
        System.out.println("Discount: " + discount + " %");
    }



}