import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenido a la calculadora para despachos");
        System.out.println("Por favor ingrese los datos del despacho: ");
        System.out.println("Ingrese el id del despacho: ");
        Scanner teclado = new Scanner(System.in);
        int id = teclado.nextInt();
        System.out.println("Ingrese la distancia del despacho: ");
        int distancia = teclado.nextInt();
        System.out.println("Ingrese el valor de compra del despacho: ");
        int valorCompra = teclado.nextInt();

        System.out.println("ID despacho: " + id);
        System.out.println("Distancia despacho: " + distancia);
        System.out.println("Valor compra despacho: $" + valorCompra);
        teclado.close();

        // Crear una instancia de la clase calculoDespacho

        calculoDespacho despacho = new calculoDespacho(id, distancia, valorCompra);
        // Calcular el valor del despacho
        double valorDespacho = despacho.calcularValorDespacho(distancia, valorCompra);
        // Mostrar el resultado
        System.out.println("El valor del despacho es: $" + valorDespacho);
        System.out.println("Gracias por usar la calculadora de despachos. Hasta luego!");

    }
}
