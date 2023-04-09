
def  k_diff_pairs (input, k ,exept):
    digits ={}
    result =[]
    for digit in input:
        diff= k-digit
        if digit == exept:
            continue
        if diff in digits:

            result.append([diff, digit])
        else:
            digits[digit] = digit
    return result


def findTriplets(input, k):
    result = []
    for digit in input:
        diff = k - digit
        pars_result = k_diff_pairs(input, diff, digit)
        if len(pars_result) > 0:
            for pars in pars_result:
                pars.append(digit)
                pars.sort()
                if pars not in result:
                    result.append(pars)
    return result


digits = [1, 2, 3, 4, 5, 6]
k = 9
print(findTriplets(digits, k))








