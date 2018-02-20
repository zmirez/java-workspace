package listStructure;

import java.util.LinkedList;

public class ListStructureExample {

	public static void main(String[] args) {
		// リスト構造を自作する
		MyList list = new MyList();

		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		list.print();
		list.remove(200);
		list.remove(400);
		list.print();

		// java.utilパッケージに用意されているリスト構造を利用
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list2.add(100);
		list2.add(200);
		list2.add(300);
		list2.add(400);
		list2.remove(list2.indexOf(200));
		list2.remove(list2.indexOf(400));
		System.out.printf("list=%s%n", list2.toString());

	}

}

class MyList {
	Cell top;// 先頭のセルへのポインタ
	Cell last;// 最後尾へのポインタ

	// リスト作成コンストラクタ
	MyList() {
		top = null;
		last = null;
	}

	// 整数データのセルをリストの先頭に追加する
	void add(int data) {
		Cell c = new Cell(data);
		if (top == null) {
			top = c;
			last = c;
		} else {
			last.next = c;
			last = c;
		}
	}

	// セルを削除する
	void remove(int data) {
		Cell c = top;
		Cell p = null;
		while (c != null) {
			if (c.data == data) {
				if (c.equals(top)) {
					top = c.next;
				} else {
					p.next = c.next;
				}
				return;
			} else {
				p = c;
				c = c.next;
			}
		}
	}

	// リスト出力
	void print() {
		Cell c = top;
		System.out.print("list={");
		while (c != null) {
			System.out.print(c.data + " ");
			c = c.next;
		}
		System.out.println("}");
	}
}

class Cell {
	int data;// 整数データ
	Cell next;// 次のセルへのポインタ

	// 整数値をもらってのコンストラクタ
	Cell(int data) {
		this.data = data;
		this.next = null;// 次のセルはとりあえず無いとする
	}
}
