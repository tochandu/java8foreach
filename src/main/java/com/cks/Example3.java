package com.cks;

import java.util.ArrayList;
import java.util.List;

/**
 * Java 8 Stream example - List with forEach and Filter on custom data
 */
public class Example3 {
    public static void main(String arg[]) {
        List<EmpVO> empVOList = new ArrayList<>();
        empVOList.add(new EmpVO(111L,"James",31,"Plano TX"));
        empVOList.add(new EmpVO(222L,"John",30,"Phoenix AZ"));
        empVOList.add(new EmpVO(333L,"Joshua",35,"charlotte NC"));
        empVOList.add(new EmpVO(444L,"Joseph",21,"los Angeles CA"));

        empVOList.forEach(item -> {
            System.out.println(item);
        });
        empVOList.forEach(item -> {
            if(item.getId() == 111L)
               System.out.println(item);
        });
        empVOList.stream().forEach(item -> {
            System.out.println(item);
        });

        empVOList.stream()
                .filter(it -> it.getId()== 111L)
                .forEach(item -> { System.out.println(item);
                });

        // allMatch, anyMatch and noneMatch
        // age between 35 to 30 and name start with "J"
        System.out.println("---------filter-----------");
        Boolean result = empVOList.stream()
                .allMatch(it -> (it.getAge() >=20 && it.getAge() <=35) && it.getName().startsWith("J"));
        System.out.println("result-allMatch->"+result);

        //Name start with "J"
        result = empVOList.stream()
                .anyMatch(it ->  it.getName().startsWith("J"));
        System.out.println("result-anyMatch->"+result);
        //none namr match with "Joseph"
        result = empVOList.stream()
                .noneMatch(it ->  it.getName().startsWith("Joseph"));
        System.out.println("result-noneMatch->"+result);

    }
//nested class VO å
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
                    ", address='" + address+'\'' ;
        }
    }

}
