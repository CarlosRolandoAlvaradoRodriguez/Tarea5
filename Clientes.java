package Tarea5;

public class Clientes
{

    private Integer codigo;
    private String nombres;
    private String apellidos;


    public Clientes(Integer codigo, String nombres, String apellidos) {
        this.codigo = codigo;
        this.nombres = nombres;
        this.apellidos = apellidos;

    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setDni(Integer codigo) {
        this.codigo = codigo;
    }
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }



}
