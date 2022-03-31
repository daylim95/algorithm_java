import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Sol2606{
  
  private static int node;
  private static int edge;
  private static Map<Integer, Integer> edges = new HashMap<>();
  private static ArrayList<Integer[]> graph = null;
  
  private static void dfs(){
    
    boolean[] visited = new boolean[node];
    for(int i=0;i<node;i++){
      visited[i] = false;
    }

    int infected = 0;


  }

  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    node = scan.nextInt();
    if(node<101){
      edge = scan.nextInt();
      for(int i=0;i<edge;i++){
        int m = scan.nextInt();
        int n = scan.nextInt();
        edges.put(m, n);
      }
      scan.close();
      dfs();
    }else{
      System.out.println("컴퓨터의 수는 100대 이하");
    }
  } 
}