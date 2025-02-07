package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;


//import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;

public class CustomListTest {

    private CustomList list;


    /*
    Create a mock list for my city list
    @return list
     */


    public CustomList MockCityList(){
        list  = new CustomList(null, new ArrayList<>());
        return list;
    }

    @Test
    public void addCityList(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan","SK"));
        assertEquals(list.getCount(), listSize + 1);
    }
}
