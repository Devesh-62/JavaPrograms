Input: 
n = 5 
A[] = {1,3,5,2,2} 
Output: 3 
Explanation: For second test case 
equilibrium point is at position 3 
as elements before it (1+3) = 
elements after it (2+2). 
 

Example 2:

Input:
n = 1
A[] = {1}
Output: 1
Explanation:
Since its the only element hence
its the only equilibrium point.

  code:
public static int equilibriumPoint(long arr[], int n) {
        if(n<=1){
            return 1;
        }
        int a =0;
        int b =n-1;
        long sumleft =arr[0];
        long sumright =arr[n-1];
        while(a<=b){
            if(sumleft==sumright && (a-b)==0){
                return a+1;
            }
            else if(sumleft<sumright){
                a++;
                sumleft +=arr[a];
            }
            else if(sumleft>sumright){
                b--;
                sumright += arr[b];
            }
            else{
                a++;
                b--;
                sumleft +=arr[a];
                sumright +=arr[b];
            }
        }
        return -1;
    }
