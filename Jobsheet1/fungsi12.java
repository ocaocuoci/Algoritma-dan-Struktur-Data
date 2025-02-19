public class fungsi12 {
    public static void main(String[] args) {
        
        int[][] stockBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12}, 
            {2, 10, 10, 5}, 
            {5, 7, 12, 9} 
        };

      
        int[] hargaBunga = {75000, 50000, 60000, 10000};

      
        System.out.println("Pendapatan Setiap Cabang Jika Semua Bunga Habis Terjual:");
        hitungPendapatanCabang(stockBunga, hargaBunga);

      
        System.out.println("\nStok RoyalGarden 4 Setelah Pengurangan Stok Karena Bunga Mati:");
        hitungStokRoyalGarden4(stockBunga[3]);
    }


    public static void hitungPendapatanCabang(int[][] stockBunga, int[] hargaBunga) {
        for (int i = 0; i < stockBunga.length; i++) {
            int totalPendapatan = 0;
            for (int j = 0; j < stockBunga[i].length; j++) {
                totalPendapatan += stockBunga[i][j] * hargaBunga[j];
            }
            System.out.println("RoyalGarden " + (i + 1) + ": Rp " + totalPendapatan);
        }
    }

    
    public static void hitungStokRoyalGarden4(int[] stockRoyalGarden4) {
        int[] bungaMati = {-1, -2, 0, -5}; 
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};

        for (int i = 0; i < stockRoyalGarden4.length; i++) {
            stockRoyalGarden4[i] += bungaMati[i]; 
            System.out.println(namaBunga[i] + ": " + stockRoyalGarden4[i]);
        }
    }
}
