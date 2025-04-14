package Model;

import javax.swing.JOptionPane;

/**
 *
 * @author Davi Wolff
 */
public class FiguraGeometrica {
    
    private String cor;
    
    
    //Construtores

    public FiguraGeometrica() {
    }

    public FiguraGeometrica(String cor) {
        this.cor = cor;
    }
    
    //Getters e Setters

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
    //Leitura e impressão da COR
    
    public void leitura(){
        setCor(JOptionPane.showInputDialog("Digite a cor:"));
    }
    
    public void imprimir(){
        JOptionPane.showMessageDialog(null,"A cor é: " + getCor());
    }
    
    //toString pra COR

    @Override
    public String toString() {
        return  "\nCor: " + getCor();
    }
    
    
    
}
