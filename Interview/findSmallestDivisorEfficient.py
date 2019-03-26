def findSmallestDivisor(s, t):
  a = set()
  for i in range(1, int(len(s)**.5)+1):
    if len(s)%i == 0 and len(t) >= i:
      a.add(i); a.add(int(len(s)/i))

  for x in list(a)[::-1]:
    if t*x == s:
      return len(t*x)/x
  return -1

print(returnDiv("rbrb", "rb"))