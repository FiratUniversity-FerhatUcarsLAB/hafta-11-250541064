//ad-soyad: muhammet eren alptekin
//no: 250541064
//Şube: B

public class Zippo {

    public static void main(String[] args) {
        // Akış buradan başlar
        zippo("rattle", 13);
    }

    public static void baffle(String blimp) {
        // 5. Adım: blimp değeri "rattle" olur
        System.out.println(blimp); // Çıktı: rattle
        
        // 6. Adım: zippo tekrar çağrılır
        zippo("ping", -5);
    }

    public static void zippo(String quince, int flag) {
        // 2. Adım: flag 13 (else bloğu)
        // 7. Adım: flag -5 (if bloğu)
        
        if (flag < 0) {
            // 8. Adım: flag -5 olduğu için burası çalışır
            System.out.println(quince + "zoop"); // Çıktı: pingzoop
        } else {
            // 3. Adım: flag 13 olduğu için burası çalışır
            System.out.println("ik"); // Çıktı: ik
            
            // 4. Adım: baffle çağrılır
            baffle(quince); 
            
            // 10. Adım: baffle ve içindeki zippo bittikten sonra buraya dönülür
            System.out.println("boo-wa-ha-ha"); // Çıktı: boo-wa-ha-ha
        }
    }
}
