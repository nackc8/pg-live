class Person:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def greet(self, greeting="Hej"):
        return f"{greeting}, jag heter {self.name} och är {self.age} år gammal."


p = Person("Anna", 30)
print(p.greet())
print(p.greet("Hallå"))
