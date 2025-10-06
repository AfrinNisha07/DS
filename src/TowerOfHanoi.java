public class TowerOfHanoi {
    public  static void move(int n ,int startpole ,int endpole){
        if(n==0){
            return;
        }
        int intermediate= 6-(startpole+endpole);
        move(n-1,startpole,intermediate);
        System.out.println("move"+n+" from "+startpole+ " to " +endpole);
        move(n-1,intermediate,endpole);
    }

    public static void main(String[] args) {
        move(3,1,3);
    }

}
