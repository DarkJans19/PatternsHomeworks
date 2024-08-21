/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;

import Interfaces.VehiculoDeTransporte;
import Interfaces.Vehiculo;
import Clases.Buseta;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiantes
 */
public class FabricaDeBusetas implements VehiculoDeTransporte{
    @Override
    public Vehiculo crearVehiculo() {
        Buseta miBuseta = new Buseta();
        miBuseta.setCodigo(miBuseta.generarCodigo());
        JOptionPane.showMessageDialog(null, "Se ha generado un nuevo objeto Buseta");
        return miBuseta;
    }
    
}
