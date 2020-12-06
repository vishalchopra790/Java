package lambdaDemos;

@FunctionalInterface
interface Cab {
    public String Book(String source, String Destination);
}
// class OLA implements Cab{
//
//     @Override
//     public void Book() {
//         System.out.println("Cab Booked");
//     }
// }

public class Test {
    public static void main(String[] args) {
        Cab cab = (source, destination) -> {
            System.out.println("Cab Hired" + source + destination);
            return ("Price :5000");
        };
        System.out.println(cab.Book("Hyde", "Bang"));
    }
}
