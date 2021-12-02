
import java.util.Scanner;

public class Qsort {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner reader=new Scanner(System.in);
	        String ss=null;//nums
	        //if(ss!=null)
	        ss=reader.nextLine();
	        int l=ss.length();
	        int i=0;
	        String [] ssr;
	        
	        if(l>0){
	        	
	        	ssr=ss.split(" ");
	        	l=ssr.length;
	        	int a[]=new int[l];
	        	for(i=0;i<l;i++){
	        			a[i]=Integer.valueOf(ssr[i]);
	        		}
	        	a=qsort(a);
	        	if(a!=null)
	        	{
	        		//l=ssr.length;
	        		for(i=0;i<a.length;i++)
	        		{
	        			System.out.print(a[i]+" ");
	        		}
	        	}
	        }
	        else
	        {
	        	int [] a1;
	        	a1=null;
	        	a1=qsort(a1);
	        }
			
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

	}