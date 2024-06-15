public class HelloWords {
    public static void main(String[] args) {
        System.out.println("Hello JirAWS!");

        Date currentDate = new Date();

        System.out.println("Current day is -> " + currentDate.getDay());
        System.out.println("Current month is -> " + currentDate.getMonth());
        System.out.println("Current year is -> " + currentDate.getYear());
    }
}