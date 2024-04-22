public class APLine
{
  /* your code here */
  int A, B, C; 
  public APLine(int a, int b, int c){
    int A = a;
    int B=b;
    int C=c;


    
  }
  public int getSlope(){
    int slope = -a/b;
    return slope; 

    
  }
  public boolean isOnLine(int x, int y){
    if ((A*(x)*(x)+B*x+C)==0)
      return true;
    return false; 
  }
}
