package com.company;

public class Main {

    public static void main(String[] args) {

        int my_syze = 100;
	    Ins_Array my_arr = new Ins_Array(my_syze);

        //my_arr.insert(5); // заполняем массив вручную
        //my_arr.insert(10);
        //my_arr.insert(-4);
        //my_arr.insert(53);
        //my_arr.insert(1);
        //my_arr.insert(2);
        //my_arr.insert(-25);
        //my_arr.insert(-100);

        my_arr.insert_comp(); // заполнение массива автоматически

	    System.out.println("Изначальный массив: ");
	    my_arr.print_arr();
	    my_arr.my_ins_sort();
	    System.out.println("Отсортированный массив: ");
        my_arr.print_arr();
    }
}
