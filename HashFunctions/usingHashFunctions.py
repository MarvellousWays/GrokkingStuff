import hashlib

string = "Hello World"
print(string)

result = hashlib.md5(string.encode())
print("MD5 hash =", result.hexdigest())

result = hashlib.sha1(string.encode())
print("Sha1 hash =", result.hexdigest())

