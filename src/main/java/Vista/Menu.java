package Vista;

public class Menu {

    public int menu(){
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
    public int menuCreate(){
        int op;
        do{
            System.out.println("#1-Insertar persona en la base de datos");
            System.out.println("#2-Insertar propiedad en la base de datos");
            System.out.println("#3-Insertar venta en la base de datos");
            System.out.println("#0-Salir");
            op=Inputs.num("Opción: ");

        }while( op<0 && op >4);

        return op;
    }
    public int menuMod(){
        int op;
        do{
            System.out.println("#1-Modificar persona en la base de datos");
            System.out.println("#2-Modificar propiedad en la base de datos");
            System.out.println("#3-Modificar venta en la base de datos");
            System.out.println("#0-Salir");
            op=Inputs.num("Opción: ");

        }while( op<0 && op >4);

        return op;
    }
    public int menuDel(){
        int op;
        do{
            System.out.println("#1-Eliminar persona en la base de datos");
            System.out.println("#2-Eliminar propiedad en la base de datos");
            System.out.println("#3-Eliminar venta en la base de datos");
            System.out.println("#0-Salir");
            op=Inputs.num("Opción: ");

        }while( op<0 && op >4);

        return op;
    }
    public int menuMos(){
        int op;
        do{
            System.out.println("#1-Mostrar persona en la base de datos");
            System.out.println("#2-Mostrar propiedad en la base de datos");
            System.out.println("#3-Mostrar venta en la base de datos");
            System.out.println("#0-Salir");
            op=Inputs.num("Opción: ");

        }while( op<0 && op >4);

        return op;
    }
    public int menuSql(){
        int op;
        do{
            System.out.println("#1-Consulta()");
            System.out.println("#2-Consulta()");
            System.out.println("#3-Consulta");
            System.out.println("#0-Salir");
            op=Inputs.num("Opción: ");

        }while( op<0 && op >4);

        return op;
    }

}
