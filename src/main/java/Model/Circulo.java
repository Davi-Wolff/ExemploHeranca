package Model;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 *
 * @author Davi Wolff
 */
public class Circulo extends FiguraGeometrica {
    
    DecimalFormat df = new DecimalFormat("0.00");
    
    //Arredondador dos números
    
    private double raio;
    
    //Construtores (vazio, preenchido e completo com o super)

    public Circulo() {
    }

    public Circulo(String cor, double raio) {
        super (cor);
        this.raio = raio;
    }
    
    //Getters e Setters

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
    
    public void setRaio(String raio){
        this.raio = Double.parseDouble(raio);
    }
    
    //Calculo da cincunferência e área
    
    public double getCirc(){
        return (Math.PI * 2 * getRaio());
    }
    
    public double getArea(){
        return (Math.PI * Math.pow(getRaio(), 2));
    }
    
    //Impressão e leitura da altura e base
    
     public void leitura(){
        super.leitura();
        setRaio(JOptionPane.showInputDialog("Digite raio: "));
    }
    
    
    public void imprimir(){
        super.imprimir();
        JOptionPane.showMessageDialog(null,"O raio é: " + getRaio());
    }
    
    //toString do raio, cincunferência e área do círculo

    @Override
    public String toString() {
        return "Circulo: " + "\nRaio:" + df.format(getRaio()) + "\nA circunferência é: " + df.format(getCirc()) + "\nA área é: " + df.format(getArea()) + super.toString();
    }
    
    
    
}
