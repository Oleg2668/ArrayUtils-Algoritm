package app;

public class ArrayUtils {

    // Метод для сортування злиттям
    public static void mergeSort(int[] array) {
        if (array.length > 1) {
            int mid = array.length / 2;

            // Поділ масиву на дві половини
            int[] left = new int[mid];
            int[] right = new int[array.length - mid];

            System.arraycopy(array, 0, left, 0, mid);
            System.arraycopy(array, mid, right, 0, array.length - mid);

            // Рекурсивне сортування обох половин
            mergeSort(left);
            mergeSort(right);

            // Злиття обох половин у відсортований масив
            merge(array, left, right);
        }
    }

    private static void merge(int[] array, int[] left, int[] right) {
        int i = 0, j = 0, k = 0;

        // Злиття двох частин масиву у відсортований масив
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                array[k++] = left[i++];
            } else {
                array[k++] = right[j++];
            }
        }

        // Копіювання залишків
        while (i < left.length) {
            array[k++] = left[i++];
        }

        while (j < right.length) {
            array[k++] = right[j++];
        }
    }

    // Метод для бінарного пошуку
    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Перевірка середнього елемента
            if (array[mid] == target) {
                return mid;
            }

            // Якщо target більший, ігноруємо ліву частину
            if (array[mid] < target) {
                left = mid + 1;
            }
            // Якщо target менший, ігноруємо праву частину
            else {
                right = mid - 1;
            }
        }

        // Повертаємо -1, якщо елемент не знайдено
        return -1;
    }
}