package Controlador;

import Vista.Inputs;
import Vista.Menu;

public class InmobiliariaCTRL {

    Menu vista = new Menu();
    Inputs entrada = new Inputs();

    public void Control(){



        int op;

        do{
            op= vista.menu();

            switch (op){
                case 1:
                    this.create();
                    break;
                case 2:
                    this.modificar();
                    break;
                case 3:
                    this.delete();
                    break;
                case 4:
                    this.mostrar();
                    break;
                case 5:
                    this.sql();
                    break;
                case 0:
                    System.out.println("Cerrando programa....");
                    break;
                default:
                    System.out.println("Parametro introducido incorrecto");
            }

        }while(op<0 && op > 5);

    }

    public void create(){
        int op;
        do{
            op= vista.menuCreate();

            switch (op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("....");
                    break;
                default:
                    System.out.println("Parametro introducido incorrecto");
            }

        }while(op<0 && op > 3);
    }

    public void modificar(){
        int op;
        do{
            op= vista.menuMod();

            switch (op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("....");
                    break;
                default:
                    System.out.println("Parametro introducido incorrecto");
            }

        }while(op<0 && op > 3);
    }
    public void delete(){
        int op;
        do{
            op= vista.menuDel();

            switch (op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("....");
                    break;
                default:
                    System.out.println("Parametro introducido incorrecto");
            }

        }while(op<0 && op > 3);
    }

    public void mostrar(){
        int op;
        do{
            op= vista.menuMos();

            switch (op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("....");
                    break;
                default:
                    System.out.println("Parametro introducido incorrecto");
            }

        }while(op<0 && op > 3);
    }

    public void sql(){
        int op;
        do{
            op= vista.menuSql();

            switch (op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 0:
                    System.out.println("....");
                    break;
                default:
                    System.out.println("Parametro introducido incorrecto");
            }

        }while(op<0 && op > 3);
    }
}