/**
 * @author Junaid Bhatti and Cole Mallinger
 * @version 02/09/23
 * This program runs the program 32 times with 31 stations, 50 passengers, and 20 cars
 */
public class Tester {
    public static void main(String[] args) {
        System.out.println("Scenario One!");
        Road r = new Road(31, 50, 20);
        for(int i = 0; i< 32; i++)
        r.roadUpdate();
        System.out.println(r);
        System.out.println("Average Car Revenue: " + "$"+ Car.averageRevenue());
        System.out.println();
        System.out.println();
        System.out.println("Scenario 2!");
        Road b = new Road(31, 30, 10);
        for(int i = 0; i< 32; i++)
        b.roadUpdate();
        System.out.println(b);
        System.out.println("Average Car Revenue: " + "$"+ Car.averageRevenue());
    }
}