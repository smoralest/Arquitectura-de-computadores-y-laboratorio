/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class Validacion {
    


    public boolean validarBinario(int binario) {
    // Comprobar si solo se compone de unos y ceros
    String binarioCadena = String.valueOf(binario);
    for (int i = 0; i < binarioCadena.length(); i++) {
        char caracter = binarioCadena.charAt(i);
        if (caracter != '0' && caracter != '1') {
            return false;
        }
    }
    return true;
}
    public boolean validarOctal(int octal) {
    // comprobar si solo tiene números del 0 al 7
    String octalCadena = String.valueOf(octal);
    String caracteresOctales = "01234567";
    for (int i = 0; i < octalCadena.length(); i++) {
        char caracter = octalCadena.charAt(i);
        // Si no se encuentra dentro de los caracteres válidos, regresamos false
        if (caracteresOctales.indexOf(caracter) == -1) {
            return false;
        }
    }
    return true;
}

// Nota: se debe enviar la cadena hexadecimal convertida a mayúsculas
public boolean validarHexadecimal(String hexadecimal) {
    // Comprobar si solo tiene números del 0 al 9 y letras de la A a la F
    String caracteresHexadecimales = "0123456789ABCDEF";
    for (int i = 0; i < hexadecimal.length(); i++) {
        char caracter = hexadecimal.charAt(i);
        // Si no se encuentra dentro de los caracteres válidos, regresamos false
        if (caracteresHexadecimales.indexOf(caracter) == -1) {
            return false;
        }
    }
    return true;
}

}
