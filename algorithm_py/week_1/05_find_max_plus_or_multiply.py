input = [0, 3, 5, 6, 1, 2, 4]


def find_max_plus_or_multiply(array):
    result = 0

    for num in array:
        if num <= 1 or result <= 1:
            result += num
        else:
            result = result * num

    return result


result = find_max_plus_or_multiply(input)
print(result)
