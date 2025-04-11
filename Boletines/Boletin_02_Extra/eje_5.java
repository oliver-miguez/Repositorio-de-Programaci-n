/*
Fai o algoritmo e programa que calcule o soldo bruto e líquido, a percibir por unha
persoa. Para iso hai que ter en conta, que o soldo total inclúe os seguintes conceptos:
 Soldo fixo.
 Comisión: 5% sobre importe total de vendas
 Quilometraxe: 2 € por km
 Dietas: 30 € por día de desprazamento.
Para calcular o soldo líquido debemos descontarlle ao soldo bruto:
 I.R.P.F. = 18 % do soldo total.
 Retención a seguridade social : 36 €.

 */
package org.example;
import  java.util.Scanner;

/**
 * Calcula o soldo bruto e liquido
 * @version 1.0
 * @author Oliver Miguez Alonso
 */

public class eje_5 {
    public static void main(String[]args){
        // Definir los valores que seran introducidos por pantalla
        float soldo_bruto;
        float soldo_liquido;
        float soldo_fixo;
        float km;
        float dieta;
        float comisions;

        //Guarda los datos introducidos por pantalla
        Scanner a = new Scanner(System.in);
        System.out.println("Cal e o teu soldo fixo: ");
        soldo_fixo = a.nextFloat();
        System.out.println("Cantos km fas a diario: ");
        km = a.nextFloat();
        System.out.println("Cuantos dias recibes dieta: ");
        dieta = a.nextFloat();
        System.out.println("Comisions: ");
        comisions = a.nextFloat();
        //calcula soldo bruto
        soldo_bruto = (float) (soldo_fixo + 0.05 * comisions + 2 * km + (dieta*30));
        System.out.println("Teu soldo bruto e :"+ soldo_bruto);

        //calcula soldo liquido
        soldo_liquido = (float) (soldo_bruto-(soldo_bruto*0.18 + 36));
        System.out.println("O teu soldo Liquido e : "+ soldo_liquido);

    }
}
