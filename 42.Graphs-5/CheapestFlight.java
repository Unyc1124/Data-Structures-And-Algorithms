import java.util.*;

 public class CheapestFlight {

    static class Edge{
        int src,dest,wt;

        public Edge(int s,int d,int w){
            this.src = s;
            this.dest = d;
            this.wt =  w;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[],int flight[][] ){
        for(int i=0;i<graph.length;i++){
            graph[i]=new ArrayList<>();
        }
        for(int i=0;i<flight.length;i++){
            int src = flight[i][0];
            int dest = flight[i][1];
            int wt = flight[i][2];
            Edge e= new Edge(src,dest,wt);
            graph[src].add(e);
        }
    }

    static class Info{
        int v,cost,stops;

        public Info(int v,int cost,int stops){
            this.v = v;
            this.cost = cost;
            this.stops = stops;
        }
    }
    public static int cheapestFlight(int n,int flight[][],int src,int dest,int k,  ArrayList<Edge> graph[]){
        createGraph(graph,flight);

        int dist[] = new int[n];
        for(int i=0;i<n;i++){
            if( i!= src){
                dist[i]=Integer.MAX_VALUE;
            }
        }

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src,0,0));
        while( !q.isEmpty()){
            Info curr = q.remove();
            if(curr.stops > k){
                break;
            }

            for(int i=0;i<graph[curr.v].size();i++){
                Edge e = graph[curr.v].get(i);
                int v=e.dest,wt=e.wt;
                if(curr.cost + wt < dist[v] && curr.stops <= k){
                    dist[v] = curr.cost + wt;
                    q.add(new Info(v,dist[v],curr.stops+1));
                }
            }
        }
        //dist[dest]
        if(dist[dest] == Integer.MAX_VALUE){
            return -1;
        }else{

            return dist[dest];
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String args[]){
        int n=4;
        int flight[][]={ {0,1,100},{1,2,100},{1,3,600},{2,3,200}};
        int src =0,dest =3, k=1;
        ArrayList<Edge> graph[] = new ArrayList[n];
        System.out.println(cheapestFlight(n, flight, src, dest, k, graph));
       
    }
}
