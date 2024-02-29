import java.util.*;
class Array25{
	int MaxCon1(int a[]){
		int curr=0;
		int max=0;
		for(int i=0;i<a.length;i++){
			if(a[i]==1){
			curr++;
			max=Math.max(curr,max);
            }
			else{
				curr=0;
			}
		}
		return max;
	}
}
class Run{
	public static void main(String[] args){
		Array25 a=new Array25();
		int ar[]={1,1,1,0,0,1,0,1,1,0,0,1,1,1,1};
		System.out.println(a.MaxCon1(ar));
	}
}