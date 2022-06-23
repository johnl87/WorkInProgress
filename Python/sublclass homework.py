class triangle:
  def __init__(self, base, height, sideOne, sideTwo):
    self.base = base
    self.height = height
    self.sideOne = sideOne
    self.sideTwo = sideTwo

  def area(self):
    return self.base * self.height / 2

  def perimeter(self):
    return self.base + self.sideOne + self.sideTwo
  

  def __str__(self):
    return "Triangle - base: {0} - height: {1}".format(self.base, self.height)
  

triangle1 = triangle(4, 5, 20, 15)
print(triangle1)
print(triangle1.area())
print(triangle1.perimeter())