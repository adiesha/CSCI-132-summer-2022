def convertToFahrenheit(valueInCelsius):
    fahrenheit = (valueInCelsius * 1.8) + 32
    print("{0} celsius is equal to {1} Fahrenheit".format(valueInCelsius, fahrenheit))

def convertToCelsius(valueInFahrenheit):
    celsius = (valueInFahrenheit - 32)/1.8
    print("{0} Fahrenheit is equal to {1} celsius".format(valueInFahrenheit, celsius))


def multiplyTwoNumbers(value1, value2):
    return value1* value2


def main():
    convertToCelsius(67)
    convertToFahrenheit(30)
    result = multiplyTwoNumbers(23, 10)
    print(result)

main()
