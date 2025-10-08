public class LexicographicallySelectionSort {
    public static void main(String[] args) {
        String [] fruits={"kiwi","mango","apple","papaya","banana"};
        int a=fruits.length;
        for (int i = 0; i < a-1; i++) {
            int minOfindex=i;
            for (int j = i+1; j <a ; j++) {
                if (fruits[j].compareTo(fruits[minOfindex])<0){
                    minOfindex=j;
                }
                 String temp=fruits[i];
                fruits[i]=fruits[minOfindex];
                fruits[minOfindex]=temp;
            }
        }
        for (String fruit:fruits){
            System.out.print(fruit+" ");
        }
    }
}
