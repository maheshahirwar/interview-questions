package set_matrix_zeros;

public class SetMatrixZeros {

	public static void main(String[] args) {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
		setMatrixZeros(matrix);
		System.out.println("Matrix after setting zeros:");
		for (int[] row : matrix) {
			for (int val : row) {
				System.out.print(val + " ");
			}
			System.out.println();
		}

	}

	private static void setMatrixZeros(int[][] matrix) {
		int n = matrix.length;
		int m = matrix[0].length;
		int[] rows = new int[n];
		int[] cols = new int[m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (matrix[i][j] == 0) {
					rows[i] = 1;
					cols[j] = 1;
				}
			}
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (rows[i] == 1 || cols[j] == 1) {
					matrix[i][j] = 0;
				}
			}
		}

	}

}
