
public class staircasepyramidofword {
    public static void main(String[] args){
        String arr[]={"I","N","T","E","L","L","I","J"};
        int len = arr.length;
        for (int i=0;i<len;i++){
            for (int j=i;j<len;j++){
                System.out.print(arr[j]+" ");
            }
            System.out.println();
        }

    }
}
