package BitMan;

class getBit {
    public static void main(String[] args) {
        int n = 5; // 0101 => 0101
        int bitmask = 1;
        System.out.println(bitmask);
        if((bitmask & n) == 0){
        System.out.println("zero");
        }else{
        System.out.println("non zero");
        }

        for (int i = 1; i < 5; i++) {
            bitmask = 1 << i;
            System.out.print(bitmask & n);
        }
    }
}