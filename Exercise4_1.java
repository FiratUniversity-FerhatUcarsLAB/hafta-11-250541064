//ad-soyad: muhammet eren alptekin
//no: 250541064
//Şube: B

public class DatePrinter {

    public static void main(String[] args) {
        String day = "Monday";
        String month = "July";
        int date = 22;
        int year = 2019;

        System.out.println("Amerikan Formatı:");
        printAmerican(day, date, month, year);

        System.out.println("Avrupa Formatı:");
        printEuropean(day, date, month, year);
    }

    // Amerikan Formatı: "Monday, July 22, 2019"
    public static void printAmerican(String day, int date, String month, int year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    // Avrupa Formatı: "22 July 2019, Monday"
    public static void printEuropean(String day, int date, String month, int year) {
        System.out.println(date + " " + month + " " + year + ", " + day);
    }
}
