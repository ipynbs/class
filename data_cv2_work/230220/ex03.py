import numpy as np

li = [1, 2, 3] + [4, 5, 6]
print(li)

nli = np.array([1, 2, 3])+np.array([4, 5, 6])
print(nli)

c = np.concatenate([np.array([1, 2, 3]), np.array([4, 5, 6])])
print(c)
print(c.shape)
