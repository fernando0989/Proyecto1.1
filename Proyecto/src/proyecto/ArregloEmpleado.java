/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Miriam
 */
public class ArregloEmpleado {

    private ArrayList<Empleado> objEmpleado;

    public ArregloEmpleado() {
        objEmpleado = new ArrayList<Empleado>();
    }

    public void agregar(Empleado E1) {
        objEmpleado.add(E1);
    }
    
    public void borra(Empleado E1){
        objEmpleado.remove(E1);
    }    
    
    
    public Empleado obtener(int pos) {
        return objEmpleado.get(pos);
    }
    
    public Empleado buscar(String noControl) {
        for (int i = 0; i < objEmpleado.size(); i++) {
            if(noControl.equals(objEmpleado.get(i).getUsuario()))
                return objEmpleado.get(i);
        }
        return null;
    }
    
    public int numElementos() {
        return objEmpleado.size();
    }
    
    public void leerDatos() {
        cargar();
    }
    
    
    
    // Cargar lista de alumnos
    private void cargar() {
        try {
            
            File archivo = new File("Empleados.txt");
            // Si el archivo existe
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("Empleados.txt"));
                String linea;
                
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String usuario = st.nextToken().trim();
                    String contraseña = st.nextToken().trim();
                    String nombre = st.nextToken().trim();
                    String apellido = st.nextToken().trim();
                    String sexo = st.nextToken().trim();
                   if(objEmpleado.size()==0){
                    Empleado E1 = new Empleado( nombre,  apellido,  sexo,  usuario, contraseña);
                   
                    agregar(E1);     
                   }
                  }
                       
                
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }   
    }
    public void guardar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("Empleados.txt"));
            for(int i=0; i<numElementos(); i++) {
                pw.println(obtener(i).getUsuario()+","+obtener(i).getContraseña()+","+obtener(i).getNombre()+","+obtener(i).getApellido()+","+obtener(i).getSexo());
                pw.close();
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
        }

    }
    
}
