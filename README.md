## Java Comparator Example through it's compare() method

### Key points on Comparator

- Comparator interface available since java 1.2
- Comparator interface exists in java.util package
- As of latest OpenJDK 14 API doc, Comparator interface provides many additional methods such as reversed(), thenComparing...()
	refer https://download.java.net/java/early_access/jdk14/docs/api/java.base/java/util/Comparator.html
- Comparator interface has become FunctionalInterface since java 8
- Comparator interface can be used to sort collection elements
- Comparator interface provides multiple sorting sequence
- Use Collections.sort(List, new Comparator()) method for sorting

### Output of this example

Before (Comparator) sort		[8|EEE|555.55, 404|BBB|111.11, 305|CCC|333.33, 1|DDD|444.44, 2|AAA|222.22]
After (Comparator) sort by Id		[1|DDD|444.44, 2|AAA|222.22, 8|EEE|555.55, 305|CCC|333.33, 404|BBB|111.11]
After (Comparator) sort by Name		[2|AAA|222.22, 404|BBB|111.11, 305|CCC|333.33, 1|DDD|444.44, 8|EEE|555.55]
After (Comparator) sort by Salary	[404|BBB|111.11, 2|AAA|222.22, 305|CCC|333.33, 1|DDD|444.44, 8|EEE|555.55]
