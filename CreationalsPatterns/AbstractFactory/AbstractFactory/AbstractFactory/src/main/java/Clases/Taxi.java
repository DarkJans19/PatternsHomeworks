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
public class Taxi implements Vehiculo{
    private int codigo;
    @Override
    public int generarCodigo() {
        int codigoTaxi = (int) (Math.random() * 9999);
        return codigoTaxi;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setcodigo(int codigo){
        this.codigo = codigo;
    }
    @Override
    public void codigoDeVehiculo() {
        JOptionPane.showMessageDialog(null, "El codigo del vehiculo es: " + getCodigo());
    }
}
