//Strongly connected components-Kosarajus Algo

import java.util.*;

public class Scc{

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
        graph[0].add(new Edge(0,2));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));

        graph[2].add(new Edge(2,1));
        graph[3].add(new Edge(3,4));



    }


    public static void topSortUtil(ArrayList<Edge> graph[] ,int curr,boolean vis[],Stack<Integer> s){
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            if(!vis[e.d]){
                topSortUtil(graph,e.d,vis,s);
            }
        }
        s.push(curr);
    }

    public static void kosaraju( ArrayList<Edge> graph[],int v){//O(v+e)
        //step 1- topo sort the graph
        Stack<Integer> st= new Stack<>();
        boolean vis[] = new boolean[v];

        for(int i=0;i<v;i++){
            if(!vis[i]){
                topSortUtil(graph, i, vis, st);
            }
            
        }
        //Step 2- transpose the graph

        ArrayList<Edge> transpose[] = new ArrayList[v];

        for(int i=0;i<graph.length;i++){
            //reinitialise kyuki use krna pd skta h boolean vis ko
            vis[i]=false;
           transpose[i]=new ArrayList<>();
        }

        for(int i=0;i<v;i++){
            // pehle toh sare vertices nikal lo aur v ke liye uske neighbours
            for(int j=0;j<graph[i].size();j++){
                Edge e = graph[i].get(j);
                transpose[e.d].add(new Edge(e.d,e.s));//reverse order me add krna h
            }
        }

        //step 3
        while(!st.isEmpty()){
            int curr = st.pop();
            if(!vis[curr]){
                System.out.println("SCC: ");
                dfs(transpose,curr,vis);
                System.out.println();
            }
        }
    }

    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            Edge e= graph[curr].get(i);
            if(!vis[e.d]){
                dfs(graph,e.d,vis);
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int v= 5;

        ArrayList<Edge> graph[]= new ArrayList[v];
        createGraph(graph);
        kosaraju(graph, v);
    }
}
