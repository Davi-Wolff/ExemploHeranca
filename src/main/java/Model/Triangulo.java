package Model;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi Wolff
 */
public class Triangulo extends FiguraGeometrica{
    
    DecimalFormat df = new DecimalFormat("0.00");
    
    //Arredondador dos números
    
    private double altura;
    private double base;
    
    //Construtores (vazio, preenchido e completo com o super)

    public Triangulo() {
    }

    public Triangulo(double altura, double base) {
        this.altura = altura;
        this.base = base;
    }
    
    public Triangulo(String cor, double altura, double base) {
        super(cor);
        this.altura = altura;
        this.base = base;
    }
    
    //Getters e Setters

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void setAltura(String altura){
        this.altura = Double.parseDouble(altura);
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    
    public void setBase(String base){
        this.base = Double.parseDouble(base);
    }
    
    //Calculo da área
    
    public double getArea(){
        return (getBase()+getAltura())/2;
    }
    
    
    //Impressão e leitura da altura e base
    
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null, "A altura do triangulo é: " + df.format(getAltura()) + "\nA base é: " + df.format(getBase()) + "\nA área é: " + df.format(getArea()));
    }
    
    public void leitura(){
        super.leitura();
        setBase(JOptionPane.showInputDialog("Digite base: "));
        setAltura(JOptionPane.showInputDialog("Digite altura: "));
    }
    
    //toString da altura, base e área do triângulo

    @Override
    public String toString() {
        return "Triangulo: " + "\nAltura: " + df.format(getAltura()) + "\nBase: " + df.format(getBase()) + super.toString();
    }
    
    
    
    
}
