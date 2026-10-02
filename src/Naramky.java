import java.util.Scanner;

public class Naramky {

    Scanner sc = new Scanner(System.in);

    public void vypisUvod(String jmeno) {
        System.out.println("Ahoj " + jmeno + ", vítám tě v dílně!");
    }

    public int nactiZasobu() {
        int zasoba;
        do {
            zasoba = sc.nextInt();
        } while (zasoba < 0);
        return zasoba;
    }

    public int skladaniNaramku(int zasobaP, int zasobaK, int cil) {
        int vlozeno = 0;

        for (int pozice = 1; pozice <= cil; pozice++) {
            boolean preferujP = (pozice % 2 != 0);

            if (preferujP) {
                if (zasobaP > 0) {
                    System.out.print("P ");
                    zasobaP--;
                    vlozeno++;
                } else if (zasobaK > 0) {
                    System.out.print("K ");
                    zasobaK--;
                    vlozeno++;
                } else {
                    break;
                }
            } else {
                if (zasobaK > 0) {
                    System.out.print("K ");
                    zasobaK--;
                    vlozeno++;
                } else if (zasobaP > 0) {
                    System.out.print("P ");
                    zasobaP--;
                    vlozeno++;
                } else {
                    break;
                }
            }
        }

        System.out.println();
        return vlozeno;
    }

    public void vypisZakazku(int cil, int vlozeno, boolean darkove) {
        if (vlozeno == cil) {
            int cena = vlozeno * 10;
            if (darkove) {
                cena += 20;
            }
            System.out.println("vloženo " + vlozeno + "; hotovo; cena " + cena + " Kč.");
        } else {
            int chybi = cil - vlozeno;
            System.out.println("vloženo " + vlozeno + "; chybí " + chybi + "; bez účtování.");
        }
    }
}