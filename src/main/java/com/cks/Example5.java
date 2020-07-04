package com.cks;


import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/**
 * Java 8 Stream example - Map with forEach and Filter on custom data
 */
public class Example5 {
    public static void main(String arg[]) {
        Map<Integer,EmpVO> map = new HashMap<>();
        map.put(11,new EmpVO(111L,"James",31,"Plano TX"));
        map.put(22,new EmpVO(222L,"John",30,"Phoenix AZ"));
        map.put(33,new EmpVO(333L,"Joshua",35,"charlotte NC"));
        map.put(44,new EmpVO(444L,"Joseph",21,"los Angeles CA"));
        //If we want to use functional-style Java, we can also use the forEach().
        // We can do so directly on the collection:
        map.forEach((K, V) -> { System.out.println(K + "::" + V); });
        //If condition
        System.out.println("-------if condition-------");
        map.forEach((K, V) -> {
            if("bbb".equals(V))
                System.out.println(K + "::" + V);
        });
        System.out.println("--------------");
        //we can call forEach() on the collection's stream:
        map.entrySet().stream().forEach(item -> {
            System.out.println(item.getKey() + "::" + item.getValue());
        });
        //if condition using stream and filter
        System.out.println("-----Stream and filter------");
        map.entrySet().stream()
                .filter(tmp -> 33==tmp.getKey())
                .forEach(item -> {
                    System.out.println(item.getKey() + "::" + item.getValue());
                });

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
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof EmpVO)) return false;
            EmpVO empVO = (EmpVO) o;
            return id == empVO.id &&
                    age == empVO.age &&
                    Objects.equals(name, empVO.name) &&
                    Objects.equals(address, empVO.address);
        }
        @Override
        public int hashCode() {
            return Objects.hash(id, name, age, address);
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
