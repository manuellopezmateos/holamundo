/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo;

/**
 *
 * @author fp
 */
public class Coche {

    private int numero;
    private String matricula;
    private String modelo;
    private String conductor;

    public Coche(int numero, String matricula, String modelo, String conductor) {
        this.numero = numero;
        this.matricula = matricula;
        this.modelo = modelo;
        this.conductor = conductor;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getConductor() {
        return modelo;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }
}
