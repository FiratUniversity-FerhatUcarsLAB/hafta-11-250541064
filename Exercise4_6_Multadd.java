



public class Exercise4_6_Multadd {

    /**
     * Amaç: a * b + c işlemini yapan genel bir metot.
     * Bu metot "multadd" (multiply-add) operasyonu olarak bilinir.
     */
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    /**
     * Amaç: x * e^(-x) + sqrt(1 - e^(-x)) işlemini hesaplamak.
     * Bu işlemi yaparken matematiksel operatörler yerine 
     * yukarıdaki multadd metodunu kullanırız.
     */
    public static double expSum(double x) {
        double eNegX = Math.exp(-x);           // e üzeri -x
        double sqrtPart = Math.sqrt(1.0 - eNegX); // Karekök kısmı
        
        // Formülümüz: (x * e^-x) + sqrtPart
        // multadd formatı: a * b + c
        // a = x, b = eNegX, c = sqrtPart
        return multadd(x, eNegX, sqrtPart);
    }

    public static void main(String[] args) {
        // Test 1: Basit Test (1 * 2 + 3)
        System.out.println("multadd(1, 2, 3) -> " + multadd(1.0, 2.0, 3.0));

        // Test 2: Trigonometrik Test
        // sin(pi/4) + (cos(pi/4) / 2) hesaplaması
        // a = 0.5, b = cos(pi/4), c = sin(pi/4) 
        // Sonuç: 0.5 * cos + sin
        double sinCosResult = multadd(0.5, Math.cos(Math.PI / 4), Math.sin(Math.PI / 4));
        System.out.println("sin(pi/4) + cos(pi/4)/2 = " + sinCosResult);
        
        // Test 3: Logaritma Testi
        // log(10) + log(20)
        // a = 1.0, b = log(10), c = log(20)
        double logResult = multadd(1.0, Math.log(10), Math.log(20));
        System.out.println("log(10) + log(20) = " + logResult);

        // Test 4: expSum Testi
        double x = 2.0;
        System.out.println("expSum(" + x + ") = " + expSum(x));
    }
}
