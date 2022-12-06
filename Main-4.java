/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
	public static void main(String[] args) {
	int arr[]={9,4,2,5,7,8,1};
	for(int i=1;i<arr.length;i++){
	    int current =arr[i];
	    int j=i-1;
	    while(j>=0 && current<arr[j]){
	        arr[j+1]=arr[j];
	        j--;
	    }
	    arr[j+1]=current;
	}
	
	printArray(arr);
	}
}
