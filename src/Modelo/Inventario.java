package Modelo;


import java.io.File;
import java.io.RandomAccessFile;
import java.util.*;

/**
 * 
 */
public class Inventario {

    /**
     * Default constructor
     */   
    public Inventario(){
        Productos = new ArrayList<Producto>();
        
        Productos.add(0, new Producto("leche entera x6", 1, 100, 10900));
        Productos.add(1,new Producto("huevos", 2, 60, 6900) );
        Productos.add(2,new Producto("pan", 3, 54, 3000) );
        Productos.add(3,new Producto("cereal", 4, 45, 11000) );
        Productos.add(4,new Producto("aceite", 5, 100, 7000) );
        Productos.add(5,new Producto("atun", 6, 125, 3500) );
        Productos.add(6,new Producto("cafe", 7, 56, 4200) );
        Productos.add(7,new Producto("chocolate", 8, 34, 2900) );
        Productos.add(8,new Producto("jamon", 9, 77, 1100) );
        Productos.add(9,new Producto("queso", 10, 64, 8900) );
        Productos.add(10,new Producto("salchichas", 11, 70, 13000) );
        Productos.add(11,new Producto("galletas", 12, 42, 4500) );
        Productos.add(12,new Producto("carne", 13, 54, 8600) );
        Productos.add(13,new Producto("pollo", 14, 46, 9000) );
        Productos.add(14,new Producto("pescado", 15, 38, 1100) );
        Productos.add(15,new Producto("pasta", 16, 67, 6700) );
        Productos.add(16,new Producto("arroz", 17, 93, 7100) );
        Productos.add(17,new Producto("detergente", 18, 102, 10900) );
        Productos.add(18,new Producto("shampoo", 19, 160, 11700) );
        Productos.add(19,new Producto("vanish", 20, 86, 7900) );
        
        try{
        File Fnom = new File("Nombres.txt");
        File Fin = new File("Inventario.txt");
        
        RandomAccessFile Fnom1 = new RandomAccessFile(Fnom, "rw");
        RandomAccessFile Fin1 = new RandomAccessFile(Fin, "rw");
        
        for(int x=0; x<Productos.size(); x++){
         Fnom1.writeChars(Productos.get(x).getNombre() + "-");   
        }
        
        for(int x=0; x<Productos.size(); x++){
         Fin1.writeInt(Productos.get(x).getCodigoBarras());   
         Fin1.writeInt(Productos.get(x).getCantidad()); 
         Fin1.writeFloat(Productos.get(x).getPrecio());
        }
           
        
        }
        catch(Exception e){
            System.out.println("algo paso en Inventario");
        }
    }

    /**
     * 
     */
    public Producto producto;
    
    public ArrayList<Producto> Productos;

}