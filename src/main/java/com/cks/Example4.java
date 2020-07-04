package com.cks;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
/**
 * Java 8 Stream example - List with Sequential and Parallel
 */
public class Example4 {
    public static void main(String arg[]) {
        List<EmpVO> empVOList = new ArrayList<>();
        empVOList.add(new EmpVO(111L, "James", 31, "Plano TX"));
        empVOList.add(new EmpVO(222L, "John", 30, "Phoenix AZ"));
        empVOList.add(new EmpVO(333L, "Joshua", 35, "charlotte NC"));
        empVOList.add(new EmpVO(444L, "Joseph", 21, "los Angeles CA"));
        //Sequential vs Parallel streams
        System.out.println("Sequential->");
        empVOList.stream().sequential().forEach(item -> {run(item); });

        System.out.println("Parallel->");
        empVOList.stream().parallel().forEach(item -> { run(item); });

    }
    private static void run(EmpVO empVO) {
         System.out.println(LocalTime.now() + " - value: " + empVO +
                " - thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //nested class VO
    public static class EmpVO {
        private long id;
        private String name;
        private int age;
        private String address;

        public EmpVO(long id, String name, int age, String address) {
            this.id = id;
            this.name = name;
            this.age = age;
            this.address = address;
        }

        public long getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public String getAddress() {
            return address;
        }

        @Override
        public String toString() {
            return
                    "id=" + id +
                            ", name='" + name + '\'' +
                            ", age=" + age +
                            ", address='" + address + '\'';
        }
    }
}