/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import Interfaces.Vehiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author Estudiantes
 */
public class Bus implements Vehiculo{
    private int codigo;
    @Override
    public int generarCodigo(){
        int codigoBus = (int) (Math.random() * 9999);
        return codigoBus;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    public void codigoDeVehiculo(){
        JOptionPane.showMessageDialog(null, "El codigo del bus es: " + getCodigo());
    }
}
