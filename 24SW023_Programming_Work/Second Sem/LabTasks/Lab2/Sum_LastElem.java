PSVM(String args[]) {
        int[] arr1 = {1, 2, 3, 4, 5}
        System.out.println("1 arr " + Arrays.toString(arr1));
        int[] arr2 = new int[arr1.length - 2
        for(int i = 0; i < arr1.length - 2; i++) {
            arr2[i] = arr1[i] + arr1[i + 1];
        }
        System.out.println("2 arr " + Arrays.toString(arr2));
    }
