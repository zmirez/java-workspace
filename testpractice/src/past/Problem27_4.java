package past;

public class Problem27_4 {

	public static void main(String[] args) {
		int[]a={3,-2,0,5,8,7,1,2,-3,10,9};
		int count = 0;
		for(int i=0;i<11;i++){
			if(a[i]>=2 && a[i]%2==1){
				count += 1;
			}
		}
		System.out.println("2以上の奇数の個数は"+count);

	}

}
