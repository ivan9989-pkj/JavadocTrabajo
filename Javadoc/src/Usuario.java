
/**
 * Esto nos dara los datos del Usuarios
 * @author Ivan Santana
 */

public class Usuario {

    private String Nombre;
    private String Apellidos;
    private String DNI;
    private String correoelectronico;
    private String Direccion;

    /**
     * Esto nos dice todos los atributos
     * @param Nombre nos describe el nombre del usuario
     * @param Apellidos nos describe el apellido del usuario
     * @param DNI nos dice el DNI del usuario
     * @param correoelectronico nos dice el correo electronico del usuario
     * @param Direccion  nos dice la dirección del usuario
     */

    public Usuario(String Nombre, String Apellidos, String DNI, String correoelectronico, String Direccion) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.DNI = DNI;
        this.correoelectronico = correoelectronico;
        this.Direccion = Direccion;
    }
}
