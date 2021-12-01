package com.fastcampus.javaoop.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("버블소트 - 리스트를 넣으면 정렬된 결과를 보여준다")
    @Test
    void given_List_WhenExecuting_ThenReturnSortList() {
        //given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        //when
        List<Integer> actual = bubbleSort.sort(List.of(3,4,5,2,1));
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }

    @DisplayName("자바소트")
    @Test
    void sortList() {
       /* JavaSort<Integer> javaSort = new JavaSort<>();
        List<Integer> actual = javaSort.sort(List.of(3,4,5,2,1));
        assertEquals(List.of(1, 2, 3, 4, 5), actual);*/
        //given
        JavaSort<Integer> bubbleSort = new JavaSort<>();

        //when
        List<Integer> actual = bubbleSort.sort(List.of(3,4,5,2,1));
        assertEquals(List.of(1, 2, 3, 4, 5), actual);
    }
}