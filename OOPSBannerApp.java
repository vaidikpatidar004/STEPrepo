/**
 * OOPSBannerApp
 *
 * UC3: Print "OOPS" banner using String.join()
 * Refactored to improve memory efficiency.
 *
 * @author Vaidik
 * @version 3.0
 */
public class OOPSBannerApp {

    public static void main(String[] args) {

        System.out.println(String.join("  ",
                " ***** ",
                " ***** ",
                " ***** ",
                " ***** "));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*     *"));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*      "));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                " ***** ",
                " ***** "));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "      *"));

        System.out.println(String.join("  ",
                "*     *",
                "*     *",
                "*      ",
                "*     *"));

        System.out.println(String.join("  ",
                " ***** ",
                " ***** ",
                "*      ",
                " ***** "));
    }
}