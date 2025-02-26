class DataDosen{
    public static void dataSemuaDosen(Dosen[] arrayOfDosen){
        for (Dosen dosen: arrayOfDosen){
            dosen.tampilkanInfo();
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen[] arrayOfDosen){
        int pria = 0, wanita = 0;
        for(Dosen dosen: arrayOfDosen){
            if(dosen.jnsKelamin){
                pria++;
            } else{
                wanita++;
            }
        }
        System.out.println("Jumlah Dosen Pria: " +pria);
        System.out.println("Jumlah Dosen Wanita: " +wanita);
    }
    public static void  rerataUsiaDosenPerJenisKelamin(Dosen[] arrayOfDosen){
        int totalPria = 0, totalWanita = 0, countPria = 0, countWanita = 0;
        for(Dosen dosen : arrayOfDosen){
            if (dosen.jnsKelamin){
                totalPria+= dosen.usia;
                countPria++;
            } else{
                totalWanita+= dosen.usia;
                countWanita++;
            }
        }
        System.out.println("Rata-rata usia Dosen Pria: " + (countPria > 0 ? (double) totalPria / countPria : 0));
        System.out.println("Rata-rata usia Dosen Wanita: " + (countWanita > 0 ? (double) totalWanita / countWanita : 0));
    }
    public static void infoDosenPalingTua(Dosen[] arrayOfDosen) {
        Dosen tertua = arrayOfDosen[0];
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.usia > tertua.usia) {
                tertua = dosen;
            }
        }
        System.out.println("Dosen Paling Tua:");
        tertua.tampilkanInfo();
    }
    public static void infoDosenPalingMuda(Dosen[] arrayOfDosen) {
        Dosen termuda = arrayOfDosen[0];
        for (Dosen dosen : arrayOfDosen) {
            if (dosen.usia < termuda.usia) {
                termuda = dosen;
            }
        }
        System.out.println("Dosen Paling Muda:");
        termuda.tampilkanInfo();
    }
    

}