import java.util.Scanner;

public class QuickSort {
    public static int[] qsort(int arr[]){
        if(arr==null) return null;
        else{
            int n=arr.length;
            if(n==0) return arr;
            quick(arr,0,n-1);
            return arr;
        }
    }
    public static void quick(int k[],int left,int right)
    {
        int i, j,tmp;
        int pivot;
        if(left<right){
            i=left; j=right+1;
            pivot = k[left];
            while(true){
                while(k[++i]<pivot && i!=right);
                while(k[--j]>pivot && j!=left);
                if(i<j)
                {
                    tmp=k[i];
                    k[i]=k[j];
                    k[j]=tmp;
                }
                else break;
            }
            tmp=k[left];
            k[left]=k[j];
            k[j]=tmp;
            quick(k,left,j-1);
            quick(k,j+1,right);
        }
    }
    public static void main(String args[]) {
        int a[]={12,45,67,89,123,-45,67};
        qsort(a);
        int n=a.length;
        for(int i=0;i<n;i++)
        System.out.print(a[i]+" ");
    }
}
