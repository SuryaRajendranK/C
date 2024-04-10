public class LamdaDemo {
    public static void main(String[] args) {
        Studentinfo info = (String name, String gender) -> {
            return name + " " + gender;
        };
        System.out.println(info.Display("surya", "male"));
    }

}
