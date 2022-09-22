
//import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sebastian Morales - 20182020039
 */
public class Main {

    /*public static void main(String[] args) {
        System.out.println("---Conversion de bases---");
        System.out.println("1. Binario a octal\n" +
        "2. Binario a decimal\n" +
        "3. Binario a hexadecimal\n" +
        "4. Octal a binario\n" +
        "5. Octal a decimal\n" +
        "6. Octal a hexadecimal\n" +
        "7. Decimal a binario\n" +
        "8. Decimal a octal\n" +
        "9. Decimal a hexadecimal\n" +
        "10. Hexadecimal a binario\n" +
        "11. Hexadecimal a octal\n" +
        "12. Hexadecimal a decimal\n" +
        "Seleccione: ");
        Scanner sc = new Scanner(System.in);
        
        int eleccion = sc.nextInt();
        if (eleccion < 1 || eleccion > 12) {
            System.out.println("Elección no válida");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        switch (eleccion) {
            case 1:
                System.out.println("Ingrese número binario:");
                int binario = scanner.nextInt();
                if (!validarBinario(binario)) {
                    System.out.println("Número no válido");
                    return;
                }
                int decimal = binarioADecimal(binario);
                String octalResultante = decimalAOctal(decimal);
                System.out.println("El octal es " + octalResultante);
                break;
            case 2:
                System.out.println("Ingrese número binario:");
                binario = scanner.nextInt();
                if (!validarBinario(binario)) {
                    System.out.println("Número no válido");
                    return;
                }
                decimal = binarioADecimal(binario);
                System.out.println("El decimal es " + decimal);
                break;

            case 3:
                System.out.println("Ingrese número binario:");
                binario = scanner.nextInt();
                if (!validarBinario(binario)) {
                    System.out.println("Número no válido");
                    return;
                }
                decimal = binarioADecimal(binario);
                String hexadecimal = decimalAHexadecimal(decimal);
                System.out.println("El hexadecimal es " + hexadecimal);
                break;
            case 4:
                System.out.println("Ingrese número octal:");
                int octal = scanner.nextInt();
                if (!validarOctal(octal)) {
                    System.out.println("Número no válido");
                    return;
                }
                decimal = octalADecimal(octal);
                String binarioResultante = decimalABinario(decimal);
                System.out.println("El binario es " + binarioResultante);
                break;
            case 5:
                System.out.println("Ingrese número octal:");
                octal = scanner.nextInt();
                if (!validarOctal(octal)) {
                    System.out.println("Número no válido");
                    return;
                }
                decimal = octalADecimal(octal);
                System.out.println("El decimal es " + decimal);
                break;
            case 6:
                System.out.println("Ingrese número octal:");
                octal = scanner.nextInt();
                if (!validarOctal(octal)) {
                    System.out.println("Número no válido");
                    return;
                }
                decimal = octalADecimal(octal);
                String hexadecimalResultante = decimalAHexadecimal(decimal);
                System.out.println("El hexadecimal es " + hexadecimalResultante);
                break;
            case 7:
                System.out.println("Ingrese número decimal:");
                decimal = scanner.nextInt();
                if (!validarDecimal(decimal)) {
                    System.out.println("Número no válido");
                    return;
                }
                binarioResultante = decimalABinario(decimal);
                System.out.println("El binario es " + binarioResultante);
                break;
            case 8:
                System.out.println("Ingrese número decimal:");
                decimal = scanner.nextInt();
                if (!validarDecimal(decimal)) {
                    System.out.println("Número no válido");
                    return;
                }
                octalResultante = decimalAOctal(decimal);
                System.out.println("El octal es " + octalResultante);
                break;
            case 9:
                System.out.println("Ingrese número decimal:");
                decimal = scanner.nextInt();
                if (!validarDecimal(decimal)) {
                    System.out.println("Número no válido");
                    return;
                }
                hexadecimalResultante = decimalAHexadecimal(decimal);
                System.out.println("El hexadecimal es " + hexadecimalResultante);
                break;
            case 10:
                System.out.println("Ingrese número hexadecimal:");
                hexadecimal = scanner.nextLine().toUpperCase();
                if (!validarHexadecimal(hexadecimal)) {
                    System.out.println("Número no válido");
                    return;
                }
                decimal = hexadecimalADecimal(hexadecimal);
                binarioResultante = decimalABinario(decimal);
                System.out.println("El binario es " + binarioResultante);
                break;
            case 11:
                System.out.println("Ingrese número hexadecimal:");
                hexadecimal = scanner.nextLine().toUpperCase();
                if (!validarHexadecimal(hexadecimal)) {
                    System.out.println("Número no válido");
                    return;
                }
                decimal = hexadecimalADecimal(hexadecimal);
                octalResultante = decimalAOctal(decimal);
                System.out.println("El octal es " + octalResultante);
                break;
            case 12:
                System.out.println("Ingrese número hexadecimal:");
                hexadecimal = scanner.nextLine().toUpperCase();
                if (!validarHexadecimal(hexadecimal)) {
                    System.out.println("Número no válido");
                    return;
                }
                decimal = hexadecimalADecimal(hexadecimal);
                System.out.println("El decimal es " + decimal);
                break;
        }
            
    }
        
*/
}
