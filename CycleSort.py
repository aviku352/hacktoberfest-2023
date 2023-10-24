def cycle_sort(arr):
    n = len(arr)
    for start in range(n):
        item = arr[start]
        pos = start

        for i in range(start + 1, n):
            if arr[i] < item:
                pos += 1

        if pos == start:
            continue

        while item == arr[pos]:
            pos += 1

        arr[pos], item = item, arr[pos]

        while pos != start:
            pos = start

            for i in range(start + 1, n):
                if arr[i] < item:
                    pos += 1

            while item == arr[pos]:
                pos += 1

            arr[pos], item = item, arr[pos]

if __name__ == "__main__":
    arr = [5, 2, 1, 8, 4]
    cycle_sort(arr)
    print("Sorted Array:", arr)
