/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Fabricas;
import Interfaces.Vehiculo;
import Interfaces.VehiculoDeTransporte;
/**
 *
 * @author Estudiantes
 */
public class FabricaDeVehiculos {
    public static void crearFabricaDeVehiculo(VehiculoDeTransporte factory){
        Vehiculo objetoVehiculo = factory.crearVehiculo();
        objetoVehiculo.codigoDeVehiculo();
    }
}
