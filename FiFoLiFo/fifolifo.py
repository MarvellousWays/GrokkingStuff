print("hello world")

arr = []
for i in range(10):
    arr.append(i*i)

arr.pop()           # last in first out

arr.reverse()   #
arr.pop()       # first in first out
arr.reverse()   #

for i in arr:
    print(i)
