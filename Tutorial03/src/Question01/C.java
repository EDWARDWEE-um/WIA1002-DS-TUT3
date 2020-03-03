package Question01;


public class C {
    
    public static void main(String[] args) {
        int a = 180;
        int b = 150;
        gcd(a, b);
    }
    
    public static void gcd(int x, int y) {
        if(y==0){
            System.out.println("GCD "+x);
        }
        else{
            gcd(y,x%y);
        }
    }
    
}
