
# Most Repeated Digit
Given an array of integers a, your task is to calculate the digits that occur the most number of times in the array. Return the array of these digits in ascending order.

## Example

- For a = [25, 2, 3, 57, 38, 41], the output should be solution(a) = [2, 3, 5].

Here are the number of times each digit appears in the array:

- 0 -> 0
- 1 -> 1
- 2 -> 2
- 3 -> 2
- 4 -> 1
- 5 -> 2
- 6 -> 0
- 7 -> 1
- 8 -> 1
- The most number of times any number occurs in the array is 2, and the digits which appear 2 times are 2, 3 and 5. So the answer is [2, 3, 5].




Given an integer n and an array a of length n, your task is to apply the following mutation to a:

Array a mutates into a new array b of length n.
- For each i from 0 to n - 1, b[i] = a[i - 1] + a[i] + a[i + 1].
- If some element in the sum a[i - 1] + a[i] + a[i + 1] does not exist, it should be set to 0. For example, b[0] should be equal to 0 + a[0] + a[1].
##  Example

- For n = 5 and a = [4, 0, 1, -2, 3], the output should be solution(n, a) = [4, 5, -1, 2, 1].

- b[0] = 0 + a[0] + a[1] = 0 + 4 + 0 = 4
- b[1] = a[0] + a[1] + a[2] = 4 + 0 + 1 = 5
- b[2] = a[1] + a[2] + a[3] = 0 + 1 + (-2) = -1
- b[3] = a[2] + a[3] + a[4] = 1 + (-2) + 3 = 2
- b[4] = a[3] + a[4] + 0 = (-2) + 3 + 0 = 1
- __So, the resulting array after the mutation will be [4, 5, -1, 2, 1].__
