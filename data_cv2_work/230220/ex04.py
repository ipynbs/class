import cv2
import numpy as np
import matplotlib.pyplot as plt

li = np.array([1, 2, 3, 4])

test = li.reshape(2, 2)
print(test)

# ali = np.array([[0, 1], [1, 0], [1, 0], [0, 1],
#               [0, 1], [1, 0], [1, 0], [0, 1]])

# cv2.imshow('test', test)
plt.imshow(test)
plt.show()
