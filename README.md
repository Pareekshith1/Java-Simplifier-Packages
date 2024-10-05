# Java-Simplifier-Packages
Here are some simple Java packages to make your life easier and Java-friendly

# 1) The Arraysorter 
The Arraysorter class is designed to sort an array of integers using the Bubble Sort algorithm. This basic sorting algorithm repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.

### usage

``` bash
   ArraySorter sorter = new ArraySorter(data);
```

# 2) PrintUtil
The PrintUtils package is for simplifying the print statement where by using this package the user won't have to enter the old traditional print statement :
``` bash
   System.out.print("hello world");
```
instead, you can download this file and import the package by :
#### For Simple print() function
``` bash
   import static PrintUtil.print;
```
#### For Simple println() function
```bash
   import static PrintUtil.println;
```
#### For simple printf() function
```bash
   import static PrintUtil.printf;
```
Now you can easily use the new print function and then print the output .
Example code :
``` bash
import static PrintUtil.print;   
import static PrintUtil.println;  
import static PrintUtil.printf;   

public class Main {
    public static void main(String[] args) {
        // Now you can use print(), println(), and printf() directly
        print("This is using print(). ");
        println("This is using println().");
        printf("This is using printf(): %d", 100);
    }
}

```



