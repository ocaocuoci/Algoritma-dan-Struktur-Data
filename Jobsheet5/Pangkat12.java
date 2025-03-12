public class Pangkat12{

    int p, n;
    Pangkat12(int n, int p){
        this.n = n;
        this.p = p;
    }
    public int pangkatBF(){
        int hasil = 1;
        for(int i=0; i< this.p; i++){
            hasil *= this.n;
        }
        return hasil;
    }
    public int pangkatDC(int a, int n){
        if(n==0){
            return 1;
        } else if(n==1){
            return a;
        } else {
            if(n%2==1){
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2)*a);
            } else{
                return (pangkatDC(a, n/2) * pangkatDC(a, n/2));
            }
        }
    }
}