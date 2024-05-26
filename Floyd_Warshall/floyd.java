package Floyd_Warshall;

import java.util.*;

public class floyd {
    public static final int INF = (int) 1e9;
    public static int n, m;
    public static int[][] graph;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        graph = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(graph[i], INF);
        }
        //del if finding loop
        for (int i = 0; i < n; i++) {
            graph[i][i] = 0;
        }
        for (int i = 0; i < m; i++) {
            int a = sc.nextInt() - 1;
            int b = sc.nextInt() - 1;
            int c = sc.nextInt();

            graph[a][b] = c;
        }

        for (int i = 0; i < n; i++) {
            for (int e = 0; e < n; e++) {
                for (int j = 0; j < n; j++) {
                    graph[i][j] = Math.min(graph[i][j], graph[i][e] + graph[e][j]);
                }
            }
        }

        for (int i = 0; i < n; i++) {
            for (int e = 0; e < n; e++) {
                if (graph[i][e] == INF) {
                    System.out.print("0 ");
                } else {
                    System.out.print(graph[i][e] + " ");
                }
            }
            System.out.println();
        }
        sc.close();
    }
}