class mahasiswaBerprestasi12 {
    ArrayList<mahasiswa12> listMhs = new ArrayList<>();

    void tambah(mahasiswa12 m) {
        listMhs.add(m);
    }

    void tampil() {
        for (mahasiswa12 m : listMhs) {
            m.tampilInformasi();
            System.out.println("---------------------------");
        }
    }

    void bubbleSort() {
        int n = listMhs.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 1; j < n - i; j++) {
                if (listMhs.get(j).ipk > listMhs.get(j - 1).ipk) {
                    mahasiswa12 tmp = listMhs.get(j);
                    listMhs.set(j, listMhs.get(j - 1));
                    listMhs.set(j - 1, tmp);
                }
            }
        }
    }
}