public class Q29{
    public static void main(String[] args) {
        int arr[][]={{4,5,6},{7,8,9},{9,10,11}};
        int count=0;
        for (int[] i : arr){
            
                  for(int j :i){
                    System.out.println(j);
                    
                  }
                  count++;
            }
     
        
        System.out.println("The number of 2-D arrays are: "+count);
    }
}