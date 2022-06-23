/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.ArrayList;
import java.util.List;
import modelo.Dignidad;

/**
 *
 * @author ASUS
 */
public class DignidadServicio implements IDignidadServicio{
   private static List<Dignidad> dignidadList = new ArrayList<>(); 

    @Override
    public Dignidad crear(Dignidad dignidad) {
        this.dignidadList.add(dignidad);
        return dignidad;
    }

    @Override
    public List<Dignidad> listar() {
        return this.dignidadList;
    }

    @Override
    public Dignidad modificar(int codigoDignidad, Dignidad dignidadNueva) {
        var posicion=this.buscarPosicion(this.buscarPorCodigo(codigoDignidad));
        this.listar().get(posicion).setCargo(dignidadNueva.getCargo());
        this.listar().get(posicion).setParroquia(dignidadNueva.getParroquia());
        this.listar().get(posicion).setCanton(dignidadNueva.getCanton());
        this.listar().get(posicion).setProvincia(dignidadNueva.getProvincia());
        this.listar().get(posicion).setEleccion(dignidadNueva.getEleccion());
        return dignidadNueva;
    }

    @Override
    public Dignidad eliminar(int codigoDignidad) {
        Dignidad dignidad=this.buscarPorCodigo(codigoDignidad);
        var posicion=this.buscarPosicion(dignidad);
        this.listar().remove(posicion);
        return dignidad;
    }

    @Override
    public Dignidad buscarPorCodigo(int codigoDignidad) {
        Dignidad dignidad=null;
        for(var b:this.dignidadList){
            if(codigoDignidad==b.getCodigo()){
                dignidad=b;
                break;
            }
        }
        return dignidad;
    }

    @Override
    public int buscarPosicion(Dignidad dignidad) {
        int posicion=-1;
        for(var b:this.dignidadList){
            posicion++;
            if(b.getCodigo()==dignidad.getCodigo()){
                break;
            }
        }
        return posicion;
    }

    
}
