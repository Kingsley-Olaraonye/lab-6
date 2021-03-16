
/****************************************************************
 * Filename: NumStats.java
 * @author Kingsley Olaraonye, 202001612
 * @version 1.0
 * Lab Room 247-295
 * 
 */


import java.util.Scanner;
import java.io.IOException;
import java.io.FileReader;

public class NumStats
{
	public static void main(String[] args) throws IOException {
	
        String infile= "numbers.txt";
        int i = 0;
        int a ;
        int[] b = new int[2*i];
        int[] c;
        
        Scanner input = new Scanner(new FileReader(infile));

        while(input.hasNextInt()){
            a=input.nextInt();
            i++;
        }
        for(int j = 0; j <= i; j++){

            int[] c = input.length(j); 
        }

  
        System.out.printf(" %d\n " ,i  );

        input.close();
    }
}
