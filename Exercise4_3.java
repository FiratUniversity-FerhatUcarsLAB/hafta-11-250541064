



public class Zoop {

    public static void main(String[] args) {
        // 1. Satırın başı
        System.out.print("No, I ");
        zoop();
        
        // 3. Satırın başı
        System.out.print("I ");
        baffle();
    }

    public static void zoop() {
        baffle(); // 1. Satırın sonunu getirir
        
        // 2. Satırın başı
        System.out.print("You wugga ");
        baffle(); // 2. Satırın sonunu getirir
    }

    public static void baffle() {
        System.out.print("wug");
        ping(); // Noktayı koyar ve satırı bitirir
    }

    public static void ping() {
        System.out.println("."); // DİKKAT: println kullanıldığı için alt satıra geçer
    }
}
