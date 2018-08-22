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
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Usuario
 */
public class VistaEvolucionVentas extends JFrame{
    JPanel panel;
    JButton btnVolver;
    public VistaEvolucionVentas(){
        setTitle("Gráfico de Evolución de ventas por mes");
        setSize(800,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        init();
    }
    
 
    private void init() {
        panel = new JPanel();
        btnVolver = new JButton("Volver");
        
        btnVolver.setBounds(0,0,0,0);
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolveractionPerformed(evt);
            }
        });
        getContentPane().add(panel);
        // Fuente de Datos
        DefaultCategoryDataset line_chart_dataset = new DefaultCategoryDataset();
        line_chart_dataset.addValue(800, "Ventas", "Marzo");   
        line_chart_dataset.addValue(650, "Ventas", "Abril");
        line_chart_dataset.addValue(900, "Ventas", "Mayo");
        line_chart_dataset.addValue(1300, "Ventas", "Junio");
        line_chart_dataset.addValue(1600, "Ventas", "Julio"); 
        
 
        // Creando el Grafico
        JFreeChart chart=ChartFactory.createLineChart("Total",
                "Mes","Ventas",line_chart_dataset,PlotOrientation.VERTICAL,
                true,true,false);  
        
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
        new VistaEvolucionVentas().setVisible(true);
    }
}
