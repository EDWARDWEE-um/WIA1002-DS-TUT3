package Question01;

public class D {

    public static void main(String[] args) {
        int a = 100;
        binary(a);

    }

    public static void binary(int a) {
      if(a==0){
          System.out.println("");
      }
      else{
          binary(a/2);
          System.out.print(a%2);
      } 
    }
}
