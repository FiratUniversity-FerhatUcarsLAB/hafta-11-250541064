//ad-soyad: muhammet eren alptekin
//no: 250541064
//Şube: B

public class Exercise4_5 {

    // Programın başladığı nokta
    public static void main(String[] args) {
        int bizz = 5;
        int buzz = 2;
        
        // 1. Adım: bizz 5 olduğu için bu çağrı if bloğuna girecek
        zoop("just for", bizz);
        
        // 4. Adım: buzz 2, yani 2*2 = 4 gönderiliyor
        clink(2 * buzz);
    }

    public static void zoop(String fred, int bob) {
        // 2. Adım & 6. Adım:
        // İlk çağrıda "just for" yazar ve satırı bitirir.
        // İkinci çağrıda (clink içinden) "breakfast " yazar ve 
        // önceki "It's " ile birleşen satırı burada bitirir.
        System.out.println(fred);
        
        if (bob == 5) {
            // 3. Adım: bob 5 ise burası çalışır
            ping("not ");
        } else {
            // 7. Adım: bob 4 ise (clink'ten gelen) burası çalışır
            System.out.println("!");
        }
    }

    public static void clink(int fork) {
        // 5. Adım: Burası "print" olduğu için imleç aynı satırda bekler
        System.out.print("It's ");
        
        // fork değeri 4 olarak zoop'a gönderilir
        zoop("breakfast ", fork);
    }

    public static void ping(String strangStrung) {
        // String birleştirme ve yazdırma
        System.out.println("any " + strangStrung + "more ");
    }
}


//just for
//any not more 
//It's breakfast 
//!
