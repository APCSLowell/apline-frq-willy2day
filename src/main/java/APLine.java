public class APLine
{
  /* your code here */
  private int a, b, c; 
  public APLine(int A, int B, int C){
    int a = A;
    int b=B;
    int c=C;


    
  }
  public double getSlope(){
    double slope = (double) -a/b;
    return slope; 

    
  }
  public boolean isOnLine(int x, int y){
    if ((a*(x)+b*y+c)==0)
      return true;
    return false; 
  }
}
