import java.util.*;
//Bridge in graphs

public class Bridge {

    static class Edge{
        int s,d;

        public Edge(int s,int d){
            this.s=s;
            this.d=d;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[]){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }

    }
    public static void main(String args[]){
        ArrayList<Edge> graph[]= new ArrayList[5];
        createGraph(graph);
    }
}
