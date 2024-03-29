/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Backtracking;

import java.util.Arrays;
import java.util.List;

public class Library {
    class Main {
        List<List<Integer>> result;
        public List<List<Integer>> permute(int[] nums) {
            permute(nums , null, 0);
            return result;
        }



        public void permute(int[] nums, Integer[] tempArr, int index) {
            if(index>= nums.length){
                result.add(List.of(tempArr));
                return ;
            }

            for (int i = 0; i < nums.length; i++) {
                if( tempArr[i]==null){
                    tempArr[i]= nums[index];
                    Integer[] tempArr2=  Arrays.copyOf(tempArr,tempArr.length);
                    permute( nums,  tempArr2,  ++index);
                }
            }
        }
        public void main(String[] args) {
            System.out.println("Hello world!");
        }
    }

/*
[1, 2, 3, 4, 5]

1 _ _ _ _
  1 2 _ _ _
    1 2 3 _ _
      1 2 3 4 5
      1 2 3 5 4
    1 2 _ 3 _
    1 2 _ _ 3
  1 _ 2 _ _
  1 _ _ 2 _
  1 _ _ _ 2
_ 1 _ _ _
_ _ 1 _ _
_ _ _ 1 _
_ _ _ _ 1



*/
}
