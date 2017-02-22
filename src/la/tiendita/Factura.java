/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package la.tiendita;

/**
 *
 * @author inmer
 */
public class Factura {
    
    private String nombreProducto;
    private int cantidad;
    private float precioIndividual;
    private String nombreCliente;
    private String nit;
    private float totalVenta;

    public Factura(String nombreProducto, int cantidad, float precioIndividual, 
            String nombreCliente, String nit, float totalVenta) {
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.precioIndividual = precioIndividual;
        this.nombreCliente = nombreCliente;
        this.nit = nit;
        this.totalVenta = totalVenta;
    }

    
    /**
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    /**
     * @return the cantidad
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the precioIndividual
     */
    public float getPrecioIndividual() {
        return precioIndividual;
    }

    /**
     * @param precioIndividual the precioIndividual to set
     */
    public void setPrecioIndividual(int precioIndividual) {
        this.precioIndividual = precioIndividual;
    }

    /**
     * @return the nombreCliente
     */
    public String getNombreCliente() {
        return nombreCliente;
    }

    /**
     * @param nombreCliente the nombreCliente to set
     */
    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    /**
     * @return the nit
     */
    public String getNit() {
        return nit;
    }

    /**
     * @param nit the nit to set
     */
    public void setNit(String nit) {
        this.nit = nit;
    }

    /**
     * @return the totalVenta
     */
    public float getTotalVenta() {
        return totalVenta;
    }

    /**
     * @param totalVenta the totalVenta to set
     */
    public void setTotalVenta(int totalVenta) {
        this.totalVenta = totalVenta;
    }

}
