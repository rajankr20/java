
// use of getter and setter;

class Student{
    private int age;
    private String name;
    public void setAge(int age){

        this.age= age;
    }
    public int getAge(){
        return age;
    }
    public void setName(String name){
        this.name= name;
    }
    public String getName(){
        return name;
    }
    public void show(){
        System.out.println(name +""+ age);
    }
}
public class lecture_19 {
    public static void main(String[] args) {
        Student obj= new Student();
        Student obj2= new Student();
        obj.setAge(23);
        obj2.setAge(25);
        obj.setName("rajan");
        obj2.setName("rajankumar");
        int studentAge= obj.getAge();
        System.out.println(studentAge);
       // obj.show();
        obj2.show();





//        ///////
//        class Student{
//            private int age;
//            private String name;
//            public void setData1(int age){
//                this.age= age;
//            }
//            public void setData2(String name){
//                this.name= name;
//            }
//            public void show(){
//                System.out.println(name +""+ age);
//            }
//        }
//        public class lecture_19 {
//            public static void main(String[] args) {
//                Student obj= new Student();
//                Student obj2= new Student();
//                obj.setData1(23);
//                obj2.setData1(25);
//                obj.setData2("rajan");
//                obj2.setData2("rajankumar");
//                obj.show();
//                obj2.show();
    }
}
