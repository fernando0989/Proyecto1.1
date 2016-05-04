
package proyecto;


public class Empleado {
    private String nombre;
    private String apellido;
    private String sexo;
    private String usuario;
    private String contraseña;

    public Empleado(String nombre, String apellido, String sexo, String usuario, String contraseña) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    public void setSexo(String sexo){
        this.sexo=sexo;
    }
    public void setUsuario(String usuario){
        this.usuario=usuario;
    }
    public void setContrasea(String contraseña){
        this.contraseña=contraseña;
    }
    
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public String getSexo(){
        return sexo;
    }
    public String getUsuario(){
        return usuario;
    }
    public String getContraseña(){
        return contraseña;
    }
    
    
    
}
