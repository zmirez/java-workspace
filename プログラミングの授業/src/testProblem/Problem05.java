package testProblem;

public class Problem05 {

	public static void main(String[] args) {
		int[][] point = { { -192, 172 }, { -113, -127 }, { 125, 157 }, { 137, -127 }, { 8, 23 }, { 107, -61 },
				{ 102, 89 }, { 31, -161 }, { -182, 78 }, { -16, -47 }, { 89, 83 }, { 56, 62 }, { 183, -95 },
				{ -135, -45 }, { 182, 54 }, { 25, -78 }, { -134, -154 }, { -153, -18 }, { -6, 60 }, { -109, 62 },
				{ -151, 155 }, { -169, 109 }, { 64, 6 }, { 191, 163 }, { 81, -59 }, { 164, -197 }, { -156, -96 },
				{ 104, 29 }, { -1, 163 }, { -44, -74 }, { 7, 177 }, { -189, 5 }, { 6, 141 }, { -51, 124 },
				{ -107, -140 }, { -7, -193 }, { 49, -186 }, { 116, -160 }, { -76, 143 }, { -21, -74 }, { 133, -166 },
				{ 175, 153 }, { 65, -48 }, { 190, -176 }, { 145, 54 }, { 101, 136 }, { -26, 9 }, { -181, 96 },
				{ 43, -123 }, { -185, -77 }, { 113, -125 }, { -47, -178 }, { -44, 54 }, { 139, -13 }, { 63, -196 },
				{ 99, 68 }, { -123, -19 }, { -6, -179 }, { -81, 136 }, { 132, 169 }, { -128, -123 }, { 131, 115 },
				{ -3, -172 }, { 197, -43 }, { -96, 112 }, { 164, -163 }, { 143, -135 }, { 5, -44 }, { -8, 52 },
				{ -188, 90 }, { 70, 163 }, { -149, 107 }, { -14, 93 }, { 98, -38 }, { -188, -123 }, { 185, 70 },
				{ -89, -142 }, { 30, 58 }, { -87, -56 }, { -125, -173 }, { -70, 17 }, { -96, -101 }, { -137, -13 },
				{ 193, -140 }, { -102, 116 }, { 148, -96 }, { 174, 176 }, { 47, -175 }, { 146, 68 }, { -138, -76 },
				{ 21, -3 }, { 109, -20 }, { 74, -110 }, { 161, 51 }, { 46, -78 }, { -39, 113 }, { -8, -52 },
				{ -121, -130 }, { 31, 125 }, { 86, 10 }, { 181, 89 }, { 141, 81 }, { 52, 41 }, { -142, 5 }, { 20, 114 },
				{ -36, 48 }, { -172, -96 }, { -64, -128 }, { 149, 186 }, { -7, -195 }, { -142, -115 }, { 22, -13 },
				{ -87, -180 }, { -74, -103 }, { 62, 131 }, { 192, 17 }, { 58, -159 }, { 141, 150 }, { 143, -42 },
				{ 149, 78 }, { -78, 173 }, { 87, 173 }, { -45, 79 }, { 29, -197 }, { 95, 29 }, { 127, 86 },
				{ -89, -73 }, { 82, 73 }, { -9, -16 }, { 23, 64 }, { -84, 161 }, { -130, -149 }, { -96, -122 },
				{ 134, 193 }, { -150, 195 }, { 121, -136 }, { -12, -155 }, { -81, -157 }, { -106, -140 }, { 49, 184 },
				{ -62, -182 }, { 26, -158 }, { -72, 28 }, { -97, 46 }, { 18, 196 }, { -54, 51 }, { 78, -92 },
				{ 151, -47 }, { 196, 31 }, { 115, -169 }, { -150, 45 }, { 49, -188 }, { -155, 13 }, { -142, -188 },
				{ 142, 131 }, { 21, 143 }, { 167, 18 }, { -161, -165 }, { 144, 61 }, { -18, -81 }, { -1, -105 },
				{ -186, 86 }, { 39, -56 }, { -156, -141 }, { 159, -139 }, { 168, 102 }, { 105, 91 }, { 121, 148 },
				{ -16, 165 }, { -189, 48 }, { 134, 108 }, { -106, 0 }, { -170, -191 }, { -73, -29 }, { -28, -93 },
				{ -164, -162 }, { 177, 175 }, { -53, 4 }, { 86, -51 }, { 156, 112 }, { 111, -46 }, { -160, -163 },
				{ -35, 162 }, { 180, 112 }, { 28, -181 }, { 97, -161 }, { -125, -175 }, { 12, -174 }, { -72, -166 },
				{ 94, -70 }, { -45, 62 }, { -8, -25 }, { -50, -142 }, { 15, -3 }, { -22, -144 }, { -194, -120 },
				{ -88, 124 }, { 23, 146 }, { -17, -200 }, { 87, -104 } };
		int[][] x = new int[point.length][point[0].length];
		int a = 0;
		int b = 0;
		for (int i = 0; i < x.length; i++) {
			exit: for (int k = 0; k < point.length; k++) {
				if (point[k][0] >= 0 && point[k][1] >= 0) {
					x[i][0] = point[k][0];
					x[i][1] = point[k][1];
					break exit;
				}
			}
		}
		for (int j = 0; j < x.length; j++) {
			a += x[j][0];
			b += x[j][1];
		}

		System.out.println("第１象限に入る点集合の重心座標は、(" + a / x.length + "," + b / x.length + ")");

	}

}
