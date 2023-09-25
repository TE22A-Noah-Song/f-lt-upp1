public class App {
    public static void main(String[] args) throws Exception {
        int[] fält1 = {8, 4, 6, 3, 9};
        System.out.println("fält1:");
        for (int i = 0; i < fält1.length; i++) {
            System.out.print(fält1[i] + " ");
        }
        System.out.println();

        int antal = fält1.length;
        System.out.println("Antal: " + antal);

        double summa = fält1[0] + fält1[1] + fält1[2] + fält1[3] + fält1[4];
        double medelvärde = summa / 5;
        System.out.println("Medelvärde: " + medelvärde);

        int[] fält2 = {18, 14, 16, 13, 19};
        System.out.println("fält2:");
        for (int i = 0; i < fält2.length; i++) {
            System.out.print(fält2[i] + " ");
        }
        System.out.println();

        // Combining fält1 and fält2 into a new array fältsumma
        int[] fältsumma = new int[5];
        for (int i = 0; i < 5; i++) {
            fältsumma[i] = fält1[i] + fält2[i];
        }

        System.out.println("fältsumma:");
        for (int i = 0; i < fältsumma.length; i++) {
            System.out.print(fältsumma[i] + " ");
        }
        System.out.println();

        double summa2 = fält2[0] + fält2[1] + fält2[2] + fält2[3] + fält2[4];
        double medelvärde2 = summa2 / 5;
        System.out.println("Medelvärde: " + medelvärde2);
    }
}
