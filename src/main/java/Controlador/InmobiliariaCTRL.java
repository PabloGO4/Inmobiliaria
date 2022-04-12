package Controlador;

import Vista.Inputs;
import Vista.Menu;

public class InmobiliariaCTRL {

    public void Control(){

        Menu vista = new Menu();
        Inputs entrada = new Inputs();

        int op;

        do{
            op= vista.menu1();

            switch (op){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Parametro introducido incorrecto");
            }

        }while(op<0 && op > 4);
    }
}
