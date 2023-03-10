import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        LocalDate date1 = LocalDate.of(2003, 3, 13);
        LocalDate date2 = LocalDate.of(2003, 3, 13);
        LocalDate date3 = LocalDate.of(2003, 3, 13);
        LocalDate date4 = LocalDate.of(2003, 3, 13);
        LocalDate date5 = LocalDate.of(2003, 3, 13);
        LocalDate date6 = LocalDate.of(2003, 3, 13);
        LocalDate date7 = LocalDate.of(2003, 3, 13);
        LocalDate date8 = LocalDate.of(2003, 3, 13);
        LocalDate date9 = LocalDate.of(2003, 3, 13);
        LocalDate date10 = LocalDate.of(2003, 3, 13);

        Period period1 = Period.ofYears(Period.between(date1, LocalDate.now()).getYears());
        Period period2 = Period.ofYears(Period.between(date2, LocalDate.now()).getYears());
        Period period3 = Period.ofYears(Period.between(date3, LocalDate.now()).getYears());
        Period period4 = Period.ofYears(Period.between(date4, LocalDate.now()).getYears());
        Period period5 = Period.ofYears(Period.between(date5, LocalDate.now()).getYears());
        Period period6 = Period.ofYears(Period.between(date6, LocalDate.now()).getYears());
        Period period7 = Period.ofYears(Period.between(date7, LocalDate.now()).getYears());
        Period period8 = Period.ofYears(Period.between(date8, LocalDate.now()).getYears());
        Period period9 = Period.ofYears(Period.between(date9, LocalDate.now()).getYears());
        Period period10 = Period.ofYears(Period.between(date10, LocalDate.now()).getYears());


        ArrayList<Student> studenta = new ArrayList<>(Arrays.asList(new Student("Aizat", "Duisheeva", period1, Gender.WOMAN, 15000), new Student("Ernazar", "Asanbekov", period4, Gender.MAN, 10000), new Student("Sanjar", "Abdumomunov", period5, Gender.MAN, 8000), new Student("Eldan", "Turgunbaev", period6, Gender.MAN, 2000), new Student("Temirlan", "Jusukulov", period7, Gender.MAN, 4000), new Student("Kairat", "Nuridinov", period8, Gender.MAN, 1500), new Student("Tursunai", "Arzukulova", period9, Gender.WOMAN, 1300), new Student("Davran", "Doldoshbaev", period10, Gender.MAN, 2400)));
        System.out.println("1111111~~~~~~~~~~~~NAME````AAizat```````Eldan`````NAME``Ernaz``~~~~~~~~~~1111111"+"\n");
        Student student = new Student();
        student.nameAnameB(studenta);


        System.out.println("222222---------------THE````MOST````RICH------------------222222"+"\n");
        student.isItAloOfMoney(studenta);
       // System.out.println(studenta);


        System.out.println("333333333-----------------------MAN------------------333333333"+"\n");
        student.ageMoney(studenta);
       // System.out.println(studenta);

        System.out.println("4444444444-----------------WOMAN-----------------------444444444"+"\n");
        System.out.println(student.aGirlWithALotOfMoney(studenta));

        System.out.println("5555555555-------------------STUDENTS----------------55555555555"+"\n");
           student.Name(studenta);
        System.out.println("666666666666------------------------MONEY---------------666666666666"+"\n");
     student.studentMoneyPlus(studenta);

        System.out.println("777777777777++++++++++++THEFIRSTSTUDENT+++++++++++++++++77777777777777"+"\n");

        System.out.println(student.theFirstStudent(studenta));

        System.out.println("----------------------------");
             student.girlsAndBoys(studenta);
        System.out.println("--------------------------------");
      student.students(studenta);

    }
}