
public class Calculations {
        public static int list (Employee[] empCorp){
            int sum = 0;
            for (int i = 0; i < empCorp.length; i++) {
                sum = sum + empCorp[i].getSalary();
            }
            System.out.println("Сумма затрат на зарплаты в месяц= " + sum);
            return sum;
        }
    }

