

public class calculoDespacho {
    //* Atributos de la clase despacho
    public int id=0;
    public int distancia=0;
    public int valorCompra=0; 

    //* Constructor de la clase despacho
    public calculoDespacho(int id, int distancia, int valorCompra) {
        this.id = id;
        this.distancia = distancia;
        this.valorCompra = valorCompra;
    }
    //* Constructor por defecto de la clase despacho
    public calculoDespacho() {
        this.id = 0;
        this.distancia = 
        this.valorCompra = 0;
    }
    
    //* Calculo de valor despacho por tramos y valor de compra */
 

public double calcularValorDespacho(int distancia, int valorCompra) {
        double valorDespacho = 0;
        if (distancia <20 && valorCompra > 50000 ) {
            valorDespacho = 0;
            System.out.println("El despacho es gratis por compras mayores a 50.000 y distancias menores a 20 km.");
        } else if (distancia < 20 && valorCompra >= 25000 && valorCompra <=50000) {
            valorDespacho = distancia*150;
        } else if (distancia < 20 && valorCompra < 25000) {
            valorDespacho = distancia*300;
        } else if (distancia > 20 && valorCompra > 50000) {
            valorDespacho = (distancia-20)*150;
        } else if (distancia > 100) {
            valorDespacho = 25000;
        }
        return valorDespacho;
    }
}


