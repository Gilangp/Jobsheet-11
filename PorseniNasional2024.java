public class PorseniNasional2024 {
    public static void main(String[] args) {

        String dataAtlet[][] = {
            { "Gilang", "Badminton" },
            { "Fajar", "Badminton" },
            { "Erik", "Badminton" },
            { "gopal", "Badminton" },
            { "Yatno", "Badminton" },
            { "Bagus", "Tenis Meja" },
            { "Gatot", "Tenis Meja" },
            { "Yudi", "Tenis Meja" },
            { "Sudiro", "Tenis Meja" },
            { "Tora", "Tenis Meja" },
            { "Ibra", "Basket" },
            { "Jago", "Basket" },
            { "Bejo", "Basket" },
            { "Mambu", "Basket" },
            { "Anhar", "Basket" },
            { "Milan", "Bola Voly" },
            { "Billy", "Bola Voly" },
            { "Elzan", "Bola Voly" },
            { "Delon", "Bola Voly" },
            { "Alex", "Bola Voly" }
        };
        for (int i = 0; i < dataAtlet.length - 1; i++) {
            for (int j = 0; j < dataAtlet.length - i - 1; j++) {
                if (dataAtlet[j][0].compareTo(dataAtlet[j + 1][0]) > 0) {
                    String[] temp = dataAtlet[j];
                    dataAtlet[j] = dataAtlet[j + 1];
                    dataAtlet[j + 1] = temp;
                }
            }
        }
        System.out.println("\nInformasi Atlet Porseni 2024:");
        for (String[] atlet : dataAtlet) {
            System.out.println("Nama: " + atlet[0] + ", Cabang: " + atlet[1]);
        }
    }
}