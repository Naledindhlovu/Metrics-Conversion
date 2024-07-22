# Metrics-Conversion

**README.md**

**Conversion Utility**

This project is a simple conversion utility that allows users to convert between different units of measurement. Currently, it supports conversions from:

* Feet to Meters
* Pounds to Kilograms
* Fahrenheit to Celsius

**Usage:**

1. Open the project in NetBeans and run the program.
2. The program will prompt the user to enter the following:
	* The unit they want to convert from (e.g. "feet", "pounds", "fahrenheit")
	* The unit they want to convert to (e.g. "meters", "kilograms", "celsius")
	* The quantity to be converted
3. The program will then print the result of the conversion to the user.

**Example Usage:**

```
Enter the unit you want to convert from: feet
Enter the unit you want to convert to: meters
Enter the quantity: 10
Result: 3.048 meters
```

**Notes:**

* The program uses simple formulas for the conversions:
	+ 1 foot = 0.3048 meters
	+ 1 pound = 0.453592 kilograms
	+ (°F - 32) × 5/9 = °C
* The program does not handle invalid input or errors, so please ensure that the user input is correct.

**How to Run:**

1. Open NetBeans and create a new Java project.
2. Copy the provided code into a new Java class (e.g. `Converter.java`).
3. Compile and run the program.

**picture**

![Screenshot (74)](https://github.com/user-attachments/assets/e16d2ace-392b-44f0-8ad6-e2c3d689dc04)
