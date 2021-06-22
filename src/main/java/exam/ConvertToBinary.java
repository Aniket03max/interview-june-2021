package exam;

public class ConvertToBinary {

  public String toBinary(final int n) {
    int[] bNum = new int[32];
    int i = 0;
    while(n > 0)
    {
      bNum[i] = n % 2;
      n = n / 2;
      i++;
    }
    String s = Array.toString(bNum);
    /*for(int j=i-1;j>=0;j--)
      system.out.print(bNum[j]);*/
   
    return "s";
  }
}
