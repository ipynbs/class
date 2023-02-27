import cv2

catcolor = cv2.imread('230227/cat.jpg',cv2.IMREAD_COLOR)
catgray = cv2.imread('230227/cat.jpg',cv2.IMREAD_GRAYSCALE)

cv2.imshow('catcolor',catcolor)
cv2.imshow('catgary',catgray)
cv2.waitKey(0) # 사용자 입력 기다리기

cv2.destroyAllWindows() # 입력받으면 끄기

print(catcolor.shape)
print(catgray.shape)