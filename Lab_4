package Lab_4;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Film { 

/*
Нижче описано поля класу, що використовуватимуться для зберігання
даних кожного окремого екземпляра
Дотримуючись інкапсуляції всі поля робимо закритими (private)
їх читання чи зміни реалізуємо спеціальні методи get-ери і set-ери
В зміні назва фільму, рік випуску, перелік акторів у головних ролях, немає сенсу, оскільки
в такому випадку слід створювати новий екземпляр класу "книга".
Поля у яких немає методу для зміни значення прийнято помічати
як final
*/
private final String title;// назва фільму
private final String actors;// актор або декілька акторів
private final int year;// рік випуску
private final int countOfTime;//час
private boolean available;//наявність фільму в фільмотеці
//фільм може бути виданий користувачеві - false
//або зберігатися у фонді - true
private Date issueDate;
//дата видачі, має сенс лише при available == false
//якщо книга є у фонді issueDate = Null

// методи-геттери для усіх полів

public String getTitle(){
    return title;
}
public String getAuthor(){
    return actors;
}
    public int getYear(){
    return year;
}
    public int getCountOfTime(){
    return countOfTime;
}
    public boolean isAvailable(){
    return available;
}
    public String getIssueDate() throws ParseException{
    if(issueDate!=null){
        SimpleDateFormat dateFormat = new  SimpleDateFormat("dd.MM.yy");
        return dateFormat.format(issueDate);
    }
    else return "";
}
// методи-сеттери змінюють лише наявність фільму у фонді
// та дату видачі користувачеві, причому зміна повинна
// обидва поля одночасно
public void setIssue() {
// видача фільму зареєстрована поточною датою
  if(available){
        available = false;
        issueDate = new  Date();
  }
}
public final void setIssue(String date) throws ParseException{
    //видача фільму за вказаною датою
        if(available){
            available = false;
            issueDate = new  SimpleDateFormat("dd.MM.yy").parse(date);
        }
}
public void setReturn() {
    if(!available) available = false;
    issueDate = null;
}
//Конструктори з використанням перегрузки
public Film(String actors, String title, int year, int n){
    //основний конструктор
/this.actors = actors;
this.title = title;
this.year = year;
countOfTime = n;
available = true;
issueDate = null;
}
public Film(String actors, String title, int year, int n, String date) throws ParseException{
    //конструктор із вказаною датою видачі фільму користувачеві
// суперечить логіці предметної області, але дозволяє спростити
// тестування можливостей класу (див. головний клас проекту)
this(actors, title, year, n);
this.setIssue(date);
this.available = false;
}
public Film(String actors, String title, int n){
    //конструктор для фільму, що вийшов на екран в поточному році
// перегрузка спрощує реєстрацію фільму
this.actors = actors;
this.title = title;
countOfTime = n;
available = true;
issueDate = null;
Date now = new Date();
SimpleDateFormat  nowFormat = new SimpleDateFormat("yyyy");
year = Integer.parseInt(nowFormat.format(now));
}
@Override
public String toString(){
    //первизначений метод toString дозволяє зручно виводити інформацію,
// яку зберігає екземпляр класу, на консоль
return  actors + " " + title + " - " + year + ", " + countOfTime + " c.";
}
