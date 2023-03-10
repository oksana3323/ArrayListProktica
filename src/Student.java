import java.time.Period;
import java.util.ArrayList;

public class Student implements StudentMethod {
    private String name;
    private String lastName;

    private Period date;
    private Gender gender;
    private double money;

    public Student(String name, String lastName, Period date, Gender gender, double money) {
        this.name = name;
        this.lastName = lastName;
        this.date = date;
        this.gender = gender;
        this.money = money;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Period getDate(ArrayList<Student> students) {
        return date;
    }

    public void setDate(Period date) {
        this.date = date;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;


    }


    @Override
    public void nameAnameB(ArrayList<Student> students) {
        for (Student student1 : students) {
            if (student1.getName().startsWith("A") || student1.getName().startsWith("E")) {
                System.out.println(student1);
            }
        }
    }


    @Override
    public int ageMoney(ArrayList<Student> students) {
        for (Student student2 : students) {
            if (student2.getDate(students).getYears() >= 15 & student2.money > 2000) {
                if (student2.getGender().equals(Gender.MAN))
                    System.out.println(student2);
            }

        }
        return 0;
    }

    @Override
    public void isItAloOfMoney(ArrayList<Student> students) {
        double max = students.get(0).getMoney();
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getMoney() > max) {
                max = students.get(i).getMoney();
            }
        }

        for (Student student : students) {
            if (student.getMoney() == max) {
                System.out.println(student);
            }
        }
    }

    @Override
    public String aGirlWithALotOfMoney(ArrayList<Student> students) {
        double max = students.get(0).getMoney();
        for (int i = 1; i < students.size(); i++) {
            if (students.get(i).getMoney() > max) {
                max = students.get(i).getMoney();
            }
            for (Student s : students) {
                if (s.getGender().equals(Gender.WOMAN)) {
                    return s.toString();
                }
            }

        }
        return null;
    }

    @Override
    public String Name(ArrayList<Student> students) {
        for (Student student4 : students) {
            System.out.println(student4.getName());

        }


        return null;
    }

    @Override
    public void studentMoneyPlus(ArrayList<Student> students) {
        for (Student money : students) {
            System.out.println(money.getMoney() + 1000);

        }


    }

    @Override
    public String theFirstStudent(ArrayList<Student> students) {
        return students.get(0).toString();
    }


    @Override
    public void students(ArrayList<Student> students) {
        for (Student student:students) {
            System.out.println(student);

        }
    }

    @Override
    public String girlsAndBoys(ArrayList<Student> students) {
        for (Student student5 : students) {
            if (student5.getGender() == Gender.WOMAN)
                System.out.println(student5.getName());
            if (student5.getGender() == Gender.MAN) {
                System.out.println(student5.getName());
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Student = " +
                "| name='" + name +
                "| lastName='" + lastName +
                "| date=" + date +
                "|  gender=" + gender +
                "| money=" + money;
    }
}

