package com.fastcampus.javaoop.service;

import com.fastcampus.javaoop.logic.BubbleSort;
import com.fastcampus.javaoop.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sortService = new SortService(new BubbleSort<>());

    @Test
    void test() {
        List<String> actual =  sortService.doSort(List.of("1", "3", "6"));
        assertEquals(List.of("1", "3", "6"), actual);
    }

}