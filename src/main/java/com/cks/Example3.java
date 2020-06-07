package com.cks;

public class Example3 {
    public static void main(String arg[]) {
        EmpVO empVO = new EmpVO(111L,"James",31,"Plano TX");
        

    }

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
            return "EmpVO{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", age=" + age +
                    ", address='" + address + '\'' +
                    '}';
        }
    }

}
