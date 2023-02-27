import cv2
import time
cat = cv2.imread('230227/cat.jpg',cv2.IMREAD_COLOR)

starttime = time.time()
print(starttime) #1970.01.01 00:00:01

for i in range(100):
    for j in range(100):
        cat[i,j] = [255,255,255]
print(f"time.time() - starttime = {time.time() - starttime}")

starttime = time.time()
cat[:300,:300] = [0,0,0]
print(f"time.time() - starttime = {time.time() - starttime}")

cv2.imshow('cat',cat)
cv2.waitKey(0)

cv2.destroyAllWindows()