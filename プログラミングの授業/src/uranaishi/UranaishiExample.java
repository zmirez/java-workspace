package uranaishi;

import java.util.InputMismatchException;
import java.util.Scanner;

/*いい加減な占い師を作成*/
public class UranaishiExample {
	public static void main(String[] args) {
		Uranaishi uranaishi = new Uranaishi("神楽坂の父");
		uranaishi.start();
		uranaishi.end();
	}
}

class Uranaishi {
	String name;

	Uranaishi(String name) {
		this.name = name;
	}

	void start() {
		System.out.println("わしは" + name + "じゃ。占ったる。");
		int month = 0;
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("誕生月を入れよ。");
			try {
				month = scan.nextInt();
				if (month >= 1 && month <= 12) {
					scan.close();
					break;
				}
				errorMessage();
			} catch (NumberFormatException nfe) {
				errorMessage();
			} catch (InputMismatchException ime) {
				errorMessage();
			}
			scan.next();
		}
		System.out.println("誕生月は" + month + "月じゃな。");
		System.out.print("うーむ。今日のそなたの運勢は");
		System.out.println("『" + fortune(month) + "』と出ておる。ご注意なされよ。");
	}

	void errorMessage() {
		System.out.println("まじめに答えよ。");
	}

	String fortune(int month) {
		String fortune;
		switch ((int) (Math.random() * 6)) {
		case 0:
			fortune = "大吉";
			break;
		case 1:
			fortune = "中吉";
			break;
		case 2:
			fortune = "凶";
			break;
		default:
			fortune = "吉";
			break;
		}
		return fortune;
	}

	void end() {
		System.out.println("占い料はサービスだよ");
	}

}
