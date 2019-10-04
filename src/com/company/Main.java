package com.company;

import java.util.*;

public class Main {

//----------------------------------------------------------------------------------------------------------------------
    private  static  <T> List JoinMultitude(List<? super T  > dest, List<? extends T> src){

        dest.addAll(src);
        Set<T> hs=new HashSet(dest);
        dest.clear();
        dest.addAll(hs);
        return dest;
    }
//----------------------------------------------------------------------------------------------------------------------
    private  static  <T> List Intersection(List<? super T> dest, List<? extends T> src){
       dest.retainAll(src);
        return dest ;
    }
//----------------------------------------------------------------------------------------------------------------------
    private  static  <T> List JoinInner(List<? super T> dest, List<? extends T> src){
        dest.addAll(src);
        return dest;
    }
//----------------------------------------------------------------------------------------------------------------------
    private  static  <T> List JoinLeft(List< T> dest, List<? extends  T> src){
        List<T> list=new LinkedList<>();
        //Collections.addAll(dest);
        for (T item:dest
        ) {
            list.add(item);
        }

        for (T item:src
        ) {
            list.add(item);
        }
        return list;
    }
//----------------------------------------------------------------------------------------------------------------------
    private  static  <T> List JoinRight(List<T> dest, List<? extends T> src){
        List<T> list=new LinkedList<>();
        for (T item:src
             ) {
            list.add(item);
        }
        for (T item:dest
             ) {
            list.add(item);
        }
       return list;
    }




    public static void main(String[] args) {
//----------------------------------------------------------------------------------------------------------------------
      List<Number>ln2=new ArrayList<>();
      ln2.add(10L);
      ln2.add(20.0);
      ln2.add(8);
      ln2.add(24);
      ln2.add(5.7f);
      ln2.add(9.7f);
      ln2.add(55);
      System.out.println("\n"+"список 1-го множества "+ln2);
//----------------------------------------------------------------------------------------------------------------------
      List<Integer>li2=new ArrayList<>();
      li2.add(8);
      li2.add(24);
      li2.add(32);
      li2.add(55);
      System.out.println("список 2-го множества "+li2+"\n");

//----------------------------------------------------------------------------------------------------------------------
System.out.println("объединение множества "+JoinMultitude(ln2,li2)+"                объедененное множество без повторения");
System.out.println("пересечение множества "+Intersection(new ArrayList<Number>(ln2),new ArrayList<Integer>(li2))+"                                    только те числа что входят в первое и второе множество");
System.out.println(" соединение множества "+JoinInner(new ArrayList<Number>(ln2),new ArrayList<Integer>(li2))+" просто смешивание двух коллекций");
System.out.println("     соединение слева "+JoinLeft(new ArrayList<Number>(ln2),new ArrayList<Integer>(li2))+" соединение слева");
System.out.println("    соединение справа "+JoinRight(new ArrayList<Number>(ln2),new ArrayList<Integer>(li2))+" соединение справа");

    }
}
