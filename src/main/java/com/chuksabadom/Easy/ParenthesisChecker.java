package com.chuksabadom.Easy;

import java.util.Stack;

/*
Given an expression string x. Examine whether the pairs and the orders of {,},(,),[,] are correct in exp.
For example, the function should return 'true' for exp = [()]{}{[()()]()} and 'false' for exp = [(]).
Note: The drive code prints "balanced" if function return true, otherwise it prints "not balanced".
Example 1:
Input:
{([])}
Output:
true
Explanation:
{ ( [ ] ) }. Same colored brackets can form
balanced pairs, with 0 number of
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

 */
public class ParenthesisChecker {
	//Function to check if brackets are balanced or not.
	static boolean ispar(String x)
	{
		// add your code here
		Stack<Character> st = new Stack<>();
		for(char c:x.toCharArray()){
			if(c == '('){
				st.push(')');
				
			}
			else if(c == '{'){
				st.push('}');
			}
			else if(c== '['){
				st.push(']');
			}
			else if(st.isEmpty() || st.pop()!=c)
			{
				return false;
				
			}
		}
		return st.isEmpty();
	}
	public static void main(String[] args) {
		String arr = "([]{";
		boolean ans = ispar(arr);
		System.out.println("The answer: " + ans);
	}
}
