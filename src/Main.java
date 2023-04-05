public class Main {
    public static void main(String[] args) {
        Employee[] empCorp = new Employee[10];
        Id id1 = new Id();
        empCorp[0] = new Employee("sdfsd",id1,1,100_000);
        Id id2 = new Id();
        empCorp[1] = new Employee("sdfsd",id2,1,56_000);
        Id id3 = new Id();
        empCorp[2] = new Employee("sdfsd",id3,2,73_000);
        Id id4 = new Id();
        empCorp[3] = new Employee("sdfsd",id4,2,24_800);
        Id id5 = new Id();
        empCorp[4] = new Employee("sdfsd",id5,3,48_300);
        Id id6 = new Id();
        empCorp[5] = new Employee("sdfsd",id6,3,69_990);
        Id id7 = new Id();
        empCorp[6] = new Employee("sdfsd",id7,4,67_100);
        Id id8 = new Id();
        empCorp[7] = new Employee("sdfsd",id8,4,90_120);
        Id id9 = new Id();
        empCorp[8] = new Employee("sdfsd",id9,5,46_600);
        Id id10 = new Id();
        empCorp[9] = new Employee("sdfsd",id10,5,81_700);
        for (Employee employee : empCorp){
            System.out.println(employee);

        }
    }
}