/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Eleccion;

/**
 *
 * @author ASUS
 */
public class EleccionServicio implements IEleccionServicio{
    
    private static List<Eleccion> eleccionList = new ArrayList<>();

    @Override
    public Eleccion crear(Eleccion eleccion) {
        this.eleccionList.add(eleccion);
        return eleccion;
    }

    @Override
    public List<Eleccion> listar() {
        return this.eleccionList;
    }

    @Override
    public Eleccion buscarPorCodigo(int codigoEleccion) {
        Eleccion eleccion=null;
        for(var c:this.eleccionList){
            if(codigoEleccion==c.getCodigo()){
                eleccion=c;
                break;
            }
        }
        return eleccion;
    }
    
}
