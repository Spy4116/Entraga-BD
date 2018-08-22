/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Administrador;
import Modelo.Vendedor;
import Vista.AdministradorVista;
import Vista.VendedorVista;
import Vista.Vista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Usuario
 */
public class Controlador implements ActionListener {
    private Vista login;
    private Vendedor vendedor;
    private Administrador admin;
    private AdministradorVista vistaAdmin;
    private VendedorVista vendeVista;

    public Controlador(Vista login, Vendedor vendedor, Administrador admin, AdministradorVista vistaAdmin, VendedorVista vendeVista) {
        this.login = login;
        this.vendedor = vendedor;
        this.admin = admin;
        this.vistaAdmin = vistaAdmin;
        this.vendeVista = vendeVista;
    }
            

    
   public void iniciarLogin(){
       login.setTitle("Login");
       login.setLocationRelativeTo(null);
       
   }
   
   public void iniciarAdmin(){
       vistaAdmin.setTitle("Login");
       vistaAdmin.setLocationRelativeTo(null);
       
   }
   public void iniciarvende(){
       vendeVista.setTitle("Login");
       vendeVista.setLocationRelativeTo(null);
       
   }
   
   public void actionPerformed(ActionEvent e){
      
       
   }
}
