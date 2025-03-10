class Six {
    public static int linearSearch(int [] arr, int target ){
        for(int i = 0; i<arr.length; i++){
            if(target == arr[i])
            return i;
        }
        return -1;
    }
    public static int binarySearch(int arr [], int target){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = (start + end)/2;
            if(arr[mid] == target){
                return mid;
            }else if (arr[mid] > target){
                end = mid;
            }else{
                start = mid;
            }
        }
        return -1;
    }
    public static void bubbleSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            for(int j = 0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int swap = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = swap;
                }
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void selectionSorting(int arr []){
        
        for(int i = 0; i<arr.length; i++){
            int minPos = i;
            for(int j = i+1; j < arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;            
        }

         for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }
    public static void insertionSort(int arr[]){
        for(int i = 1; i<arr.length;i++){
            int curr = arr[i];
            int prev = i -1;
            while(prev >= 0 && arr[prev] > curr ){
                arr[prev + 1] = arr[prev];
                prev--;
            } 
            arr[prev+1] = curr;

        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeTwoArrays(int arr [], int arr2[]){
        int N = arr.length;
        int M = arr2.length;
        int [] newArr = new int[N+M];
        int index1 = 0; 
        int index2 = 0;
        int resultIndex = 0; 

        while(resultIndex < N + M ){
            if(index1 == N){
                newArr[resultIndex] = arr2[index2];
                index2++;
                resultIndex++;
                continue;
            }
            if(index2 == M){
                newArr[resultIndex] = arr1[index1];
                index1++;
                resultIndex++;
                continue;
            }

            if(arr1[index1]> arr2[index2]){
                newArr[resultIndex] = arr2[index2];
                resultIndex++;
                index2++;
            }else{
                newArr[resultIndex] - arr1[index1];
                resultIndex++;
                index1++;
            }
        }

        for(int i = 0; i<N + M; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void mergeSort(int arr[]){

    }
    public static void main(String args []){
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        int [] newArr = {1,2,3,5,7,11,15,17,20,25};
        int [] arrSort = {9,5,8,2};
        int [] selSort = {9,5,8,2,1};
        int [] inserSort = {9,5,8,2,1};
        int target = 7;
        // System.out.println(linearSearch(arr,target));
        // System.out.println(binarySearch(newArr, target));
        // bubbleSort(arrSort);
        // selectionSorting(selSort);
        // System.out.println();
        // insertionSort(inserSort);
        // System.out.println();
        // mergeTwoArrays(arr, arrSort);

    }
}