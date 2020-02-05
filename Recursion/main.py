def is_integer(n):
    try:
        float(n)
    except ValueError:
        return False
    else:
        return float(n).is_integer()


def recursion():
    integer =0
    integer = input("Enter integer ")
    if is_integer(integer):
        return int(integer)+recursion()
    else:
        return 0


val = recursion()
print(val)
