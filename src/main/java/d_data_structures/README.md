## Data structures

#### Excercise 1
1. Create an Enum named `BrowserType` (in: the `BrowserType` class) which will contain four elements
* Chrome
* Edge
* Firefox
* Opera


#### Exercise 2
1. Uncomment the `public class DriverFactory` code.
2. Correct the code of the `getDriver()` method so that for each of the elements created in the enum it returns a string with the name of the selected browser.
3. Call the `getDriver()` method in the `main()` method with various enum parameters.


#### Exercise 3
List documentation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html

1. In class `MyList` Create a list of Strings with the names of star wars heroes
* Han Solo
* Luke Skywalker
* Darth Vader
* C-3PO
* Leia Organa
* Obi Wan Kenobi

2. Print the last item of the list
3. Reverse the order of items in the list
4. Print the list again
5. Sort the list with the default method
6. Print the first item of the list


#### Task 4
Map documentation: https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Map.html

In class `MyMap`:
1. Create a Map where the key and value are strings
2. Add the following key->value pairs:
* "browser" -> "chrome"
* "headless" -> "false"
* "res_width" -> "1920"
* "res_height" -> "1080"
3. Check if the dictionary contains the `browser` key
4. Read value from the `headless` key
5. Remove the `headless` key 
6. Try to retrieve the data from `headless` key