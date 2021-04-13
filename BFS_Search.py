from collections import deque

grid = [['a', 'a', 'f'],
        ['a', 'a', 'f'],
        ['f', 'a', 'd']]

rows, cols = len(grid), len(grid[0])


def solution():
    if grid[0][0] != 'a' or grid[rows-1][cols-1] != 'd':
        return -1

    # path is shortest distance from a  -- d  (can't go on f)
    q = deque()
    visited = [[0] * cols for _ in range(rows)]
    q.append((0, 0, 1))
    visited[0][0] = 1

    while q:
        i, j, dist = q.popleft()

        for x, y in ((i-1, j), (i+1, j), (i, j-1), (i, j+1)):
            # base cases
            if 0 <= x < rows and 0 <= y:
                if not visited[x][y]:
                    if grid[x][y] == 'a':
                        visited[x][y] = 1
                        q.append((x, y, dist + 1))
                    elif x == rows-1 and y == cols-1 and grid[x][y] == 'd':
                        return dist + 1
    return -1


print(solution())
