import java.util.*;
import java.util.Scanner;

class camelCaseToSnakeCase {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		ArrayList<String> arr = new ArrayList<String>();
		int n = sc.nextInt();
		for(int i=0;i<n;i++){
			String s = sc.next();
           arr.add(s);
		}

           ArrayList<String> arrSolution = new ArrayList<String>();


		for(int i =0;i<n;i++){
			String str = arr.get(i);
			StringBuffer strBuffer = new StringBuffer(str);
			 for(int j=1;j<strBuffer.length();j++){
                   if(Character.isUpperCase(strBuffer.charAt(j))){
                      strBuffer.insert(j,"_");
					  j++;
				 }
			 }
			 str = String.valueOf(strBuffer).toLowerCase();
arrSolution.add(str);
		}

		System.out.println(arrSolution);
		// Your code goes here
	}
}
