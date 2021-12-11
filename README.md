# Carpet Cost Calculator
This project takes the input of a floor size and uses it to calculate the cost of a carpet placed onto the given floor dimensions 
## What I learned
* how to use classes and objects
* how to use a constructor
* how to intialize private feilds
## Input
```java
Floor x = new Floor(5,10);
Carpet price = new Carpet(3);
Floor y = new Floor(15, 5);
Carpet price2 = new Carpet(5);
Calculator Ishan = new Calculator(x, price);
System.out.println(Ishan.getTotalCost());
Calculator Anakin = new Calculator(y, price2);
System.out.println(Anakin.getTotalCost());
```
## Output
```bash
150.0
375.0
```

