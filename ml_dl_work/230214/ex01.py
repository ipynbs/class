from sklearn.linear_model import LinearRegression
import numpy as np
import matplotlib.pyplot as plt

x = np.array([4, 5, 6, 7])
x = np.column_stack((x**2, x))
# y = x * 2 + 1
y = np.array(x * 2 + 1)
y = y[:, 1]

# 2차원
# x = x.reshape(-1, 1) #
print(x.shape)

print(x)
print(y)

lr = LinearRegression()
lr.fit(x, y)

result = lr.predict([[8**2, 8]])

print(result)

plt.scatter(x[:, 1], y)
plt.scatter(8, result)
plt.plot(x[:, 1], y)
plt.show()

print(lr.coef_, lr.intercept_)
