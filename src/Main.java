public class Main {
    public static void main(String[] args){
    // задача 1
        String firstName = " Ivanov";
        String middleName = " Ivan";
        String lastName =" Ivanovich";
        String fullName = firstName + middleName + lastName;
        System.out.println("ФИО сотрудника —"+ fullName);
    // задача 2
        String s1 = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + s1);
    // задача 3
        String fullName1 = " Иванов Семён Семёнович";
        String s2 = fullName1.replace('ё', 'е');
        System.out.println("Данные ФИО сотрудника —" + s2);


    }
}