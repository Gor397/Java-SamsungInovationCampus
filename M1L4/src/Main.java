import java.util.Scanner;
public class Main {
  Static int maxArray(int[] ar){
      int max = ar[0];
      for(int i=0; i < ar.length;i++){
          if(ar[i] > max){
              max = ar[i];
          }
      }
      return max;

    }
}