/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;
import Clases.Taxi;
import Interfaces.Vehiculo;
import Interfaces.VehiculoDeTransporte;
import javax.swing.JOptionPane;
/**
 *
 * @author Estudiantes
 */
public class FabricaDeTaxis implements VehiculoDeTransporte{
    @Override
    public Vehiculo crearVehiculo() {
     Taxi miTaxi=new Taxi();
     miTaxi.setcodigo(miTaxi.generarCodigo());
     JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Taxi");
     return miTaxi;
    }
}
