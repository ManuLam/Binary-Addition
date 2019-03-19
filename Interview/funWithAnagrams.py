def funWithAnagrams(s):
  s1,s2 = [sorted(x) for x in s], []
  ret = []

  for i in range(len(s1)):
    if s1[i] not in s2:
      s2.append(s1[i])
      ret.append(s[i])

  print(s1)
  print(sorted(ret))