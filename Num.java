public class Num{
	public static void main(String[] args) {
		int[] dig={4,2,9,7,3,8,5};
		int n=dig.length;
		int remNum=3;

		
		 boolean findDuplicates = findDuplicate(dig,n);
        System.out.println("Array has no duplicates: " + findDuplicates);


        int[] remove = removeNum(dig , n, remNum);

        for (int i = 0; i < remove.length; i++) {
            System.out.print(remove[i]);
            
    }
 
        


		
		}

		public static boolean findDuplicate(int[] dig,int n) {
			
		
		for (int i= 0;i<n ;i++  ) {
			for (int j=i+1;j<n ;j++ ) {
				if(dig[i]==dig[j]){
					return false;
					
				}

				}
				
			}
			return true;
			
		}


		public static int[] removeNum(int[] dig ,int n,int remNum) {

			int count=0;
			for(int i=0; i<n;i++){
				if(dig[i]!=remNum){
				count++;
			}

			}
			 int[] newArray = new int[count];
             int index = 0;

        
        for (int i = 0; i < n; i++) {
            if (dig[i] !=remNum) {
                newArray[index++] = dig[i];
            }
        }

        return newArray; 
    }

			
		
	}