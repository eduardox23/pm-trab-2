/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package camadaDados;

import javax.swing.ImageIcon;

/**
 *
 * @author rsvc
 */
public class Veiculo {
    
    private int chassi; 
    private String modelo; 
    private int capacidade; 
    private int velocidade; 
    private int autonomia;
    private String tipo;
    private ImageIcon imagem;
    
    public Veiculo(int chassi, String modelo, int capacidade, int velocidade, int autonomia, String tipo) {
        this.chassi = chassi;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.velocidade = velocidade;
        this.autonomia = autonomia;
        this.tipo = tipo;
        this.imagem = null;        
    }
    
    public Veiculo(int chassi, String modelo, int capacidade, int velocidade, int autonomia, String tipo, ImageIcon imagem) {
        this.chassi = chassi;
        this.modelo = modelo;
        this.capacidade = capacidade;
        this.velocidade = velocidade;
        this.autonomia = autonomia;
        this.tipo = tipo;
        this.imagem = imagem;        
    }

    public ImageIcon getImagem() {
        return imagem;
    }

    public void setImagem(ImageIcon imagem) {
        this.imagem = imagem;
    }

    public int getAutonomia() {
        return autonomia;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public int getChassi() {
        return chassi;
    }

    public String getModelo() {
        return modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setAutonomia(int autonomia) {
        this.autonomia = autonomia;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
    
    
}
