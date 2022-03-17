input = "abcba"


def is_palindrome(string):
    if string[0:1] != string[len(string)-1:len(string)]:
        return False
    if len(string) == 2 or len(string) == 1:
        return True

    return is_palindrome(string[1:-1])


print(is_palindrome(input))