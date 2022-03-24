# Quick Sort

- Quick sort is a similar approach to the merge sort where you are breaking things up 
sorting and merging, but instead of having a determined point to split your
array at the half way point like in merge sort, the dividing point or pivot point is 
determined based on the data of the array. 

- For example, you can determine the point to pivot and break up your array.
In this example you can see that the pivot point is determined and all numbers
that are smaller than the pivot are on the left side and the greater than the 
pivot are on the right side. Think of it like a low side and a high side which is 
organized based on the pivot point.

[quick sort]

````Java
//ALGORITHM QuickSort(arr, left, right)
    //if left < right
        // Partition the array by setting the position of the pivot value
       // DEFINE position <-- Partition(arr, left, right)
        // Sort the left
       // QuickSort(arr, left, position - 1)
        // Sort the right
       // QuickSort(arr, position + 1, right)

//ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    // DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
   // DEFINE low <-- left - 1
   // for i <- left to right do
       // if arr[i] <= pivot
          //  low++
          //  Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right.
    // Swap(arr, right, low + 1)
    // return the pivot index point
   //  return low + 1

//ALGORITHM Swap(arr, i, low)
   // DEFINE temp;
  //  temp <-- arr[i]
  //  arr[i] <-- arr[low]
  //  arr[low] <-- temp

````