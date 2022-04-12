package Vista;

public class Menu {

    public int menu1(){
        int op;
        do{
            System.out.println("#1-Insertar en la base de datos");
            System.out.println("#2-Modificar en la base de datos");
            System.out.println("#3-Eliminar en la base de datos");
            System.out.println("#4-Buscar en la base de datos");
            System.out.println("#0-Salir");
            op=Inputs.num("Opción: ");

        }while( op<0 && op >4);

        return op;
    }
}
