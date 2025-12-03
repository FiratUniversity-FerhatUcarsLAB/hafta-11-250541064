//ad-soyad: muhammet eren alptekin
//no: 250541064
//Şube: B

public class Exercise4_4 {

    public static int getNumber() {
        return 42;
    }

    public static void sayHello() {
        System.out.println("hello");
    }

    public static void main(String[] args) {

        // 1) Donus degerini kullanmayin -> ne oluyor?
        getNumber();
        // Cevap: Java hata vermez. [cite_start]Metot çalışır, yan etkileri (varsa ekrana yazdırma vb.) gerçekleşir, ancak dönen değer hafızadan silinir (discarded). [cite: 246]

        // 2) void metodu ifade icinde kullanin -> ne oluyor?
        // System.out.println(sayHello() + 7);
        // Cevap: Derleyici hata (compile-time error) verir. [cite_start]Çünkü void metotlar bir değer üretmez, bu yüzden matematiksel işleme giremezler veya bir değişkene atanamazlar. [cite: 248]

    }
}
