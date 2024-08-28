import java.lang.reflect.Method;

class Marathons {
    public static int Method(String[] names,int[] times){
        int len = names.length;
        int max = times[0];
        int num = 0;
        for(int i = 0;i < len;i++){
            if(max < times[i]){
                num = i;
                max = times[i];
            }
        }

        return num;
    }
    public static void main(String[] arguments){
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341,273,278,329,455,402,388,275,243,344,412,393,299,
                343,317,265
        };

        for(int i = 0;i < names.length;i++){
            System.out.println(names[i] + ":" + times[i]);
        }

        int tmp = Method(names,times);
        System.out.println("");
        System.out.println(names[tmp] + ":" + times[tmp]);

    }
}
