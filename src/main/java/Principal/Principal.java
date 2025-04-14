package Principal;

import Model.Circulo;
import Model.FiguraGeometrica;
import Model.Triangulo;

/**
 *
 * @author Davi Wolff
 */
public class Principal {
    public static void main(String[] args) {
        
        
        FiguraGeometrica fg = new FiguraGeometrica();
        Triangulo tri = new Triangulo();
        Circulo circ = new Circulo("Branco" , 3);
        
        // instanciando classes
        
        tri.leitura();
        System.out.println("Area do triangulo: " +tri.getArea());
        System.out.println();
        System.out.println(circ.toString());
        
        //Leitura da cor, base e altura do triângulo
        
        //Imprimindo a área do triangulo e as informações do círculo com as informações ja colocada na instanciação
    }
    
}
