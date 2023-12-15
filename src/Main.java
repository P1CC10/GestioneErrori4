public class Main {
    public static void main(String[] args) {
        int[] array = {1, 5, 13, 17};
        try {
            elaboraArray(array);
        } catch (ArithmeticException e) {
            System.out.println("Errore: Divisione per zero");
        }
    }

    public static void elaboraArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            try {
                // Verifica se l'elemento corrente è diverso da zero prima di effettuare la divisione
                if (array[i] != 0) {
                    int risultato = array[i] / 0;
                    System.out.println("Risultato: " + risultato);
                } else {
                    System.out.println("Errore: Divisione per zero evitata");
                }
            } catch (ArithmeticException e) {
                System.out.println("Errore: Divisione per zero");
            }
        }
    }
}
