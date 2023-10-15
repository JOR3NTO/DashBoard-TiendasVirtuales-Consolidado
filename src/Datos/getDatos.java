/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Datos;

/**
 *
 * @author eduar
 */
public class getDatos {
    
    int dia, mes, año, identificadorOrden;
    String ciudad, estado, ramaEntidad, ordenEntidad, entidadObligada, postConflicto, sectorEntidad;
    double totalVentas,nitEntidad,nitProveedor,actividadEconomicaProveedor;
    

    //super constructor
    public getDatos(int mes, int dia, int año, String ciudad, int identificadorOrden, String ramaEntidad, String sectorEntidad,
     String ordenEntidad, double nitEntidad, String estado, double totalVentas, String entidadObligada, String postConflicto,
     double nitProveedor, double actividadEconomicaProveedor) {

        this.dia = dia;
        this.mes = mes;
        this.año = año;
        this.ciudad = ciudad;
        this.identificadorOrden = identificadorOrden;
        this.ramaEntidad = ramaEntidad;
        this.sectorEntidad = sectorEntidad;
        this.ordenEntidad = ordenEntidad;
        this.nitEntidad = nitEntidad;
        this.estado = estado;
        this.totalVentas = totalVentas;
        this.entidadObligada = entidadObligada;
        this.postConflicto = postConflicto;
        this.nitProveedor = nitProveedor;
        this.actividadEconomicaProveedor = actividadEconomicaProveedor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getNitEntidad() {
        return nitEntidad;
    }

    public void setNitEntidad(int nitEntidad) {
        this.nitEntidad = nitEntidad;
    }

    public int getIdentificadorOrden() {
        return identificadorOrden;
    }

    public void setIdentificadorOrden(int identificadorOrden) {
        this.identificadorOrden = identificadorOrden;
    }

    public double getActividadEconomicaProveedor() {
        return actividadEconomicaProveedor;
    }

    public void setActividadEconomicaProveedor(int actividadEconomicaProveedor) {
        this.actividadEconomicaProveedor = actividadEconomicaProveedor;
    }

    public double getNitProveedor() {
        return nitProveedor;
    }

    public void setNitProveedor(int nitProveedor) {
        this.nitProveedor = nitProveedor;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getRamaEntidad() {
        return ramaEntidad;
    }

    public void setRamaEntidad(String ramaEntidad) {
        this.ramaEntidad = ramaEntidad;
    }

    public String getOrdenEntidad() {
        return ordenEntidad;
    }

    public void setOrdenEntidad(String ordenEntidad) {
        this.ordenEntidad = ordenEntidad;
    }

    public String getEntidadObligada() {
        return entidadObligada;
    }

    public void setEntidadObligada(String entidadObligada) {
        this.entidadObligada = entidadObligada;
    }

    public String getPostConflicto() {
        return postConflicto;
    }

    public void setPostConflicto(String postConflicto) {
        this.postConflicto = postConflicto;
    }

    public String getSectorEntidad() {
        return sectorEntidad;
    }

    public void setSectorEntidad(String sectorEntidad) {
        this.sectorEntidad = sectorEntidad;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    @Override
    public String toString() {
        return "ExtraerDatos [dia=" + dia + ", mes=" + mes + ", año=" + año + ", nitEntidad=" + nitEntidad
                + ", identificadorOrden=" + identificadorOrden + ", actividadEconomicaProveedor="
                + actividadEconomicaProveedor + ", nitProveedor=" + nitProveedor + ", ciudad=" + ciudad + ", estado="
                + estado + ", ramaEntidad=" + ramaEntidad + ", ordenEntidad=" + ordenEntidad + ", entidadObligada="
                + entidadObligada + ", postConflicto=" + postConflicto + ", sectorEntidad=" + sectorEntidad
                + ", totalVentas=" + totalVentas + "]";
    }
    
}
