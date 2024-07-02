import java.util.*;

public class Dfs {
       static class Edge{
        int src,dest,wt;

        public Edge(int src,int dest,int wt){
            this.src=src;
            this.dest=dest;
            this.wt=wt;
        }
    }
    public static void main(String args[]){
        int V=7;
        @SuppressWarnings("unchecked")
        ArrayList<Edge> graph[] = new ArrayList[V];//null->empty arraylist
         for(int i=0;i<V;i++){
            graph[i]=new ArrayList<>();
         }

         //0-vertex
         graph[0].add(new Edge(0,1,1));
         graph[0].add(new Edge(0,2,1));

         
         graph[1].add(new Edge(1,3,5));//1
        

         graph[2].add(new Edge(2,0,1));//2
         graph[2].add(new Edge(2,4,1));//2
        

         graph[3].add(new Edge(3,1,3));//3
         graph[3].add(new Edge(3,4,1));//3
         graph[3].add(new Edge(3,5,1));//3

         graph[4].add(new Edge(4,2,2));//4
         graph[4].add(new Edge(4,3,2));//4
         graph[4].add(new Edge(4,5,2));//4

         graph[5].add(new Edge(5,3,2));//5
         graph[5].add(new Edge(5,4,2));//5
         graph[5].add(new Edge(5,6,2));//5
     
      System.out.println(hasPath(graph,0,5,new boolean[V])); 
        }
public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
    System.out.println(curr+" ");
    vis[curr]=true;
    for(int i=0;i<graph[curr].size();i++){
        Edge e= graph[curr].get(i);
        if(!vis[e.dest]){
            dfs(graph,e.dest,vis);
        }
    }
}
        public static boolean hasPath(ArrayList<Edge> graph[],int src,int dest,boolean vis[]){
            if(src==dest){
                return true;
            }
            vis[src]=true;
            for(int i=0;i<graph[src].size();i++){
              Edge e = graph[src].get(i);
              if(!vis[e.dest] && hasPath(graph, e.dest, dest, vis)){
                return true;
              }
            }
            return false;
           
        }
}


