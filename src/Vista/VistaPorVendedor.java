/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Usuario
 */
public class VistaPorVendedor extends JFrame{
    JPanel panel;
    JButton btnVolver;
    
    public VistaPorVendedor(){
        
        setTitle("Informe de Ventas para cada vendedor por periodo");
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
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        dataset.setValue(20, "Juan Carlos 20%", "Juan Carlos");
        dataset.setValue(42, "  Karla 42%", "Karla");
        dataset.setValue(8, "  Pablo 8%", "Pablo");
        dataset.setValue(12, "  Alejandro 15%", "Alejandro");
        dataset.setValue(18, "  Cristian 18%", "Cristian");
        
        // Creando el Grafico
        JFreeChart chart = ChartFactory.createBarChart3D
        ("Porcentaje","Nombre", "Porcentaje", 
        dataset, PlotOrientation.VERTICAL, true,true, false);
        chart.setBackgroundPaint(Color.cyan);
        chart.getTitle().setPaint(Color.black); 
        CategoryPlot p = chart.getCategoryPlot(); 
        p.setRangeGridlinePaint(Color.red); 
        // Mostrar Grafico
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
        new VistaPorVendedor().setVisible(true);
    }
}
