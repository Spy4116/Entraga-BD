package Modelo;


import Vista.VendedorVista;
import java.util.*;

/**
 * 
 */
public class Vendedor extends Empleado {

    /**
     * Default constructor
     */
    private int Id;

    /**
     * 
     */
    private String Nombre;

    /**
     * 
     */
    private String Direccion;

    /**
     * 
     */
    private Sucursal [ ] sucursal;

    private String contraseña;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public Sucursal[] getSucursal() {
        return sucursal;
    }

    public void setSucursal(Sucursal[] sucursal) {
        this.sucursal = sucursal;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void validarContraseña() {
        System.out.println(this.contraseña);
                
            }
        }
