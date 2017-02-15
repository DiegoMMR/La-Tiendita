/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author dieez
 */
public class Factura {
    
    public String nit;
    public String nombre;
    public Date fecha;
    public int cheque;
    public int credito;
    public int efectivo;
    
    public Factura() {
    }

    public Factura(String nit, String nombre, Date fecha, int cheque, int credito, int efectivo) {
        this.nit = nit;
        this.nombre = nombre;
        this.fecha = fecha;
        this.cheque = cheque;
        this.credito = credito;
        this.efectivo = efectivo;
    }

    public String getNit() {return nit;}
    public void setNit(String nit) {this.nit = nit;}

    public String getNombre() {return nombre;}
    public void setNombre(String nombre) {this.nombre = nombre;}

    public Date getFecha() {return fecha;}
    public void setFecha(Date fecha) {this.fecha = fecha;}

    public int getCheque() {return cheque;}
    public void setCheque(int cheque) {this.cheque = cheque;}

    public int getCredito() {return credito;}
    public void setCredito(int credito) {this.credito = credito;}

    public int getEfectivo() {return efectivo;}
    public void setEfectivo(int efectivo) {this.efectivo = efectivo;}

    
    public void nuevaFactura(ArrayList<Factura> arFactura, Factura oFactura){
        
        arFactura.add(oFactura);
        
    }
    
    
}
