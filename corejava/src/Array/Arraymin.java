package Array;
import java.lang.reflect.Array;

public class Arraymin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int min=0;
		min=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(min>arr[i])
				min=arr[i];
		}
return min;

	}

}
