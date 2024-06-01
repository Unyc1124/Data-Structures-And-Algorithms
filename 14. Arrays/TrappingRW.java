public class TrappingRW {
    public static void main(String args[]){//O(n)
        int height[]={4,2,0,6,3,2,5};
        System.out.println(trappedRainWater(height));
    }
    public static int trappedRainWater(int height[]){
        //calculate left max boundary-array
        int LMB[]=new int[height.length];
        LMB[0]=height[0];
        for(int i=1;i<height.length;i++){
            LMB[i] = Math.max(height[i],LMB[i-1]);
        }
        //calculate right max boundary-array
        int RMB[]=new int[height.length];
        RMB[height.length-1]=height[height.length-1];
        for(int i=height.length-2;i>=0;i--){
            RMB[i] = Math.max(height[i],RMB[i+1]);
        }
        int TrappedWater =0;
        //loop
        for(int i =0;i<height.length;i++){
            //waterlevel = min(leftmax,rightmax)
           int waterLevel = Math.min(LMB[i],RMB[i]);

           //trapped water = waterlevel -height[i]
         TrappedWater += waterLevel - height[i] ;
        }
        return TrappedWater;
    }
}
