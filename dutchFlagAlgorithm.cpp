#include <iostream>
#include <vector>

void dutchFlagAlgorithm(std::vector<int>& arr) {
    int low = 0;       // Index to track the boundary of 0s
    int high = arr.size() - 1;  // Index to track the boundary of 2s
    int i = 0;          // Loop variable

    while (i <= high) {
        if (arr[i] == 0) {
            std::swap(arr[i], arr[low]);
            low++;
            i++;
        } else if (arr[i] == 2) {
            std::swap(arr[i], arr[high]);
            high--;
        } else {
            i++;
        }
    }
}

int main() {
    std::vector<int> arr = {0, 1, 2, 0, 1, 2, 1, 0};

    dutchFlagAlgorithm(arr);

    std::cout << "Sorted Array: ";
    for (int num : arr) {
        std::cout << num << " ";
    }
    std::cout << std::endl;

    return 0;
}
