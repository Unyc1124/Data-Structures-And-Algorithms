    import java.util.ArrayList;

    public class Articulation {

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
        graph[0].add(new Edge(0,1));
        graph[0].add(new Edge(0,3));

        graph[1].add(new Edge(1,0));
        graph[1].add(new Edge(1,2));

        graph[2].add(new Edge(2,1));
        graph[2].add(new Edge(2,0));

        graph[3].add(new Edge(3,0));
        graph[3].add(new Edge(3,4));

        graph[4].add(new Edge(14,3));




    }

    //main fxn which is actually dfs
    public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[],int dt[],int lt[],int parent,int time){
        vis[curr]=true;
        dt[curr]=lt[curr]=++time;
        int children =0;

        for(int i=0;i<graph[curr].size();i++){
            Edge e = graph[curr].get(i);
            int neigh = e.d;

            if(parent == neigh){
                continue;

            }else if(vis[neigh]){
                lt[curr]=Math.min(lt[curr],dt[neigh]);
            }else{
                dfs(graph,neigh,vis,dt,lt,curr,time);
                lt[curr]=Math.min(lt[curr],lt[neigh]);

                if(lt[neigh]>=dt[curr] && parent!=-1){
                    System.out.print(curr+" ");
                }
                children++;
            }

        }
        //codn 1 
        if(parent==-1 && children>1){
            System.out.print(curr+" ");
        }

    }

    public static void getAP(ArrayList<Edge> graph[],int v){
        int dt[]=new int[v];
        int lt[]=new int[v];
        int time=0;
        boolean vis[]=new boolean[v];

        for(int i=0;i<v;i++){
            if(!vis[i]){
                //dfs
                dfs(graph, i, vis, dt, lt, -1, time);
            }
        }


    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int v= 5;

        ArrayList<Edge> graph[]= new ArrayList[v];
        createGraph(graph);

        getAP(graph, v);
    }


    }
