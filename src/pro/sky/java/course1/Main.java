package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        //        Домашнее_задание_1.7_Строки
//        Задание_1
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName + ".";
        System.out.println("ФИО сотрудника — " + fullName);

//        Задание_2
        String fullNameForAccountReport = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameForAccountReport);

//        Задание_3
        firstName = "Семён";
        middleName = "Семёнович";
        lastName = "Иванов";
        fullName = lastName.replace('ё', 'е') + " " + firstName.replace('ё', 'е') + " " + middleName.replace('ё', 'е') + ".";
        fullNameForAccountReport = fullName.toUpperCase();
        System.out.println("ФИО сотрудника — " + fullName);
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameForAccountReport);
    }
}

