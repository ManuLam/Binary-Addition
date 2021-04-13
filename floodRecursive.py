r,c = map(int, input().split())


people = [[int(x) for x in input()] for _ in range(r)]

n = int(input())
ans = []


# Base case
def within_boundary(row, col):
    if row < 0 or col < 0 or row >= r or col >= c:
        return False
    return True


# Tries all the possible locations until the base case is reached
def flood(matrix, num_type, row, col, target, visited):
    if not within_boundary(row, col):
        return

    if visited[row][col] or (matrix[row][col] != num_type):
        return

    visited[row][col] = 1

    if (row, col) == target:
        ans.append('decimal' if num_type else 'binary')
        return

    if within_boundary(row + 1, col) and matrix[row + 1][col] == num_type:
        flood(matrix, num_type, row+1, col, target, visited)

    if within_boundary(row - 1, col) and matrix[row - 1][col] == num_type:
        flood(matrix, num_type, row-1, col, target, visited)

    if within_boundary(row, col + 1) and matrix[row][col + 1] == num_type:
        flood(matrix, num_type, row, col+1, target, visited)

    if within_boundary(row, col - 1) and matrix[row][col - 1] == num_type:
        flood(matrix, num_type, row, col-1, target, visited)


for i in range(n):
    r1,c1,r2,c2 = map(int, input().split())
    r1,c1,r2,c2 = r1-1, c1-1, r2-1, c2-1

    if people[r1][c1] != people[r2][c2]:
        ans.append('neither')

    else:
        val = people[r1][c1]
        visited = [[0 for _ in range(c)] for _ in range(r)]
        flood(people, val, r1, c1, (r2, c2), visited)

        if len(ans) != i+1:
            ans.append('neither')

    print(ans[-1])


'''
Test Cases

10 20
11111111111111111111
11000000000000000101
11111111111111110000
11111111111111110000
11000000000000000111
00011111111111111111
00111111111111111111
10000000000000001111
11111111111111111111
11111111111111111111
3
2 3 8 16
8 1 7 3
1 1 10 20

--------------------

1 4
1100
2
1 1 1 4
1 1 1 1

'''