public class Tester {
    public static void main(String[] args) {
        Road r = new Road(31, 50, 20);
        for(int i = 0; i< 32; i++)
        r.roadUpdate();
        System.out.println(r);
        System.out.println("Average Car Revenue: " + "$"+ Car.averageRevenue());
    }
}
