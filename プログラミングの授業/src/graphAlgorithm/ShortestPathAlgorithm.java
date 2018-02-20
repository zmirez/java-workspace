package graphAlgorithm;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/** 最短経路問題をDijkstra法で解く */
public class ShortestPathAlgorithm {
	public static void main(String[] args) throws FileNotFoundException {
		// グラフデータをファイルから読み込む
		GraphData data = new GraphData("src/graphAlgorithm/graph1.dat");
		// ダイクストラ法でv0からの最短経路を求める
		DijkstraTable result = GraphAlgorithm.dijkstra(data, 0);
		result.print();
	}

}

class GraphData {
	boolean directed;// 有向グラフならtrue,無向グラフならfalse
	int n;// 点の数
	int m;// 辺の数
	int[][] adjMat;// 隣接行列
	Edge[] edges;// 辺のコストによる昇順列

	static final int INFTY = Integer.MAX_VALUE;// コスト無限大の値
	static final int PHI = -1;// 点の番号が空の場合の値

	GraphData(String fname) throws FileNotFoundException {
		Scanner scan = new Scanner(new File(fname));
		directed = scan.nextBoolean();// 有向グラフか無向グラフかを読み込み
		n = scan.nextInt();// 点の読み込み
		adjMat = new int[n][n];// 逆接行列を作成し、
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				adjMat[i][j] = INFTY;// 非対角には∞を
			}
			adjMat[i][i] = 0;// 対角には0を
		}
		// 読み込みのセパレータの設定（カンマと改行をデータ分割に使用）
		scan.useDelimiter("\\s*,\\s*|" + System.getProperty("line.separator"));

		// 可変長配列？事前に配列の長さを宣言しなくてもよい
		ArrayList<Edge> edgeList = new ArrayList<Edge>();

		m = 0;
		while (scan.hasNext()) {// 辺情報の読み込み開始
			m++;
			int from = scan.nextInt();// どの点から
			int to = scan.nextInt();// どの点へ
			int cost = scan.nextInt();// コストはいくらで
			edgeList.add(new Edge(from, to, cost));
			adjMat[from][to] = cost;
			if (!directed) {// 無向グラフなら、対称の位置にも同じデータを
				adjMat[to][from] = cost;
			}

		}
		scan.close();
		// 辺の集合を、比較器を用いてコスト昇順にソートする
		edges = (Edge[]) edgeList.toArray(new Edge[0]);
		Arrays.sort(edges, new EdgeComparator());
		// edgeList=null;

		// 読み込んだデータを出力
		printData();
	}

	// グラフデータの出力
	private void printData() {
		System.out.println((directed) ? "有向グラフ" : "無向グラフ");
		System.out.printf("点の数=%d%n", n);
		System.out.printf("辺の数=%d%n", m);
		System.out.println("隣接行列");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (adjMat[i][j] == INFTY) {
					System.out.printf("%4s", "∞");
				} else {
					System.out.printf("%4d", adjMat[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println("辺の配列（コスト昇順）");
		for (int i = 0; i < edges.length; i++) {
			edges[i].print();
		}
		System.out.println();
	}

}

// 辺のクラス
class Edge {
	int from;
	int to;
	int cost;

	Edge(int from, int to, int cost) {
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	public void print() {
		System.out.printf("(%d,%d):%d%n", from, to, cost);
	}
}

// 辺をコスト昇順に並び替える際の比較器
class EdgeComparator implements Comparator<Edge> {
	public int compare(Edge e1, Edge e2) {
		if (e1.cost < e2.cost) {
			return -1;
		} else if (e1.cost > e2.cost) {
			return 1;
		} else {
			return 0;
		}
	}
}

// 集合を表す定数の集合
enum Set {
	S, A, U
}

// ダイレクト法の結果を入れるテーブル
class DijkstraTable {
	int[] prev;// 1つ前の点の番号
	int[] dist;// 出発点からその点までの距離
	Set[] set;// アルゴリズム中、どの集合に含まれるか
	// コンストラクタ

	DijkstraTable(int n) {
		prev = new int[n];
		dist = new int[n];
		set = new Set[n];

		for (int i = 0; i < n; i++) {
			prev[i] = GraphData.PHI;
			dist[i] = GraphData.INFTY;// 出発点からのコストは∞
			set[i] = Set.U;// 集合はU
		}
	}

	// ダイクストラテーブルの出力
	void print() {
		System.out.println("ダイクストラ法の計算結果");
		System.out.print("prev:");
		for (int i = 0; i < prev.length; i++) {
			if (prev[i] == GraphData.PHI) {
				System.out.printf("%3s", "Φ");
			} else {
				System.out.printf("%3d", prev[i]);
			}
		}
		System.out.println();
		System.out.print("dist:");
		for (int i = 0; i < dist.length; i++) {
			if (dist[i] == GraphData.INFTY) {
				System.out.printf("%3s", "∞");
			} else {
				System.out.printf("%3d", dist[i]);
			}
		}
		System.out.println();
		System.out.print("set:");
		for (int i = 0; i < set.length; i++) {
			System.out.printf("%3s", set[i]);
		}
		System.out.println();
	}

}

// ダイクストラアルゴリズムの本体
class GraphAlgorithm {
	// グラフのデータ：data,出発点：s
	// 結果として、DijkstraTableを返す
	static DijkstraTable dijkstra(GraphData data, int s) {
		int n = data.n;// 点の数
		int[][] mat = data.adjMat;// 隣接行列

		DijkstraTable table = new DijkstraTable(n);
		int[] prev = table.prev;// この後table.prev[i]という代わりにprev[i]と言えばよくなる
		int[] dist = table.dist;
		Set[] set = table.set;

		// アルゴリズム開始
		dist[s] = 0;// 出発点のコスト（出発点からの距離）を０にする
		set[s] = Set.S;// 出発点を集合sに入れる
		for (int j = 0; j < n; j++) {
			if (mat[s][j] != 0 && mat[s][j] != GraphData.INFTY) {
				prev[j] = s;// その点のprevにsを代入
				dist[j] = mat[s][j];// その点のdistにsからその点までの辺の長さを代入
				set[j] = Set.A;// その点を集合Aに入れる

			}
			// 出発点からの距離が∞でなく、０でない点を探して
		}
		while (true) {
			int next = GraphData.PHI;
			int dmin = GraphData.INFTY;
			for (int i = 0; i < n; i++) {
				if (set[i] == Set.A) {
					if (mat[i][prev[i]] < dmin) {
						next = i;
						dmin = mat[i][prev[i]];
					}
				}
			}
			// 集合Ａに含まれる点を探し、
			// sに最も近い点をnextに取り出し、その距離をdminに取り出す
			if (next == GraphData.PHI)
				break;// もう候補がない場合は、探すのをやめる
			set[next] = Set.S;// 点nextを集合Sに入れる
			for (int i = 0; i < n; i++) {
				if (mat[next][i] != 0 && mat[next][i] != GraphData.INFTY) {// 点nextから到達できる点に対し、
					if (dist[next] + mat[next][i] < dist[i]) {// 現在のnextのdist＋その辺のコストが、この時点のその点のdistを
						prev[i] = next; // 下回ったらその点のprevにnextを代入
						dist[i] = dist[next] + mat[next][i];// その点のdistにdist＋その辺のコストを代入
						set[i] = Set.A;// その点を集合Aに入れる
					}
				}
			}
		}
		return table;
	}

}