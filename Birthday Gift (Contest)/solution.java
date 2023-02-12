import java.io.*; // for handling input/output

import java.util.*; // contains Collections framework

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int mat[][] = new int[n][n];

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                mat[i][j] = sc.nextInt();

            }

        }

        String s = sc.next();
        for (int k = 0; k < s.length(); k++) {

            char ch = s.charAt(k);

            for (int i = 0; i < n; i++) {

                for (int j = i; j < n; j++) {

                    int temp = mat[i][j];

                    mat[i][j] = mat[j][i];

                    mat[j][i] = temp;

                }

            }

            if (ch == 'R') {

                for (int i = 0; i < n; i++) {

                    int low = 0;

                    int high = n - 1;

                    while (low < high) {

                        int temp = mat[i][low];

                        mat[i][low] = mat[i][high];

                        mat[i][high] = temp;

                        low++;

                        high--;
                    }
                }
            }
            if (ch == 'L') {

                for (int i = 0; i < n; i++) {

                    int low = 0;

                    int high = n - 1;

                    while (low < high) {

                        int temp = mat[low][i];

                        mat[low][i] = mat[high][i];

                        mat[high][i] = temp;

                        low++;
                        high--;

                    }
                }
            }
        }
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {

                System.out.print(mat[i][j] + " ");

            }

            if (i == n - 1)
                break;
            System.out.println();

        }
    }
}