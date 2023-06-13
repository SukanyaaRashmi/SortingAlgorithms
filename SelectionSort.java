public class SelectionSort{
    static void sort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min_ele=i;
            for(int j=i+1;j<n;j++){
                 if(arr[j]<arr[min_ele]){
                    min_ele=j;
                 }

                 int temp=arr[i];
                 arr[i]=arr[min_ele];
                 arr[min_ele]=temp;
            }
        }
      }

      static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
      }

      public static void main(String args[]){
        int arr[]={5,4,3,2,1};
        sort(arr);
        display(arr);
      }
}