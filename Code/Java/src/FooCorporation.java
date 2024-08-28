class FooCorporation {
    public static void Method(double base,double hour){
        if(hour > 60){
            System.out.println("Too tired!!!");
            return;
        }
        if(base < 8){
            System.out.println("Too little salary!!!");
            return;
        }
        double baseS = Math.min(hour,40) * base;
        double addS = Math.max(hour - 40,0) * base * 1.5;
        System.out.printf("Your salary is %f\n",baseS + addS);
    }
    public static void main(String[] arguments){
        Method(7.5,35);
        Method(8.2,47);
        Method(10.0,73);

    }
}
