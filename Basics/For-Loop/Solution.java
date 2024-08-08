/* Nth Fibonacci Number
Easy
Asked in companies

Problem statement
The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -

F(n) = F(n - 1) + F(n - 2),
Where, F(1) = 1, F(2) = 1

Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.

"Indexing is start from 1"


Example :
Input: 6

Output: 8

Explanation: The number is ‘6’ so we have to find the “6th” Fibonacci number. So by using the given formula of the Fibonacci series, we get the series:
[ 1, 1, 2, 3, 5, 8, 13, 21]
So the “6th” element is “8” hence we get the output.
Detailed explanation ( Input/output format, Notes, Images )
Sample Input 1:
6


Sample OutputGeeks
8


Explanation of sample input 1 :
The number is ‘6’ so we have to find the “6th” Fibonacci number.
So by using the given formula of the Fibonacci series, we get the series:
[ 1, 1, 2, 3, 5, 8, 13, 21]
So the “6th” element is “8” hence we get the output.


Expected time complexity :
The expected time complexity is O(n).


Constraints:
1 <= 'n' <= 10000
Where ‘n’ represents the number for which we have to find its equivalent Fibonacci number.

Time Limit: 1 second */

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n == 1 || n == 2) {
            System.out.println(1);
            return;
        }

        int[] a = new int[n];
        a[0] = 1; // F(1)
        a[1] = 1; // F(2)

        for (int i = 2; i < n; i++) {
            a[i] = a[i - 1] + a[i - 2];
        }

        System.out.println(a[n - 1]);
    }
}
