/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package servicio;

import java.util.List;
import modelo.Eleccion;

/**
 *
 * @author ASUS
 */
public interface IEleccionServicio {
    public Eleccion crear(Eleccion eleccion);
    public Eleccion buscarPorCodigo(int codigoEleccion);
    public List<Eleccion> listar();
}
