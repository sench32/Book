package com.company;

public class FDemo {
    int x;
    FDemo(int i){
        x=i;
    }
    // Вызывается при удалении обьекта
    protected void finalize(){
        System.out.println("Финализация" + x);
    }
    //Гунирирует обьект, который тотчас уничтожается
    void generator(int i){
        FDemo o= new FDemo(i);
    }

}
