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
public class ComposeFun {

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
        // Yukarıda ki oluşturulan Fun interface i implement ediyoruz
        Fun<Double, Double> sin = new Fun<Double, Double>() {
            @Override
            public Double call(Double x) {
                return Math.sin(x);
            }

        };

        Fun<Double, Double> cos = new Fun<Double, Double>() {
            @Override
            public Double call(Double x) {
                return Math.cos(x);
            }
        };

    }

}
