def one(s, t):
  if t in s:
    a = [len(t[:i]) for i in range(1, int(len(t)**.5)+1) if t.count(t[:i]) == (len(t)/len(t[:i]))]
    print(a)
    return min(a) if a else len(t)
  else: return -1

def two(s, t):
  if t in s:
    a = [len(t[:i]) for i in range(1, len(t)+1) if s.count(t[:i]) == (len(s)/len(t[:i]))]
    return min(a) if a else -1
  else: return -1

def findSmallestDivisor(s, t):
  return one(s,t) if len(s) > 75000 else two(s, t)

print(findSmallestDivisor("rbrb", "rbrb"))