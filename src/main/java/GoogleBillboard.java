public class GoogleBillboard{
public static void main(final String[] arg) {
   for(int i=9;i<e.length()-9 &&!primeNum;i++) {
   String substring = e.substring(i, i + 10);
   num = Double.parseDouble(substring);
   if(isPrime(num)) {
      System.out.print (substring);
      primeNum = true;
   }
  }
}
public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";
public static double num=0;
public static boolean primeNum = false;


public static boolean isPrime(double dNum){
if(dNum<=1){
    return false;
}
for(int i=2;i<=Math.sqrt(dNum);i++){
   if (dNum%i==0){
       return false;
   }
}
  return true;
}
}
