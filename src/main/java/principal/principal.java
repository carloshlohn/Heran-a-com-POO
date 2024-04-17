package principal;

import model.Triangulo;
import model.Circulo;

public class principal {
    public static void main(String [] args) {
        
        Triangulo triangulo = new Triangulo();
        triangulo.leitura();
        System.out.println("Area do triangulo: " + triangulo.getArea());
        
        Circulo circulo = new Circulo("Branco",3);
        System.out.println(circulo.paraString());
        System.out.println("Area do circulo: " + circulo.getArea());
    }
}
