package Pojos;
// Generated Sep 19, 2015 12:30:29 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * HrsExtras generated by hbm2java
 */
public class HrsExtras  implements java.io.Serializable {


     private Integer idHrsExtras;
     private Cajero cajero;
     private EmpleadoLaboratorio empleadoLaboratorio;
     private Medico medico;
     private int hrsExtras;
     private Date fecha;
     private String estadoHrs;

    public HrsExtras() {
    }

    public HrsExtras(Cajero cajero, EmpleadoLaboratorio empleadoLaboratorio, Medico medico, int hrsExtras, Date fecha, String estadoHrs) {
       this.cajero = cajero;
       this.empleadoLaboratorio = empleadoLaboratorio;
       this.medico = medico;
       this.hrsExtras = hrsExtras;
       this.fecha = fecha;
       this.estadoHrs = estadoHrs;
    }
   
    public Integer getIdHrsExtras() {
        return this.idHrsExtras;
    }
    
    public void setIdHrsExtras(Integer idHrsExtras) {
        this.idHrsExtras = idHrsExtras;
    }
    public Cajero getCajero() {
        return this.cajero;
    }
    
    public void setCajero(Cajero cajero) {
        this.cajero = cajero;
    }
    public EmpleadoLaboratorio getEmpleadoLaboratorio() {
        return this.empleadoLaboratorio;
    }
    
    public void setEmpleadoLaboratorio(EmpleadoLaboratorio empleadoLaboratorio) {
        this.empleadoLaboratorio = empleadoLaboratorio;
    }
    public Medico getMedico() {
        return this.medico;
    }
    
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public int getHrsExtras() {
        return this.hrsExtras;
    }
    
    public void setHrsExtras(int hrsExtras) {
        this.hrsExtras = hrsExtras;
    }
    public Date getFecha() {
        return this.fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String getEstadoHrs() {
        return this.estadoHrs;
    }
    
    public void setEstadoHrs(String estadoHrs) {
        this.estadoHrs = estadoHrs;
    }




}


