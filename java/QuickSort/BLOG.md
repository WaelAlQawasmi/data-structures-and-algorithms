# introduction
the array divided to sub array  by Partition methode  
the input array is subArray  the pivot is the upper  index of sub array 
so the  Partition methode relocate the pivot by make swap with lowest item in suparray using  Swap
methode 

## input->[8, 4, 23, 42, 16, 15]
## Partition
- input->[8, 4, 23, 42, 16, 15]
- from index 0 to index 5
- at pivot :15 [8, 4, 23, 42, 16, 15]
- by for loop in Partition make swap with any item less than the pivot
- Swap :15 with 8 
- Swap :15 with 4
-return after  swap[8, 4, 15, 42, 16, 23]
- new subarray
- left 0 right 1

## Partition
- input->[8, 4]
- from index 0 to index 1
- at pivot :4 [8, 4]
- - Swap :4 with 8
return after  swap[4, 8, 15, 42, 16, 23]
- error index because left grater than right
left 0 right -1
- error index because left equal  right
-left 1 right 1
- new subarray  because right grater than left
-left 3 right 5

## Partition

- input->[42, 16, 23]
- from index 3 to index 5
- at pivot :23 [42, 16, 23]
- Swap :23 with 16
- return after  swap[4, 8, 15, 16, 23, 42]
- error index because left equal  right
- left 3 right 3
- error index because left equal  right
-left 5 right 5

## output -> [4, 8, 15, 16, 23, 42]
