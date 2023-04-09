from  tree.Node import Node
from  tree.dfs import *
# def intersection(nums1, nums2):
#     result = set()
#
#     for x in nums1:
#         if (x in nums2):
#             result.add(x)
#     return list(result)

# print(intersection([1,2,2,1], [2,2]))

head= Node("abdel hafez")
head.left=Node("khaleel")
head.left.left=Node("wael")
head.left.right=Node("yazan")
head.right=Node("ali")
head.right.left=Node("omar")
head.right.right=Node("mohammed")

pre_order(head)





