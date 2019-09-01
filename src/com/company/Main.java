package com.company;

public class Main {

    public static void main(String[] args) {

        int count;
        FDemo ob = new FDemo(0);
        /*Генерируется большое колличество обьектов.
           В како-то момент времени должна начаться сборка мусора.
           Примечание: возможно для того чтобы активизировать
           систему сборки мусора, количество генерируемых обьектов
           придется увеличить. */
        for (count=1; count<100000; count++) {
            ob.generator(count);
            System.out.println(count);
        }
    }
}
