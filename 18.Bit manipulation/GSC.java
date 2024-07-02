//get set clear updateith bit

public class GSC {
    public static void main(String args[]){
        int n =10;
        System.out.println(clearRangeBit(n, 2,4));//11111110Bit(n, 2,1));

    }

    public static int getBit(int n, int i){
        int bitMask = 1 << i;
        if((n & bitMask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int setBit(int n, int i){
        int bitMask = 1 << i;
        return (n | bitMask);
    }

    public static int clearBit(int n, int i){
        int bitMask = ~(1 << i);
        return (n & bitMask);
    }

    public static int updateBit(int n, int i, int v){
        // if(v == 0){
        //     return clearBit(n, i);
        // }else{
        //     return setBit(n, i);
        // }

        n = clearBit(n, i);
        int bitMask = v << i;
        return n|bitMask;
        }

        //clear last ith bit
        public static int clearLastIthBit(int n, int i){//11111111=(-1)or ~0
            int bitMask = (~0) << i;
            return (n & bitMask);
        }

        //clear range of bits
        public static int clearRangeBit(int n,int i,int j){
            int a=((~0)<<(j+1));
            int b=((1<<i)-1);

            int bitMask=a|b;
            return (n & bitMask);
        }
    
}
