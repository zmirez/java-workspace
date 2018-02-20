package chapter01;
/*
 * 最初のjavaプログラム
 * 作者：甲田未來
 */
public class Sample01_01 {

	public static void main(String[] args) {
		System.out.println("Hello World");//この行のコメント
		System.out.println(10+20);
		System.out.println("甲田未來");
		System.out.println(1000000000000000L);  // Long型整数リテラル
		System.out.println( 0x7f );  //16進数
		System.out.println( 0117 );  //8進数
		System.out.println( 0b011111 );  //2進数
		System.out.println( 1234e-2 );  //指数表記
		System.out.println((char)('あ'+ 1));
		System.out.println('\u7654');
		System.out.println("12\\34567890\t987\n834");
		System.out.println("");  //('')は不可能
		System.out.println(true); //論理値リテラル
	}

}
