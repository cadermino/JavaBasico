package App.clase2.aritmetica;

public class AppAritmetica {

    public static void main(String[] args) {
        OperacoinesAritmeticas o = new OperacoinesAritmeticas();
        
        double suma = o.sumar(10d, 20d);
        System.out.println(suma);
        
        int mayor = o.getMax(10, 12);
        System.out.println(mayor);
        
        float mayor2 = o.getMax(10f, 50f);
        System.out.println(mayor2);
    }
}
