/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;


import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import modelo.Candidato;
import modelo.Dignidad;
import servicio.CandidatoServicio;
import servicio.DignidadServicio;

/**
 *
 * @author ASUS
 */
public class CandidatoControl {
    
    private final CandidatoServicio candidatoServicio = new CandidatoServicio();
    private final DignidadServicio dignidadServicio = new DignidadServicio();
    
    public Candidato crear(String[] args){
        var fechaNacimiento = LocalDate.of(Integer.valueOf(args[2]),
                Integer.valueOf(args[3]), 
                Integer.valueOf(args[4])); 
        Dignidad dignidad = this.dignidadServicio.buscarPorCodigo(Integer.valueOf(args[7]));
        Candidato candidato = new Candidato(args[0],Integer.valueOf(args[1]),
                     fechaNacimiento,args[5],Integer.valueOf(args[6]),dignidad);
        this.candidatoServicio.crear(candidato);
        return candidato;
    }
    
    public Candidato buscarCandidato(String arg){
        return this.candidatoServicio.buscarPorCodigo(Integer.valueOf(arg));
    }
    
    public Candidato eliminar(String arg)
    {
        return this.candidatoServicio.eliminar(Integer.valueOf(arg));
    }
    
    public Candidato modificar(String [] args){
        var fechaNacimiento = LocalDate.of(Integer.valueOf(args[2]),
                Integer.valueOf(args[3]), 
                Integer.valueOf(args[4])); 
        Dignidad dignidad = this.dignidadServicio.buscarPorCodigo(Integer.valueOf(args[7]));
        Candidato candidatoNuevo = new Candidato(args[0],Integer.valueOf(args[1]),
                     fechaNacimiento,args[5],Integer.valueOf(args[6]),dignidad);
        this.candidatoServicio.modificar(Integer.valueOf(args[6]), candidatoNuevo);
        return candidatoNuevo;
    }
    
    public List<Candidato> listar(){
        return this.candidatoServicio.listar();
    }
}
