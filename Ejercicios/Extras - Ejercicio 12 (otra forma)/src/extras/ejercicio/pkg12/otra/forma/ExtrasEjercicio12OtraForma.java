
package extras.ejercicio.pkg12.otra.forma;

public class ExtrasEjercicio12OtraForma {
    public static void main(String[] args) {
        int cont = 0;
        do {
            String palabra = "000";
            String palabra1 = "00";
            String palabra2 = "0";
            palabra = String.valueOf(cont);
            if (cont < 10) {
                palabra1 = palabra1.concat(palabra);
                palabra = palabra1;
            }
            if ((cont < 100) && (cont > 9)) {
                palabra2 = palabra2.concat(palabra);
                palabra = palabra2;
            }
            for (int i = 0; i < palabra.length(); i++) {
                if (palabra.substring(i, i + 1).equals("3")) {
                    System.out.print("E");
                } else {
                    System.out.print(palabra.substring(i, i + 1));
                }
            }
            System.out.println("");
            cont++;
        } while (cont < 1000);

    }

}