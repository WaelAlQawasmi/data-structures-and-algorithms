def intersection(nums1, nums2):
    result = set()

    for x in nums1:
        if (x in nums2):
            result.add(x)
    return list(result)

print(intersection([1,2,2,1], [2,2]))

