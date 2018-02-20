package chapter10;

import java.util.Scanner;

public class Sample10_07 {

	//先生の問題の２１個目
	public static void main(String[] args) {
		Scanner scan = new Scanner (System . in );
		System . out . print ("n を 入 力 し て ： " );
		int n = scan . nextInt ();
		scan . close ();
		for(int i = 1;i<=n;i++){
			if(i%2 != 0){
				if(i%3 != 0){
					if(i%5 != 0){
						System.out.println("2,3,5のいずれの倍数でもない数" + i);
					}
				}
			}
		}
		System.out.println("----------------------------");
		for ( int i =1; i<=n; i++) {
			if ( (i % 3 != 0) &&(i % 2 != 0) && (i % 5 != 0)) {
				System . out . println ( "2,3,5のいずれの倍数でもない数： " + i );
			}
		}
	}

}
