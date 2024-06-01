import java.util.*;

public class JobSeq {
    static class Job{
        int deadline;
        int profit;
        int id;//0-A,1-B,2-C

        public Job(int i,int d,int p){
            this.id=i;
            this.deadline=d;
            this.profit=p;

            // id=id; aise bhi kr skte h initialise
            // deadline=d;
            // profit=p;
        }
    }
    public static void main(String args[]){
        int jobInfo[][]={{4,20},{1,10},{1,40},{1,30}};
        //ek array jobs ka jisme boho sare jobs h
        // Job jobs[] = new Job[jobInfo.length];
        //Arraylist banana better optin h

        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0;i<jobInfo.length;i++){
            jobs.add(new Job(i,jobInfo[i][0],jobInfo[i][1]));
        }
        //objects ko sort karne ka function known as lambda fxn 
        // Collections.sort(jobs, (obj1,obj2) -> obj1.profit-obj2.profit); //ascending order 
        Collections.sort(jobs, (obj1,obj2) -> obj2.profit-obj1.profit);//descending order
        
        ArrayList<Integer> seq = new ArrayList<>();
        int time =0;
        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadline > time ){
                seq.add(curr.id);
                time++;
            }

        } 
        //print seq
        System.out.println("Max jobs = "+seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
    }
}
