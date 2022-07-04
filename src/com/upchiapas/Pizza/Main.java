package com.upchiapas.Pizza;


import java.util.Scanner;
        import com.upchiapas.Pizza.models.*;
public class Main {
    public static void main (String[]args) {

        Scanner teclado = new Scanner(System.in);
        String[] A = new String[2];
        CatalogoPizza catalogo = new CatalogoPizza();
        String[] nombre = {"Mexicana", "Peperoni", "Hawaina", "rellena de queso","champiñones"};
        String[] arregloAux = new String[2];
        OrdenCompra Pedido[] = new OrdenCompra[2];
        ItemComprar Orden[] = new ItemComprar[2];

        String nombrePedido1="", aux, tipoPizza="",aux1;
        int id2=0,cantidadPedidos=0,totalOrdenes=0,Position = 5;
        byte cantidad=0, opcion=0;

        System.out.println("\n"+" Pizzeria mancheroni");
        System.out.print("Hola Bienvenido a la pizzeria ");

        do {
            System.out.println("\n"+"1. Catalogo de Especialidades.");
            System.out.println("2. ordenes de compra");
            System.out.println("3. Reporte de todas las ventas realizadas");
            System.out.println("4. Salir");


            System.out.print("Porfavor eliga una opcion ");
            opcion = teclado.nextByte();

            switch(opcion) {
                case 1:
                    System.out.println("");
                    catalogo.nombresPizza(nombre, nombre.length);
                    break;
                case 2:
                    System.out.println("¿cantidad de pedidos a realizar? ");
                    cantidadPedidos = teclado.nextInt();

                    for(int i=0; i<Pedido.length; i++) {
                        teclado.nextLine();
                        System.out.println("Nombre del cliente: ");
                        nombrePedido1 = teclado.nextLine();
                        System.out.println("cual es la especialidad? ");
                        tipoPizza = teclado.nextLine();
                        System.out.println("Introduce tu id : ");
                        id2 = teclado.nextInt();

                        Orden[i] = new ItemComprar(cantidad=(byte)i);
                        Pedido[i] = new OrdenCompra(nombrePedido1, id2, tipoPizza);
                    }



                    for(int i=0; i<Pedido.length; i++)
                        arregloAux[i] += Pedido[i].getNombrePedido()+", La id del cliente: "+Pedido[i].getId()+" La especialidad de la pizza:: "+Pedido[i].getTipoPizza();

                    for(int i=0; i<Pedido.length; i++)
                        arregloAux[i] = arregloAux[i].substring(4,Position) + arregloAux[i].substring(Position+0);

                    for(int i=0; i<Pedido.length; i++)
                        A[i]=arregloAux[i];

                    for(int i=1; i<=A.length; i++)
                        for(int j=0; j<A.length-i; j++)
                            if( A[j].compareTo( A[j+1] ) > 0 ) {
                                aux   = A[j];
                                A[j]  = A[j+1];
                                A[j+1]= aux;
                            }

                    for(int i=0; i<A.length; i++)
                        System.out.println("A nombre del: "+A[i] +" " );
                    break;
                case 3:
                    for(int i=0; i<Orden.length; i++)
                        totalOrdenes = Orden[i].getCantidad();

                    totalOrdenes= totalOrdenes+1;
                    System.out.println("");
                    System.out.println("estos son Los pedidos que se realizaron: "+ totalOrdenes+ " Pedidos");
                    break;
            }

        }while(opcion!=4);
        System.out.println("");
        System.out.println("gracias por su preferencia");
    }

}
