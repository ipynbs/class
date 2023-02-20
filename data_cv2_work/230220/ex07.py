import numpy as np

li = np.array(8).reshape(-1, 4)

left, right = np.split(li, [2], axis=1)

print(left.shape)
print(right.shape)

print(right[1][1])
