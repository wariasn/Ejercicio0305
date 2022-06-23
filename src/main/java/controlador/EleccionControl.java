/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.time.LocalDate;
import java.util.List;
import modelo.Eleccion;
import servicio.EleccionServicio;

/**
 *
 * @author ASUS
 */
public class EleccionControl {
    private final EleccionServicio eleccionServicio = new EleccionServicio();
    //private final DignidadServicio dignidadServicio = new DignidadServicio();
    
    public Eleccion crear(String[] args){
        var fecha = LocalDate.of(Integer.valueOf(args[2]),
                Integer.valueOf(args[3]), 
                Integer.valueOf(args[4])); 
        //var dignidad = this.dignidadServicio.buscarPorCodigo(Integer.valueOf(args[6]));
        var eleccion = new Eleccion(args[0],args[1],fecha,Integer.valueOf(args[5]),args[6],Integer.valueOf(args[7]));
        this.eleccionServicio.crear(eleccion);
        return eleccion;
    }
    
    public List<Eleccion> listar(){
        return this.eleccionServicio.listar();
    }
}
