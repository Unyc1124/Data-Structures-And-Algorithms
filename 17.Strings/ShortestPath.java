
/*question: given route containing 4 directions (e.w.s.n), find the shortest
path to reach destination WNEENESENNN*/
//logic
//north y+1; south y-1; east x+1; west x-1
public class ShortestPath {
    public static void main(String[] args) {
        String path = "WEENESENNN";
        System.out.println(getShortestPath(path));
    }

    public static float getShortestPath(String path) {
        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            //South
            if (dir == 'S') {
                y--;
            }
            //North
            else if (dir == 'N') {
                y++;
            }
            //east
            else if (dir == 'W') {
                x--;
            }
            //west
            else {
                x++;
            }
        }
        int X2 = x*x;
        int Y2 =y*y;
        return (float)Math.sqrt(X2+Y2);//math sq rt fxn returns a double value isiliye typecast kia float
    }
}
