p,n = map(int, input().split())
a,c = [],0

for i in range(n):
  s = input()
  if(s not in a): 
    a.append(s)
    c += 1
    if(c == p): 
      print(i+1) 
      break
  if(i == n-1): 
    print("paradox avoided")
    break