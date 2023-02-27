import cv2
cat = cv2.imread('230227/cat.jpg')

cv2.imshow('cat',cat[:,:,0])
cv2.waitKey(0)

cat[:,:,2] = 0
cv2.imshow('cat',cat)
cv2.waitKey(0)

cv2.destroyAllWindows()