public class Main {
    public static void main(String[] args) {

        SimpleStudent vasiliy = new SimpleStudent();
        vasiliy.name = "Vasiliy";
        vasiliy.age = 21;
        vasiliy.department = "Year 3";
        vasiliy.height = 178;

        SimpleDocent alexandrPetrovich = new SimpleDocent();
        alexandrPetrovich.name = "Alexandr Petrovich";
        alexandrPetrovich.age = 38;
        alexandrPetrovich.height = 172;
        alexandrPetrovich.department = "Kafedra OOP";

        vasiliy.sayHi();
        vasiliy.haveAParty();
        vasiliy.describePerson();

        alexandrPetrovich.sayHi();
        alexandrPetrovich.makeStudentsSuffer();
        alexandrPetrovich.describePerson();
    }
}