/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

/**
 *
 * @author Usuario
 */
public class VistaPorProducto extends JFrame{
    JPanel panel;
    JButton btnVolver;
    public VistaPorProducto(){
        setTitle("Porcentaje de Ventas por Producto");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        init();
    }
 
    private void init() {
         btnVolver = new JButton("Volver");
        
        btnVolver.setBounds(0,0,0,0);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolveractionPerformed(evt);
            }
        });
        panel = new JPanel();
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("Leche Entera x6"+"  4%", 4);
        data.setValue("Huevos"+"  10%", 10);
        data.setValue("Pan"+"  7%", 7);
        data.setValue("Cereal"+"  15%", 15);
        data.setValue("Atun"+"  5%", 5);
        data.setValue("Aceite"+"  11%", 11);
        data.setValue("Cafe"+"  8%", 8);
        data.setValue("Chocolate"+"  3%", 3);
        data.setValue("Jamon"+"  7%", 7);
        data.setValue("Queso"+"  12%", 12);
        data.setValue("Salchicha"+"  8%", 8);
        data.setValue("Galleta"+"  6%", 6);
        data.setValue("Pollo"+"  4%", 4);
        
 
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createPieChart(
         "Porcentaje", 
         data, 
         true, 
         true, 
         false);
 
        // Crear el Panel del Grafico con ChartPanel
        ChartPanel chartPanel = new ChartPanel(chart);
        panel.add(chartPanel);
        panel.add(btnVolver);
    }
    
    private void btnVolveractionPerformed(java.awt.event.ActionEvent evt) {                                       
       AdministradorVista V= new AdministradorVista();
       V.setVisible(true);
       dispose();
    }  
    public static void main(String args[]){
        new VistaPorProducto().setVisible(true);
    }
}
