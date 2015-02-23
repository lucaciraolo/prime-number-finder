package com.company;
import java.util.Scanner;

class PrimeNumbers
{
    public static void main(String args[])
    {
        final long startTime = System.currentTimeMillis();
        int n, status = 1, num = 3, last = 0;

        for ( int count = 2 ; count <=10000000 ;  )
        {
            for ( int j = 2 ; j <= Math.sqrt(num) ; j++ )
            {
                if ( num%j == 0 )
                {
                    status = 0;
                    break;
                }
            }
            if ( status != 0 )
            {
                last = num;
                count++;
            }
            status = 1;
            num++;
        }
        final long endTime = System.currentTimeMillis();
        System.out.println(last);
        System.out.println("Total execution time: " + ((endTime - startTime)/ (double) 1000) );
    }
}