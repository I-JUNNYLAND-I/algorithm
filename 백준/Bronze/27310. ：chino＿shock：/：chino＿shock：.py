total = input()
s = total.split("_")
colon = 0
length = len(total)
underscore = len(s) - 1
for w in total:
    if ":" == w:
        colon += 1
print(underscore * 5 + colon + length)
