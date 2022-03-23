package Stack;
import java.util.*;

public class MaxRactangle {
    public static int maxHist(int[] hist,int row,int col){
        Stack<Integer> s = new Stack<Integer>();
        s.push(-1);
        int[] right = new int[col];
        int[] left = new int[col];

        for(int i=0;i<col;i++){
            right[i] = col;
            left[i] = -1;
        }

        int maxArea = hist[0];
        int i=0;
        while(i<col){
            while(!s.empty() && s.peek()!=-1 && hist[i]<hist[s.peek()]){
                right[s.peek()] = i;
                s.pop();
            }
            if(i>0 && hist[i]==hist[(i-1)]){
                left[i] = left[(i-1)];
            }else{
                left[i] = s.peek();
            }
            s.push(i);
            i++;
        }
        for(i=0;i<col;i++){
            maxArea = Math.max(maxArea,hist[i]*(right[i]-left[i]-1));
        }

        return maxArea;
    }
    public static int maxRectangle(int[][] arr,int row, int col){
            int hist = maxHist(arr[0],row,col);
            //continue...
            for(int i=1;i<row;i++){
                for(int j=0;j<col;j++){
                    if(arr[i][j]==1){
                        arr[i][j] += arr[i-1][j];
                    }
                }
                hist = Math.max(hist,maxHist(arr[i], row, col));
            }
            return hist;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,1,0},{1,1,1,1},{1,1,1,1},{1,1,0,0}};
        
        int row = 4;
        int col = 4;

        System.out.print(maxRectangle(arr,row,col));
    }
}
