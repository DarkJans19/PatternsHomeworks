/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabricas;
import Interfaces.Vehiculo;
import Interfaces.VehiculoDeTransporte;

import javax.swing.JOptionPane;

import Clases.Bus;

public class FabricaDeBuses implements VehiculoDeTransporte{
    @Override
    public Vehiculo crearVehiculo() {
    Bus miBus = new Bus();
    miBus.setCodigo(miBus.generarCodigo());
    JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Bus  ");
    return miBus;
    }
}
