// set matrix elements to zero

import java.util.HashSet;
import java.util.Set;
class Solution {
    //function to set matrix elements to zero
    public void setZeroes(int[][] array) {
        Set <Integer> rowsToZero = new HashSet <>();
        Set <Integer> columnsToZero = new HashSet <>();
        //loop iterate over rows 
        for(int i = 0; i < array.length; i++)
        {
            //loop iterate over columns
            for(int j = 0; j < array.length; j++)
            {
                //compares an element is zero or not
                if(array[i][j] == 0)
                {
                    //if the condition returns true add that element to set
                    rowsToZero.add(i);
                    columnsToZero.add(j);
                }
            }
        }
        //loops sets the corresponding rows to zero
        for(int i : rowsToZero)
        {
            for(int j = 0; j < array.length; j++)
            {
                array[i][j] = 0;
            }
        }
        //loops sets the corresponding columns to zero
         for(int i : columnsToZero)
        {
            for(int j = 0; j < array.length; j++)
            {
                array[j][i] = 0;
            }
        }
        //loop for printing rows
        for(int i = 0; i < array.length; i++)
        {
            //loop for printing columns
            for(int j = 0; j < array.length; j++)
            {
                //prints matrix elements
                System.out.print(array[i][j]+"\t");
                if(j == array.length-1)
                //throws cursor to the next line
                System.out.println();
            }
        }
    }
    //derive code
    public static void main(String args[])
    {
        //an array whose rows and element set to be zero
        int[][]arr = {{1,1,1},{1,0,1},{1,1,1}};
        //function calling
        setZeroes.array[][];
    }
}