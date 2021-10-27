import java.util.Scanner;

public class IcePopsAndMore {
    public static void main(String[] args){

        double precioPaleta = 30.50; //precio de paleta
        double puntosPorPaleta = 1; //puntos promocionales generados por paleta

        int totalPaletas = 0; //total de paletas a comprar
        double costoTotal = 0; //costo total a pagar por el cliente
        double puntosFinales = 0; //puntos promocionales generados por la compra

        Scanner keyboard = new Scanner(System.in);
        System.out.print("¿Cuántas paletas vas a comprar?: ");
        totalPaletas = keyboard.nextInt();

        System.out.println();
        System.out.println("1. No quiero descuentos, gracias");
        System.out.println("2. 10% de descuento en precio total");
        System.out.println("3. Compra 5 por el precio de 4");
        System.out.println("4. Puntos promocionales dobles");
        System.out.print("Elige el descuento deseado: ");
        int descuentoElegido = keyboard.nextInt();

        if (descuentoElegido < 1 || descuentoElegido > 4 || totalPaletas <= 0){
            System.out.println("Error. Información inválida.");
            System.exit(0);
        }

        if (descuentoElegido == 1){
            costoTotal = precioPaleta*totalPaletas;
            puntosFinales = totalPaletas*puntosPorPaleta;
        }

        //complete code here



        //Salida datos en consola
        System.out.println();
        System.out.println("El costo final es: " + costoTotal);
        System.out.println("Los puntos generados por la compra son: " + puntosFinales);
        keyboard.close();
    }
    
}