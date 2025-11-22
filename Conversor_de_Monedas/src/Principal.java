

import java.util.Scanner;

public class Principal {
    static double montoMonedaBase;{
        montoMonedaBase = 0;
    }
    static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);
        //ApiMonedas moneda = new ApiMonedas();
        //var montoMonedaBase = 0;
        ApiMonedas monedas = new ApiMonedas();
        System.out.println("ESTE ES EL PROGRAMA PARA REALIZAR LA CONVERSION ENTRE ALGUNAS MONEDAS A VALOR PRESENTE");
        System.out.println("AQUI ESTAN LOS PAISES CON SU CODIGO DE MONEDA");

        System.out.println("El codigo es el que se encuentra al frente de cada Pais");
        System.out.println("Argentina: ARS - Bolivia: BOB - Brasil: BRL - Suiza: CHF - Chile: CLP - China: CNY");
        System.out.println("Colombia: COP - Costa Rica: CRC - Cuba: COPA - Unión Europea: EUR - Reino Unido: GBP");
        System.out.println("Hong Kong: HKD - India: INR - Japón: JPY . México: MXN - Rusia: RUB - Arabia Saudita: SAR");
        System.out.println("Estados Unidos: USD - Uruguay: UYU - Fondo Monetario Internacional: XDR - Venezuela:  VES");

        System.out.println("\n Escriba el codigo del pais de la moneda de origen");
        var codigoMonedaBase = lectura.nextLine().toUpperCase();
        //codigo1 = codigo1.toUpperCase();
        System.out.println("Escriba el codigo del pais de la moneda destino");
        var codigoMonedaDestino = lectura.nextLine().toUpperCase();
        //codigo2 = codigo2.toUpperCase();

        try{
            //String codigo1 = lectura.nextLine();
            //String codigo2 = lectura.nextLine();

            DatosConversion datos = monedas.buscarDatos(codigoMonedaBase, codigoMonedaDestino);

            System.out.println(datos);
            System.out.println("Escriba el monto de la moneda origen");
            montoMonedaBase = lectura.nextDouble();
            var resultado = montoMonedaBase * datos.conversion_rate();
            System.out.println("El valor de "+montoMonedaBase+" "+ datos.base_code()+" en "+datos.target_code()+ " es : "+
                    (Math.round(resultado *100)) / 100.0);
        }catch(NumberFormatException e){
            System.out.println("Conversion no encontrada"+ e.getMessage());
        }catch(RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Final");
        }



    }
}
