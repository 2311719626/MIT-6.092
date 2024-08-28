public class auto {
    public static void main(String[] args){
        int[] data = new int[5];
        for(int i = 0;i < 5;i++){
            data[i] = i;
        }
        for(int x:data){
            System.out.println(x);
        }
    }
}
