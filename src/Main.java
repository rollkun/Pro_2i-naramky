import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Naramky naramky = new Naramky();

        System.out.print("Zadej jméno zákazníka: ");
        String jmeno = sc.next();
        naramky.vypisUvod(jmeno);

        System.out.print("Zadej požadovaný počet korálků (délku náramku): ");
        int cil = sc.nextInt();

        // jsem moc línej řešit inputmismatchexception,
        // čili boolean načítám jako 1 / 0 (int)
        System.out.print("Chceš dárkové balení? (1 = ano / 0 = ne): ");
        int volbaDarkove = sc.nextInt();
        boolean darkove = (volbaDarkove == 1);

        System.out.print("Zadej zásobu perlových korálků (P): ");
        int zasobaP = naramky.nactiZasobu();

        System.out.print("Zadej zásobu kovových korálků (K): ");
        int zasobaK = naramky.nactiZasobu();

        System.out.print("Skládání náramku: ");
        int vlozeno = naramky.skladaniNaramku(zasobaP, zasobaK, cil);

        naramky.vypisZakazku(cil, vlozeno, darkove);
    }
}