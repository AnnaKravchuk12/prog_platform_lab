package Lab 4; 
 
import java.text.ParseException; 
import java.util.Scanner; 
 
 
public class Lab4 {     
public static void main(String[] args) throws ParseException {              
FilmLibrary myFilmLibrary;     
Film [] films = {

new Film("Кумейл Нанджіані, Роберт Дауні-молодший, Том Голланд, Емма Томпсон, Рамі Малек, Джессі Баклі",              
"Дулітл", 2020, 106),                          

new Film("Меттью Макконехі, Чарлі Ганнем, Мішель Докері, Джеремі Стронг, Колін Фаррелл ",              
"Джентльмени", 2020, 113),                          

new Film("Джон Сіна, Кіген-Майкл Кі, Джон Леґуізамо, Бріанна Хільдебранд,",                                  
"Ігри з вогнем ", 2019, 96),                          

new Film("Брі Ларсон, Майкл Б. Джордан, Джеймі Фокс, Рейф Сполл, Тім Блейк Нельсон", 
"Судити по совісті", 2019, 138),                          

new Film("Карен Ґіллан, Двейн Джонсон, Марін Хінкль, Медісон Айземан, Джек Блeк, Ешлі Скотт", 
"Джуманджі: Наступний рівень", 2019,123),                          

new Film(" Емма Томпсон, Борис Ісакович, Емілія Кларк",                                  
"Щасливого Різдва", 2019, 103),                          

new Film("Емі Шумер, Мішель Вільямс, Том Хоппер, Адріан Мартінес, Емілі Ратажковскі, Бізі Філіпс, Лорен Хаттон.",             
"Красуня на всю голову", 2018, 110),                          

new Film("Двейн Джонсон, Зак Ефрон, Пріянка Чопра, Олександра Даддаріо, Келлі Рорбах",                                  
"Рятувальники Малібу", 2017, 116),                                                  

new Film("Джейсон Судейкіс, Каріс ван Гаутен, Джеремі Айронс",             
"Сила волі / Гонка ", 2016, 134)};         

myFilmLibrary = new FilmLibrary(films);           
System.out.println("Список фільмів у фільмотеці:");     
myFilmLibrary.printList();          
System.out.println("Список фільмів виданих у користування:");     
myFilmLibrary.printList(false);          
System.out.println("Список фільмів що залишилися у книгосховищі:");     
myFilmLibrary.printList(true);          
Scanner input = new Scanner(System.in);     
System.out.println("Пошук фільму. Введіть прізвище актора");     
String actor = input.next();      
input.close();          
String actorFilms = myFilmLibrary.findFilmByActor(actor);     
System.out.println(actorFilms);         
} 
} 
