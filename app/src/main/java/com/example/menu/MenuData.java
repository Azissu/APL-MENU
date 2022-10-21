package com.example.menu;

import java.util.ArrayList;

public class MenuData {

    private static String[] menuName = {
            "Americano Ice",
            "Americano Hot",
            "Kopi Susu Original",
            "Kopi Susu Gula Aren",
            "Cappucino"

    };

    private static String [] menuDetail = {
            "Kopi Pait Tapi Enak Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "Kopi Pait Tapi Enak pt.2 Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "Kopi Susu Biasa Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "Kopi Susu + Gula Aren Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book.",
            "Bisa Digambarin Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book."

    };

    private static int [] menuImage = {
            R.drawable.americano,
            R.drawable.hotricano,
            R.drawable.kopsu,
            R.drawable.gula_aren,
            R.drawable.cappucino,

    };

    static ArrayList<Menu> getListData(){
        ArrayList<Menu> list = new ArrayList<>();
        for(int position = 0; position <menuName.length; position++){
            Menu menu = new Menu();
            menu.setName(menuName[position]);
            menu.setDetail(menuDetail[position]);
            menu.setPhoto(menuImage[position]);
            list.add(menu);
        }
        return list;
    };
}
