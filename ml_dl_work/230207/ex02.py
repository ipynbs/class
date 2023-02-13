from sklearn.neighbors import KNeighborsClassifier
knr = KNeighborsClassifier(n_neighbors=1)

# knr.fit([10, 11, 12, 13, 14, 15], ['a', 'a', 'a', 'a', 'a', 'a'])
data = [10, 11, 12, 13, 14, 15] + [100, 101, 102, 103, 104, 105]
data = [[item] for item in data]
# print(data)
target = ['a', 'a', 'a', 'a', 'a', 'a'] + ['b', 'b', 'b', 'b', 'b', 'b']
# print(target)
knr.fit(data, target)

result = knr.predict([[16], [100], [50]])
print(result)
# result = knr.predict([16])
# print(result)
