package Main;

import Models.Compra;
import Models.Targeta;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner lectura = new Scanner(System.in);
    System.out.println("Porfavor detalle su limite de tarjeta");
    double limit = lectura.nextDouble();
    var tarjeta = new Targeta(limit);

    int salir = 1;
    while (salir != 0){
        System.out.println("Escriba una breve descripcion de la compra");
        String Descripcion = lectura.next();

        System.out.println("Ingrese el valor de la compra");
        double Valor = Double.valueOf(lectura.next()) ;

        var Compra = new Compra(Valor,Descripcion);
        boolean compraRealizada = tarjeta.LanzarCompra(Compra);

        if(compraRealizada){
            System.out.println("Compra finalizada! Gracias");
            System.out.println("Si desea salir de la tienda presione 0, si desea continuar comprando presione 1");
            salir = lectura.nextInt();
        }else {
            System.out.println("Saldo Insuficiencte para efectuar la compra");
            salir = 0;
        };
    }
    System.out.println("------------------------------------");
    System.out.println("Compras realizadas: ");

    for (var Compra : tarjeta.getListaDeCompra()){
        System.out.println(Compra.getDescripcion()+ " " + Compra.getValor());
    }
    System.out.println("------------------------");
    System.out.println("Saldo Restante en su cuenta" + tarjeta.getSaldo());
}

}