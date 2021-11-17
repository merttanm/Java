/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionApi.composition;

/**
 *
 * @author merttan
 */
public class Compose {

    //Kendisine verilen parametre ile belirtilen işlemi yapan ve işlemin sonunda belirtilen tipde değer döner
    public interface Fun<A, B> {
       
        B call(A x);
    }

    //Küçük parçalı fonksiyonları birleştirerek yeni bir fonksiyon oluşturma tekniği
    public static <A, B, C> Fun<A, C> compose(final Fun<B, C> f, final Fun<A, B> g) {

        return new Fun<A, C>() {
            public C call(A x) {
                return f.call(g.call(x));
            }
        };
    }

    public static void main(String[] args) {

        Fun<Double, Double> sin = new Fun<Double, Double>() {
            @Override     // Yukarıda ki oluşturulan Fun interface' i implement ediyoruz
            public Double call(Double x) {
                return Math.sin(x);
            }

        };

        Fun<Double, Double> cos = new Fun<Double, Double>() {
            @Override     // Yukarıda ki oluşturulan Fun interface' i implement ediyoruz
            public Double call(Double x) {
                return Math.cos(x);
            }
        };

        System.out.println(cos.call(0.55));  // 0.6 radian 34,37 degrees
        System.out.println(sin.call(1.1)); // 1.2 radian 68,75 degrees

        Fun<Double, Double> sin1 = (Double degree) -> Math.sin(degree);
        Fun<Double, Double> asin1 = (Double result) -> Math.asin(result);

        Fun<Double, Double> cosAsin1 = compose(sin, cos);
        Fun<Double, Double> sinAsin2 = compose(sin1, asin1);

        System.out.println(cosAsin1.call(0.55));
        System.out.println(sinAsin2.call(0.57));
        System.out.println(Math.floor(5));

    }
    
    
    

}
