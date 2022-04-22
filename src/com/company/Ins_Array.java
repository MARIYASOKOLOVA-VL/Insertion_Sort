package com.company;

public class Ins_Array {

    private int[] arr;
    private int elem;

    public Ins_Array(int size) { // конструктор
        arr = new int[size];
        elem = 0;
    }

    public void insert(int value) { // вставка
        arr[elem] = value;
        elem++;
    }

    public void insert_comp() { // вставка random
        for (int i = 0; i < 100; i++) {
            int rand_value = (int) ((Math.random() * 200)) - 100;
            arr[elem] = rand_value;
            elem++;
        }
    }

    public void print_arr() { // вывод на экран
        for (int i = 0; i < elem; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void my_ins_sort() { // сортировка методом вставки
        int m = 0;
        for (int i = 1; i < elem; i++) {
            int k = arr[i];
            m = i;
            while ((m > 0)&(arr[m-1] >= k)) {
                arr[m]=arr[m-1];
                m--;
                if (m == 0){
                    arr[m] = k;
                    break;
                }
            }
            arr[m] = k;
        }
    }
}