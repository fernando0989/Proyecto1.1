
package proyecto;


public class Producto {
    private String codigo;
    private String nombre;
    private float precio;
    private int existencia;
    
    public Producto(String codigo,String nombre,float precio,int existencia){
        this.codigo=codigo;
        this.nombre=nombre;
        this.precio=precio;
        this.existencia=existencia;
        
    }
    public void setCodigo(String codigo){
        this.codigo=codigo;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setPrecio(float precio){
        this.precio=precio;
    }
    public void setCantidad(int existencia){
        this.existencia=existencia;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getNombre(){
        return nombre;
    }
    public float getPrecio(){
        return precio;
    }
    public int getExistencia(){
        return existencia;
    }
}
