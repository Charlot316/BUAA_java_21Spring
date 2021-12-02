
import java.util.Scanner;
public class MyFind {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ss="12,45,67,89,123,-45,67";//nums
		int i=0;
		String [] ssr=ss.split(",");	       
		int l=ssr.length;	   	
		int a[]=new int[l];
		for(i=0;i<l;i++){
			a[i]=Integer.valueOf(ssr[i]);
		}
		a=qsort(a);
		for(i=0;i<l;i++){
			System.out.print(a[i]+" ");
		}
		Scanner reader=new Scanner(System.in);
		int k=reader.nextInt();
		int dex=myFind(k,0,l-1,a);
		if(dex>0)
		{
			dex++;
			System.out.println(k+"在数组中的第"+dex+"位");
		}
		else System.out.println(k+"不在数组中");
	}
	public static int qsort1(int[] arr,int first,int second)
	{
		int p=arr[first];
		while(first<second){
			while(first<second&&arr[second]>=p){
				second--;
			}
			if(first>=second)
				break;
			else
				arr[first]=arr[second];
			while(first<second&&arr[first]<=p){
				first++;
			}
			if(first>=second)
				break;
			else
				arr[second]=arr[first];
		}
		arr[first]=p;
		return first;
	}
	public static int[] qsort(int[] arr){
		if(arr==null) return null;
		else if(arr.length==0) return arr;
		int[] stack = new int[arr.length];
		int top = 0;
		int first = 0;
		int second = arr.length-1;
		int pa=qsort1(arr,first,second);
		if(pa>first+1){
			stack[top++] = first;
			stack[top++] = pa-1;
		}
		if(pa<second-1){
			stack[top++] = pa+1;
			stack[top++] = second;
		}
		while(top > 0){
			second = stack[--top];
			first = stack[--top];
			pa=qsort1(arr,first,second);
			if(pa>first+1){
				stack[top++] = first;
				stack[top++] = pa-1;
			}
			if(pa < second-1){
				stack[top++] = pa+1;
				stack[top++] = second;
			}
		}
		return arr;
	}		
	public static int myFind(int key,int left,int right,int []a1){
		while(left<=right) {
			int mid=(int)(left+right)/2;
			if(a1[mid]==key)
				return mid;
			else if(a1[mid]>key)
				right=mid-1;
			else left=mid+1;
		}
		return -1;
	}
}
