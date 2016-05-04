package proyecto;

import java.util.*;
import javax.swing.*;
import java.io.*;

public class ArregloProducto {

    private ArrayList<Producto> objProducto;

    public ArregloProducto() {
        objProducto = new ArrayList<Producto>();
    }
    public  void Agregar(Producto pr){
        objProducto.add(pr);
    }
    public void borrar(Producto pr){
        objProducto.remove(pr);
    }
      public Producto obtener(int pos) {
        return objProducto.get(pos);
    }
    public int numElementos() {
        return objProducto.size();
    }  
     public void leerDatos() {
        cargar();
    }

     public Producto buscar(String codigo) {
        for (int i = 0; i < objProducto.size(); i++) {
            if(codigo.equals(objProducto.get(i).getCodigo()))
                return objProducto.get(i);
        }
        return null;
    }
    private void cargar() {
       
    try {
            
            File archivo = new File("Productos.txt");
            // Si el archivo existe
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("Productos.txt"));
                String linea;
                
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String codigo = st.nextToken().trim();
                    String nombre = st.nextToken().trim();
                    float precio = Integer.parseInt(st.nextToken().trim());
                    int existencia = Integer.parseInt(st.nextToken().trim());
                    Producto pr = new Producto(codigo,nombre,precio,existencia);
                    Agregar(pr);
                }
                       
                
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }
    }
    public void guardar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("Produto.txt"));
            for(int i=0; i<numElementos(); i++) {
                pw.println(obtener(i).getCodigo()+","+obtener(i).getNombre()+","+obtener(i).getPrecio()+","+obtener(i).getExistencia());
                pw.close();
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
        }

    }
}
