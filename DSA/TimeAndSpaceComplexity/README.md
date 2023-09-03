# Time Complexity:
- Time complexity refers to the amount of time an algorithm takes to complete its execution in relation to the size of its input. It provides an understanding of how the running time of an algorithm grows as the input size increases. Time complexity is typically expressed using Big O notation, which describes the upper bound of an algorithm's running time in terms of the input size. Common time complexities include O(1) (constant time), O(log n) (logarithmic time), O(n) (linear time), O(n log n) (linearithmic time), O(n^2) (quadratic time), and so on

# Space Complexity:
- Space complexity refers to the amount of memory space used by an algorithm in relation to the size of its input. It provides insight into how the memory requirements of an algorithm grow as the input size increases. Similar to time complexity, space complexity is also expressed using Big O notation, describing the upper bound of an algorithm's memory usage.


# Types Of Time Complexity :

# Best Time Complexity: 
- Define the input for which algorithm takes less time or minimum time. In the best case calculate the lower bound of an algorithm. Example: In the linear search when search data is present at the first location of large data then the best case occurs.


# Average Time Complexity:
 - In the average case take all random inputs and calculate the computation time for all inputs.
 And then we divide it by the total number of inputs.

# Worst Time Complexity:
 - Define the input for which algorithm takes a long time or maximum time. In the worst calculate the upper bound of an algorithm. Example: In the linear search when search data is present at the last location of large data then the worst case occurs.

 
# Selection Sort:
- Best Time Complexity (Ω): O(n^2)
- Average Time Complexity (θ): O(n^2)
- Worst Time Complexity (O): O(n^2)
- Space Complexity: O(1)
- Explanation: Selection Sort has quadratic time complexity in all cases due to the need for multiple passes through the array. It swaps elements to arrange them in order. It doesn't require additional memory except for a few variables, resulting in constant space complexity.


# Bubble Sort:
- Best Time Complexity (Ω): O(n)
- Average Time Complexity (θ): O(n^2)
- Worst Time Complexity (O): O(n^2)
- Space Complexity: O(1)
- Explanation: Bubble Sort has a linear best-case time complexity when the input is already sorted. However, its average and worst-case time complexities are quadratic. It swaps adjacent elements until the entire array is sorted. The space complexity is constant because it only needs a few variables for swapping.


# Insertion Sort:
- Best Time Complexity (Ω): O(n)
- Average Time Complexity (θ): O(n^2)
-  Worst Time Complexity (O): O(n^2)
- Space Complexity: O(1)
- Explanation: Insertion Sort's best-case time complexity is linear when the array is sorted. It builds the sorted array one element at a time by inserting each element in its correct position. Its average and worst-case time complexities are quadratic. The space complexity is constant as it uses minimal additional memory.

# Heap Sort:
- Best Time Complexity (Ω): O(n log(n))
-  Average Time Complexity (θ): O(n log(n))
-  Worst Time Complexity (O): O(n log(n))
- Space Complexity: O(1)
- Explanation: Heap Sort achieves a best, average, and worst-case time complexity of n log(n) by constructing a heap data structure and repeatedly extracting the maximum element. Its space complexity is constant since it performs in-place swapping operations.
 
# Quick Sort:
- Best Time Complexity (Ω): O(n log(n))
- Average Time Complexity (θ): O(n log(n))
- Worst Time Complexity (O): O(n^2)
- Space Complexity: O(n)
- Explanation: Quick Sort's average and best-case time complexities are n log(n) when the pivot choice is effective. However, in the worst-case scenario, it can degrade to quadratic time complexity. It divides the array into partitions and recursively sorts them. The space complexity arises from the recursive call stack.


# Merge Sort:
- Best Time Complexity (Ω): O(n log(n))
- Average Time Complexity (θ): O(n log(n))
- Worst Time Complexity (O): O(n log(n))
- Space Complexity: O(n)
- Explanation: Merge Sort consistently achieves n log(n) time complexity by dividing the array into subarrays, sorting them, and merging the results. Its space complexity is linear due to the need for temporary storage during the merging process.

# Bucket Sort:
- Best Time Complexity (Ω): O(n + k)
- Average Time Complexity (θ): O(n + k)
- Worst Time Complexity (O): O(n^2)
- Space Complexity: O(n)
- Explanation: Bucket Sort's time complexity depends on the distribution of elements. It places elements into buckets and sorts them within each bucket. Best and average cases are linear when elements are evenly distributed. Worst-case occurs when all elements fall into a single bucket, resulting in quadratic time complexity. Space complexity is linear due to bucket storage.

# Radix Sort:
- Best Time Complexity (Ω): O(nk)
- Average Time Complexity (θ): O(nk)
- Worst Time Complexity (O): O(nk)
- Space Complexity: O(n + k)
- Explanation: Radix Sort's time complexity depends on the number of digits 'k' and the number of elements 'n'. It sorts by considering digits from least significant to most significant. The space complexity includes auxiliary storage for counting and output arrays.


# Count Sort:
- Best Time Complexity (Ω): O(n + k)
- Average Time Complexity (θ): O(n + k)
- Worst Time Complexity (O): O(n + k)
- Space Complexity: O(k)
- Explanation: Count Sort has a linear time complexity based on the number of elements 'n' and the range of values 'k'. It counts occurrences of each element and creates a sorted output. The space complexity depends on the range of elements.

# Shell Sort:
- Best Time Complexity (Ω): O(n log(n))
- Average Time Complexity (θ): O(n log(n))
- Worst Time Complexity (O): O(n^2)
- Space Complexity: O(1)
- Explanation: Shell Sort's time complexity varies based on the chosen gaps for comparisons. It performs insertion sort on smaller subarrays, gradually reducing the gaps. Space complexity is constant as it uses minimal additional memory.

# Tim Sort:
- Best Time Complexity (Ω): O(n)
- Average Time Complexity (θ): O(n log(n))
- Worst Time Complexity (O): O(n log(n))
- Space Complexity: O(n)
- Explanation: Tim Sort is a hybrid sorting algorithm, using insertion sort and merge sort. It aims for efficiency on small arrays and utilizes merge sort for larger arrays. Best-case time complexity is linear when elements are already sorted. Space complexity arises from temporary storage.


# Tree Sort:
- Best Time Complexity (Ω): O(n log(n))
- Average Time Complexity (θ): O(n log(n))
- Worst Time Complexity (O): O(n^2)
- Space Complexity: O(n)
- Explanation: Tree Sort constructs a binary search tree from elements and performs an in-order traversal to retrieve sorted elements. Its time complexity is n log(n) in average and best cases. The space complexity arises from the tree structure.

# Cube Sort:
- Best Time Complexity (Ω): O(n)
- Average Time Complexity (θ): O(n log(n))
- Worst Time Complexity (O): O(n log(n))
- Space Complexity: O(n)
- Explanation: Cube Sort uses the concept of sorting cubes to sort data. It aims for efficiency on small arrays and employs merge sort for larger arrays. Best-case time complexity is linear, while worst-case is n log(n). Space complexity arises from additional memory used.


# www.github.com/pratiktikande
# @Pratik Tikande