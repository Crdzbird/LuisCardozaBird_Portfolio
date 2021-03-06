package Pojos;
// Generated Sep 19, 2015 12:30:29 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Paciente generated by hbm2java
 */
public class Paciente  implements java.io.Serializable {


     private Integer idPaciente;
     private Pais pais;
     private Usuario usuario;
     private String cedula;
     private String primerNombre;
     private String segundoNombre;
     private String primerApellido;
     private String segundoApellido;
     private String convencional;
     private String celular;
     private int edad;
     private String direccion;
     private Boolean menorEdad;
     private boolean estado;
     private Set expedientePacientes = new HashSet(0);
     private Set citas = new HashSet(0);

    public Paciente() {
    }

	
    public Paciente(Pais pais, Usuario usuario, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String convencional, String celular, int edad, String direccion, boolean estado) {
        this.pais = pais;
        this.usuario = usuario;
        this.primerNombre = primerNombre;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.convencional = convencional;
        this.celular = celular;
        this.edad = edad;
        this.direccion = direccion;
        this.estado = estado;
    }
    public Paciente(Pais pais, Usuario usuario, String cedula, String primerNombre, String segundoNombre, String primerApellido, String segundoApellido, String convencional, String celular, int edad, String direccion, Boolean menorEdad, boolean estado, Set expedientePacientes, Set citas) {
       this.pais = pais;
       this.usuario = usuario;
       this.cedula = cedula;
       this.primerNombre = primerNombre;
       this.segundoNombre = segundoNombre;
       this.primerApellido = primerApellido;
       this.segundoApellido = segundoApellido;
       this.convencional = convencional;
       this.celular = celular;
       this.edad = edad;
       this.direccion = direccion;
       this.menorEdad = menorEdad;
       this.estado = estado;
       this.expedientePacientes = expedientePacientes;
       this.citas = citas;
    }
   
    public Integer getIdPaciente() {
        return this.idPaciente;
    }
    
    public void setIdPaciente(Integer idPaciente) {
        this.idPaciente = idPaciente;
    }
    public Pais getPais() {
        return this.pais;
    }
    
    public void setPais(Pais pais) {
        this.pais = pais;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public String getCedula() {
        return this.cedula;
    }
    
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public String getPrimerNombre() {
        return this.primerNombre;
    }
    
    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }
    public String getSegundoNombre() {
        return this.segundoNombre;
    }
    
    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }
    public String getPrimerApellido() {
        return this.primerApellido;
    }
    
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }
    public String getSegundoApellido() {
        return this.segundoApellido;
    }
    
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }
    public String getConvencional() {
        return this.convencional;
    }
    
    public void setConvencional(String convencional) {
        this.convencional = convencional;
    }
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    public int getEdad() {
        return this.edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Boolean getMenorEdad() {
        return this.menorEdad;
    }
    
    public void setMenorEdad(Boolean menorEdad) {
        this.menorEdad = menorEdad;
    }
    public boolean isEstado() {
        return this.estado;
    }
    
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public Set getExpedientePacientes() {
        return this.expedientePacientes;
    }
    
    public void setExpedientePacientes(Set expedientePacientes) {
        this.expedientePacientes = expedientePacientes;
    }
    public Set getCitas() {
        return this.citas;
    }
    
    public void setCitas(Set citas) {
        this.citas = citas;
    }




}


