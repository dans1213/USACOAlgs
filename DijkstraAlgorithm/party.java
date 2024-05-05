// package DijkstraAlgorithm;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileReader;
// import java.io.IOException;
// import java.io.PrintWriter;
// import java.util.*;

// public class party {
// public static int n, m, start;
// static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
// static final int inf = Integer.MAX_VALUE;
// public static int[] d = new int[100001];
// public static void main(String[] args) throws IOException{
// BufferedReader br = new BufferedReader(new FileReader("party.in"));
// StringTokenizer tokenizer = new StringTokenizer(br.readLine());
// PrintWriter pw = new PrintWriter(new File("party.out"));
// int n = Integer.parseInt(tokenizer.nextToken());
// int m = Integer.parseInt(tokenizer.nextToken());
// int x = Integer.parseInt(tokenizer.nextToken());
// for ( int i=0;i<=n;i++){
// graph.add(new ArrayList<Node>());
// }
// int[][] save = new int[m][3];
// for(int i=0;i<m;i++){
// tokenizer = new StringTokenizer(br.readLine());
// save[i][0] = Integer.parseInt(tokenizer.nextToken());
// save[i][1] = Integer.parseInt(tokenizer.nextToken());
// save[i][2] = Integer.parseInt(tokenizer.nextToken());

// graph.get(save[i][0]).add(new Node(save[i][1],save[i][2]));
// }
// dijkstra(x);
// int[] temp=d.clone();
// d = new int[100001];
// for(int i=0;i<m;i++){
// graph.get(save[i][0]).add(new Node(save[i][2],save[i][1]));
// }
// dijkstra(x);
// int ans=0;
// int size=0;
// for (int i=0;i<temp.length;i++){
// if(size<temp[i]+d[i]){
// ans=i;
// size=temp[i]+d[i];
// }
// }
// System.out.println(ans);
// }
// public static void dijkstra(int start){
// d[start]=0;
// PriorityQueue<Node> pq = new PriorityQueue<Node>();
// pq.offer(new Node(start, 0));
// while(!pq.isEmpty()){
// Node node = pq.poll();
// int index=node.getIndex();
// int distance = node.getDistance();

// if(d[index] < distance) continue;

// for (int i=0;i<graph.get(index).size();i++){
// int dist = d[index] + graph.get(index).get(i).getDistance();

// if(dist<d[graph.get(index).get(i).getIndex()]){
// d[graph.get(index).get(i).getIndex()] = dist;
// pq.offer(new Node(graph.get(index).get(i).getIndex(),dist));
// }
// }
// }
// }
// }
// class Node implements Comparable<Node> {
// private int distance;
// private int index;
// public Node(int distance, int index){
// this.distance=distance;
// this.index=index;
// }
// public int getDistance(){
// return this.distance;
// }
// public int getIndex(){
// return this.index;
// }

// @Override
// public int compareTo(Node other){
// if(this.getDistance()<other.getDistance()){
// return -1;
// }
// return 1;
// }
// }
