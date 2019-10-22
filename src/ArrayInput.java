
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 92332
 */
public class ArrayInput {
 public ArrayInput()
    {
        initComponenets();
    }

    private void initComponenets() 
    {
        int size=10;
        
        int array[]=new int[size];
        
        System.out.println("Enter "+size+" Elements of Array:");
        arrayInput(array,size);
        
        System.out.println("");
        System.out.println("Displaying Array............");
        arrayPrint(array,size);
        
        
        arrayMultiply(array,size);
        
        System.out.println("After Multiply by 2");
        System.out.println("Displaying Array............");
        arrayPrint(array,size);
        
        System.out.println("After Doubling the Size");
        System.out.println("Displaying Array............");
        arrayDouble(array,size);
        //arrayPrint(array,size);
        
    }

    public void arrayMultiply(int arr[],int s) 
    {
        for (int i = 0; i < s; i++) 
        {
            arr[i]=arr[i]*2;
        }
        
    }

    private void arrayPrint(int arr[],int s) 
    {
        
        for (int i = 0; i < s; i++) 
        {
            System.out.println("Array Element "+i+" "+arr[i]);
        }
       
    }

    private void arrayInput(int[] arr, int s) 
    {
        int tmp=0;
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < s; i++) 
        {
            tmp=input.nextInt();
            arr[i]=tmp;
        }
    }

    private void arrayDouble(int[] arr, int s) 
    {
        int tmpSize=s*2;
        int i=0;
        int tmpArr[]=new int [s*2];
        for (int j = 0; j < s; j++) 
        {
            tmpArr[j]=arr[j];
        }
        for (int j = s; j < s*2; j++) 
        {
            tmpArr[j]=arr[j-s];
        }
        //arr=tmpArr;
        arrayPrint(tmpArr,tmpSize);
        
    }
    
    
}
   
}
