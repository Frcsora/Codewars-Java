//https://www.codewars.com/kata/5262119038c0985a5b00029f
public class Prime {
  public static boolean isPrime(int num) {
    if(num <= 0 || num == 1){
      return false;
    }
    for(int i = 2 ; i <= (int) (Math.sqrt(num)); i++){
      if(num % i == 0){
        return false;
      }
    }
    return true; 
  }
}
