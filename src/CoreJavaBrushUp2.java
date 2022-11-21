import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> cift = new ArrayList<Integer>();
		 int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
		 
		 for (int i =0; i<arr2.length; i++)
		 {
			 if( arr2[i] % 2 == 0) {
			 System.out.println("Çiftler..: "+arr2[i]);
			 cift.add(arr2[i]);

			 }else {
				 System.out.println("tekler..: "+arr2[i]);
			 }
		 }
		 
		 System.out.println(cift.contains(123));
		 
		 
		 
	}

}
