public class Books1 {
    public static void main(String[] args) {
        int time = 5;
        int book = 4;
        int[] arr = {3,1,2,1};

        int s = 0, j = 0;
        for(int i=0;i<book;i++){
            s+=arr[i];
            if(s>time){
                s-=arr[j];
                j++;
            }
        }
        System.out.println(book-j);
    }
}
