package Clases;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Interfaces.Vehiculo;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiantes
 */
public class Buseta implements Vehiculo{
    private int codigo;
    @Override
    public int generarCodigo() {
        int codigoBuseta = (int)(Math.random() * 9999);
        return codigoBuseta;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int codigo){
                this.codigo = codigo;
    }
    @Override
    public void codigoDeVehiculo() {
        JOptionPane.showMessageDialog(null, "El codigo de la buseta es: " + getCodigo());
    }

    
}
