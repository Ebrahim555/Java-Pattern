
package javaapplication1;

import java.util.Scanner;

public class JavaPattern {

    public static void main(String[] args) {
     Scanner sc=new Scanner (System.in);
       int alphabet='A';
     int n,row,col;
      System.out.print("Enter n=");
      n=sc.nextInt();
      for(row=0;row<=n;row++)
      {
          for(col=0;col<=row;col++)
          {
              System.out.println((char) alphabet +" "); 
          }
          alphabet++;
          System.out.println();
      }
          sc.close();
      }
    }
            
    

