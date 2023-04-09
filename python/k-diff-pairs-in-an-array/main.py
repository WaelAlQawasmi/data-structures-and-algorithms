def k_diff_pairs_(input, k):
    digits = {}
    for digit in input:
        diff = k - digit
        if diff in digits:
            print(diff, digit)
        else:
            digits[digit] = digit


digits = [1, 2, 3, 4, 5, 6]
k = 7
k_diff_pairs_(digits, k)
