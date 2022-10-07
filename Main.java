package Tarea5;

public class Main
{
    public static void main(String[] args) {

        TiendaP tiendap = new TiendaP();


        //ARGUMENTO TIENDA
        tiendap.setNombre("Julissa");
        tiendap.setDireccion("Jr. Abatao 245");


        //DATOS DEL CLIENTE

        tiendap.agregarCliente(new Clientes(33333333,"Jose Luis", "Dias Valderde"));
        tiendap.agregarCliente(new Clientes(99999999,"Fernando", "Torres Santiago"));
        tiendap.agregarCliente(new Clientes(11111111,"Alexander", "Dominguez Chavez "));
        tiendap.agregarCliente(new Clientes(77777777,"Gabriel", "Solis Canchaya"));

        tiendap.agregarCliente(new Clientes(55555555,"Maximo", "Rocano Romero"));
        tiendap.agregarCliente(new Clientes(66666666,"Blanca ", "Rodriguez Delgado"));
        tiendap.agregarCliente(new Clientes(22222222, "Solis" ,"Canchaya Huamani"));
        tiendap.agregarCliente(new Clientes(44444444,"Juan ", "Perez Ayala"));
        tiendap.agregarCliente(new Clientes(88888888,"Gabriela", "Herrera Rojas"));
        System.out.println("TIENDA: " + tiendap.getNombre() );
        System.out.println("DIRRECION: " + tiendap.getDireccion());
        System.out.println("\n CLIENTES");


        tiendap.ordenar();
        for (Clientes cli: tiendap.getClientes()){
            System.out.println("- CODIGO:" + cli.getCodigo()+"\n  "+ cli.getNombres() + " " + cli.getApellidos());
        }
    }
}
