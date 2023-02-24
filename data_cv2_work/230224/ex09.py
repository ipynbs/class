import cv2

cat = cv2.imread('cat.jpg',cv2.IMREAD_COLOR)
cv2.imwrite('cat1.jpg',cat)

dog = cv2.imread('dog.jpg',cv2.IMREAD_COLOR)
dog = cv2.resize(dog,(399,600))
dog = cv2.cvtColor(dog,cv2.COLOR_BGR2GRAY)
cv2.imshow('dog',dog)
cv2.waitKey(0)
cv2.imwrite('dog1.jpg',dog)