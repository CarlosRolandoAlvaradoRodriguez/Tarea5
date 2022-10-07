package Tarea5;

public class TiendaP {
    private Clientes clientes[];
    private int contadorClientes;
    private String nombre;
    private String direccion;




    //GENERAMOS NUESTROS CONSTRUCTORES
    public TiendaP() {
        this.clientes = new Clientes[9];
        this.contadorClientes = 0;
    }

    public TiendaP(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }


    //METODOS PARA AGREGAR CLIENTE
    public void agregarCliente(Clientes clientes) {
        this.clientes[contadorClientes++] = clientes;
    }

    //METODO PARA RETORNAR CLIENTE
    public Clientes[] getClientes() {
        return this.clientes;
    }


    //GETTER Y SETTER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }



    public void ordenar() {
        Clientes Aux;
    int i,j;

        for( i=0;i < 9;i++){

        for (j=i; j<9; j++){
            if (clientes[i].getCodigo()>clientes[j].getCodigo()){
                Aux = clientes[i];
                clientes[i]=clientes[j];
                clientes[j] = Aux;

            }

            }
        }
    }

}
