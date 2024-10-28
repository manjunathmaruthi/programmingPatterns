package com.manjunath.dotikol;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashingWithHashing {

    public static void main(String[] args) {
        int[] elements = {25,35,15,45,55,65,75};

        HashSet set = new HashSet();
        set.add(null);
        set.add(2);

        System.out.println(set.size());

        HasTab hasTab = new HasTab();

        for(int element : elements) {
            getHashKeyUsingLinerProbing(element, hasTab);

        }
    }


    public static void getHashKeyUsingLinerProbing(final int element, final HasTab hasTab) {

        int index = element % 5;

        List list = null;

        if (hasTab.getIndex() != 0) {
             list = hasTab.getList();
        } else {
            list = new ArrayList();
        }
        list.add(element);
        hasTab.setList(list);
        hasTab.setIndex(index);
    }


    static class HasTab {

        int index;
        List<Integer> list;


        public HasTab() {
            list = new ArrayList();
        }

        public int getIndex() {
            return index;
        }

        public void setIndex(int index) {
            this.index = index;
        }

        public List<Integer> getList() {
            return list;
        }

        public void setList(List<Integer> list) {
            this.list = list;
        }
    }
}
