input = [3, 5, 6, 1, 2, 4]


def find_max_num(array):
    for num in input:
        for num2 in input:
            if num < num2:
                break
        else:
            return num


result = find_max_num(input)
print(result)
