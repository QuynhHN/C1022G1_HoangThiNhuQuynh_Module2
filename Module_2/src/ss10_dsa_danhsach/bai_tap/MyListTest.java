package ss10_dsa_danhsach.bai_tap;

public class MyListTest {
    public static class Student {
        private int id;
        private String name;

        public Student() {
        }

        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static void main(String[] args) {
        Student a = new Student(1, "Huy");
        Student b = new Student(2, "Huong");
        Student c = new Student(3, "Ha");
        Student d = new Student(4, "Hanh");
        Student e = new Student(5, "Hoa");

        MyList<Student> studentMyList = new MyList<>();
        MyList<Student> newStudentList = new MyList<>();

        studentMyList.add(a);
        studentMyList.add(b);
        studentMyList.add(c);
        studentMyList.add(d);
        studentMyList.add(e);

        for (int i = 0; i < studentMyList.size(); i++) {
            Student student = (Student) studentMyList.elements[i];
            System.out.println(student.getId());
            System.out.println(student.getName());
        }
        System.out.println();
        newStudentList = studentMyList.clone();
        for (int i = 0; i < newStudentList.size(); i++) {
            System.out.println(newStudentList.get(i).getName());

        }
    }
}

