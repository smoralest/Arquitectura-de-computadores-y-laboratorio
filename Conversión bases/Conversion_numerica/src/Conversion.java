/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian
 */
public class Conversion {
    public String decimalABinario(int decimal) {
    String binario = "";
    while (decimal > 0) {
        binario = decimal % 2 + binario;
        decimal = decimal / 2;
    }
    return binario;
}
    public String decimalAOctal(int decimal) {
    int residuo;
    String octal = "";
    char[] caracteresOctales = {'0', '1', '2', '3', '4', '5', '6', '7'};
    while (decimal > 0) {
        residuo = decimal % 8;
        char caracter = caracteresOctales[residuo];
        octal = caracter + octal;
        decimal = decimal / 8;
    }
    return octal;
}
    public String decimalAHexadecimal(int decimal) {
    int residuo;
    String hexadecimal = "";
    char[] caracteresHexadecimales = 
    {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'
            , 'A', 'B', 'C', 'D', 'E', 'F'};
    while (decimal > 0) {
        residuo = decimal % 16;
        char caracterHexadecimal = caracteresHexadecimales[residuo];
        hexadecimal = caracterHexadecimal + hexadecimal;
        decimal = decimal / 16;
    }
    return hexadecimal;
}

// Conversiones de otras bases a decimal
public int binarioADecimal(int binario) {
    int decimal = 0;
    int potencia = 0;
    // Ciclo infinito hasta que binario sea 0
    while (true) {
        if (binario == 0) {
            break;
        } else {
            int temp = binario % 10;
            decimal += temp * Math.pow(2, potencia);
            binario = binario / 10;
            potencia++;
        }
    }
    return decimal;
}

public int octalADecimal(int octal) {
    int decimal = 0;
    int potencia = 0;
    // Ciclo infinito que se rompe cuando octal es 0
    while (true) {
        if (octal == 0) {
            break;
        } else {
            int temp = octal % 10;
            decimal += temp * Math.pow(8, potencia);
            octal = octal / 10;
            potencia++;
        }
    }
    return decimal;
}

public int hexadecimalADecimal(String hexadecimal) {
    String caracteresHexadecimales = "0123456789ABCDEF";
    hexadecimal = hexadecimal.toUpperCase();
    int decimal = 0;
    for (int i = 0; i < hexadecimal.length(); i++) {
        char caracter = hexadecimal.charAt(i);
        int posicionEnCaracteres = caracteresHexadecimales.indexOf(caracter);
        decimal = 16 * decimal + posicionEnCaracteres;
    }
    return decimal;
}
}
