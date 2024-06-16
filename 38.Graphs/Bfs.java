import java.util.*;

public class Bfs {
   

    
        static class Edge{
            int src,dest,wt;
    
            public Edge(int src,int dest,int wt){
                this.src=src;
                this.dest=dest;
                this.wt=wt;
            }
        }
        public static void main(String args[]){
            int V=5;
            @SuppressWarnings("unchecked")
            ArrayList<Edge> graph[] = new ArrayList[V];//null->empty arraylist
             for(int i=0;i<V;i++){
                graph[i]=new ArrayList<>();
             }
    
             //0-vertex
             graph[0].add(new Edge(0,1,5));
    
             
             graph[1].add(new Edge(1,0,5));//1
             graph[1].add(new Edge(1,2,1));//1
             graph[1].add(new Edge(1,3,3));//1
    
             graph[2].add(new Edge(2,1,1));//2
             graph[2].add(new Edge(2,3,1));//2
             graph[2].add(new Edge(2,4,4));//2
    
             graph[3].add(new Edge(3,1,3));//3
             graph[3].add(new Edge(3,2,1));//3
    
             graph[4].add(new Edge(4,2,2));//4
         
             //2'Neighbours
            bfs(graph);
    }

    public static void bfs(ArrayList<Edge> graph[]){
        Queue<Integer> q=new LinkedList<>();
        boolean visited[]=new boolean[graph.length];
        q.add(0);//src=0;

        while(!q.isEmpty()){
            int curr = q.remove();

            if(!visited[curr]){
                System.out.print(curr+" ");
                visited[curr]= true;
                for(int i=0;i<graph[curr].size();i++){
                    Edge e = graph[curr].get(i);
                    q.add(e.dest);
                }
            }
        }
    }
    
    
}
