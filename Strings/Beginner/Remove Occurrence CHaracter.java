class Solution{
 static void removeDuplicates(String S){
   String newString="";
   Stack<Character> stack=new Stack<>();
   
   for(int i=0;i<S.length();i++){
     if(stack.isEmpty()||stack.peek==S.char(i)){
       stack.push(S.charAt(i);
                  newString=newString+S.peek();}}
                  return newString;}}
