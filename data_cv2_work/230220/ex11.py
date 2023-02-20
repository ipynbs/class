import cv2
import numpy as np

a = np.random.randint(0, 255, (300, 300, 3))
a = a.astype(np.uint8)

cv2.imshow('test', a)
cv2.waitKey(-1)

a[0:100, 0:100] = (255, 0, 0)

cv2.imshow('test', a)
cv2.waitKey(-1)
