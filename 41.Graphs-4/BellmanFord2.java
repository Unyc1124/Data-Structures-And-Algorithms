import java.util.*;
public class BellmanFord2 {

    static class Edge{
        int src,dest,wt;

        public Edge(int s,int d,int w){
            this.src=s;
            this.dest=d;
            this.wt=w;
        }
    }

    
    public static void createGraph2(ArrayList<Edge> edges){
       edges.add(new Edge(0,1,2));
       edges.add(new Edge(0,2,4));

       edges.add(new Edge(1,2,-4));

       edges.add(new Edge(2,3,2));

       edges.add(new Edge(3,4,4));

       edges.add(new Edge(4,1,-1));
    }

    

    //bellman with graph thoda easy
    public static void bellmanFord2(ArrayList<Edge> edges,int src,int V){
        int dist[]=new int[V];
        for(int i=0;i<dist.length;i++){
            if( i != src){
                dist[i]=Integer.MAX_VALUE;//infinity initialization
            }
        }
       
        //Algorithm

        for(int i=0;i<V-1;i++){//-> O(V)
            //edges-O(E)
          
                for(int k=0;k<edges.size();k++){
                    Edge e = edges.get(k);//edge ki value yaha se u,v ki value milegi
                    int u=e.src;
                    int v=e.dest;
                    int w=e.wt;
                    if(dist[u]!=Integer.MAX_VALUE && dist[u]+w<dist[v]){//dist[u]!=Integer.MAX_VALUE imp condn kyuki java me infinity me add kia toh -ve
                        dist[v]=dist[u]+w;
                    }
                }
            
        }
        //print
        for(int i=0;i<dist.length;i++){
           
            System.out.print(dist[i]+" ");
        }
        System.out.println();

    }

    
    public static void main(String args[]){
    
        //ArrayList<Edge> graph[]= new ArrayList[V];  
        //alternative graph method 
        ArrayList<Edge> edges= new ArrayList<>();  

        
        createGraph2(edges);
        bellmanFord2(edges, 0,5);
    }
 } 


