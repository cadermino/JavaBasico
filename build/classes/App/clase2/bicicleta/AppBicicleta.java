package App.clase2.bicicleta;

public class AppBicicleta {

    public static void main(String[] args) {
        
        bicicleta bicicleta1 = new   bicicleta();
        bicicleta1.setMarca("Monark");
        bicicleta1.setModelo("123");
        
        bicicleta1.cambiarLlantas();
        System.out.println(bicicleta1.getMarca());
    }
}
