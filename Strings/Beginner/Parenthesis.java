Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are correct in exp.
For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.

Example 1:

Input:
{([])}
Output: 
true
Explanation: 
{ ( [ ] ) }. Same colored brackets can form 
balaced pairs, with 0 number of 
unbalanced bracket.
Example 2:

Input: 
()
Output: 
true
Explanation: 
(). Same bracket can form balanced pairs, 
and here only 1 type of bracket is 
present and in balanced way.
Example 3:

Input: 
([]
Output: 
false
Explanation: 
([]. Here square bracket is balanced but 
the small bracket is not balanced and 
Hence , the output will be unbalanced.
 
 Code:
 Class Solution{
   static boolean parenthesis(String x){
     char ch;
     Stack<String> stack =new Stack<>();
     for(int i=0;i<x.length();i++){
       c=x.charAt(i);
       if(c="(" || c="{" || c="[")
         stack.push();
       else if(stakc.isEmpty())
         return false;
       char top.stack.peek();
       if((top=='[' && c==']) || (top=='{'|| c=='})||(top=="(" && c==")"))
         stack.pop();
       else
         stack.push(c);
     }
   }
  return stack.isEmpty();
 }
 }
   
