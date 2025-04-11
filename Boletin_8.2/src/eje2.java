
/**
 * Inserte o caracter entre cada letra da cadea. Ex: separar e ‘,’ debería devolver s,e,p,a,r,a,r
 * Reemplace tódolos espazos polo caracter. Ex: ‘meu arquivo de texto.txt’ e ‘\_’ debería devoltar ‘meu\_arquivo\_de\_texto.txt’
 * Reemplace tódolos díxitos na cadea polo caracter. Ex: súa clave é: 1540 e ‘X’ debería devotar súa clave é: XXXX
 * Inserte o caracter cada 3 díxitos na cadea. Ex. 2552552550 e ‘.’ debería devoltar 255.255.255.0
 * @author Oliver Miguez Alonso
 */
public class eje2 {
    /**
     * Metodo principal del programa
     * @param args no usamos
     */
    public static void main(String[] args) {
        String cadea = "Esto es una cadena de texto";
        String caracter = ",";
        int tamanoCadea = cadea.length();

        System.out.println(remplazar(cadea,tamanoCadea,caracter));
        System.out.println(cambio(cadea));
        System.out.println(remplazoPorX());
        //System.out.println(cadaTres());
    }//end main

    /**
     * Remplaza los espacios en blanco por el valor de la variable caracter
     * @param texto String cadena original
     * @param tamanoTexto Tamaño del String
     * @param caracter variable inicial
     * @return el nuevo texto cambiado
     */
    public static String remplazar(String texto, int tamanoTexto,String caracter){
        String newTexto = texto.replace("",caracter); //remplaza los espacios en blanco por el caracter
        return newTexto.substring(1,tamanoTexto-1); //Permite quitar el primer y ultimo caracter
    }//end remplazar

    /**
     * Cambia los espacios en blanco por \
     * @param cadea String cadea original
     * @return Cadena cambiada
     */
    public static String cambio (String cadea){
        return cadea.replace(" ","\\_");
    }//end

    /**
     * Remplaza los numeros por X
     * @return el texto cambiado
     */
    public static String remplazoPorX(){
        String texto = "La clave es : 1234";
        return texto.replaceAll("\\d","X");// el \\d hace referencia a todos los numeros , entonces remplaza todos los numeros por x

    }//end remplazo

//    public static String cadaTres(){
//        String texto = "123456789";
//
//
//    }//end cada tres


}//end class
