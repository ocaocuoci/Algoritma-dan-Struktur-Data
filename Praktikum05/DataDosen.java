public class DataDosen {
    Dosen[] dataDosen = new Dosen[10];
    int idx = 0;

    public void tambah(Dosen dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    public void tampil() {
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    public void SortingASC() { 
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) { 
                    Dosen temp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = temp;
                }
            }
        }
    }

    public void sortingDSC() { 
        for (int i = 0; i < idx - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[maxIdx].usia) { 
                    maxIdx = j;
                }
            }
            Dosen temp = dataDosen[maxIdx];
            dataDosen[maxIdx] = dataDosen[i];
            dataDosen[i] = temp;
        }
    }

    public void insertionSort() { 
        for (int i = 1; i < idx; i++) {
            Dosen temp = dataDosen[i];
            int j = i;
            while (j > 0 && dataDosen[j - 1].usia < temp.usia) { 
                dataDosen[j] = dataDosen[j - 1];
                j--;
            }
            dataDosen[j] = temp;
        }
    }

    public void pencarianDataSequensial12(String nama){
        boolean found = false;
        for(int i =0; i< idx; i++){
            if(dataDosen[i].nama.equalsIgnoreCase(nama)){
                System.out.println("Data dosen ditemukan: ");
                dataDosen[i].tampil();
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Data dosen dengan nama " + nama + " tidak ditemukan!");
        }
    }

    public void pencarianDataBinary12(int usia){
        SortingASC();
        int left =0, right =idx-1;
        boolean found = false;
        int count =0;

        while (left<=right){
            int mid = left + (right - left)/2;
            if(dataDosen[mid].usia == usia){
                System.out.println("Data dosen ditemukan: ");
                int i = mid;
                
                while (i>=0 && dataDosen[i].usia == usia){
                    dataDosen[i].tampil();
                    count++;
                    i--;
                }
                i = mid+1;
                while(i< idx && dataDosen[i].usia == usia){
                    dataDosen[i].tampil();
                    count++;
                    i++;
                }
                found = true;
                break;
            }
            else if(dataDosen[mid].usia < usia){
                left = mid+1;
            }
            else{
                right = mid -1;
            }
        }
        if(!found){
            System.out.println("Data dosen dengan usia " + usia + " tidak ditemukan!");
        } 
        else if(count > 1){
            System.out.println("Peringatan: Terdapat lebih dari satu data dosen\n dengan usia yang sama!");
        }
    }
}