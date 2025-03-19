public class mahasiswaBerprestasi12{
    mahasiswa12 [] listMhs = new mahasiswa12[5];
    int idx;

    void tambah(mahasiswa12 m){
        if (idx<listMhs.length){
            listMhs[idx]=m;
            idx++;
        } else{
            System.out.println("Data sudah penuh!");
        }
    }

    void tampil(){
        for(mahasiswa12 m:listMhs){
            m.tampilInformasi();
            System.out.println("---------------------------");
        }
    }

    void bubbleSort(){
        for(int i=0; i<listMhs.length-1; i++){
            for(int j=1; j<listMhs.length-i; j++){
                if(listMhs[j].ipk>listMhs[j-1].ipk){
                    mahasiswa12 tmp = listMhs[j];
                    listMhs[j]=listMhs[j-1];
                    listMhs[j-1]=tmp;
                }
            }
        }
    }
    
}