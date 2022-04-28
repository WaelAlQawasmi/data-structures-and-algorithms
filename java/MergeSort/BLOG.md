> Input ARRAY ->[2, 3, 5, 7, 13, 11]

after pass to  Mergesort function it devided to lift and right arrays
and the lift divided to other let and right ...
 
1. lift of  ARR[2, 3, 5]  L of lift [2]   right of lift[3, 5]  lift of right of list[3] 
  right of right of lift of ARR [5]
2. MARGIED FROM LIFT  TO RIGHT [3, 5]
3. RIGHT OF LIFT ARR [3, 5]
1.MARGIED FROM LIFT  TO RIGHT[2, 3, 5]
1.devided the right side of ARR to lift and right  like in point _*1*_  ARR[7, 13, 11]  L[7]   ARR[13, 11]  L[13]  R[11]
4. MARGIED[11, 13]
5. MARGIED[7, 11, 13]
6. ARR MARGIED[2, 3, 5, 7, 11, 13]

>Output [2, 3, 5, 7, 11, 13]