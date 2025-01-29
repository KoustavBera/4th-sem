package CSW_2.LAB_3;

class employee {

    int salary = 60000;
}

class doctor extends employee {

    int bonus = 15000;

}

public class inheritance4 {

    public static void main(String[] args) {
        doctor ob = new doctor();
        System.out.println("Salary is " + (ob.salary));
        System.out.println("bonus is " + (ob.salary + ob.bonus));
    }
}
