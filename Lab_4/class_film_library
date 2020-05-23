package Lab_4; 
 
public class FilmLibrary {          
private Film[] films;           
public FilmLibrary(Film[] list){         
//відкритий конструктор приймає посилання на масив з даними       
films = list;     }     
/* використані нижче цикли з ітератором       
* for (Film film : films)      
* можна записувати і в традиційній формі      
*  for (int i = 0; i<books.length; i++)      
* але подана нижче форма надає коду більшу гнучкість,      
* оскільки придатна для роботи з колекціями      
* такими, як, наприклад, множини і поданий код допускає      
* в перспективі заміну масиву films на множину films      
* без жодних затрат на його модифікацію        
*/         
public void printList(){         
//друк всіх елементів масиву      
for (Film film : films) {             
System.out.println(film);         
}     
}                  
public void printList(boolean isAvailable){         
//друк наявних/виданих фільмів        
for (Film film : films) {             
if (film.isAvailable() == isAvailable)System.out.println(film);         
}     
}                  
public String findFolmByActors (String actors){         
//пошук елементів, що містять у полі actors заданий фрагмент             
String result="";         
for (Film film : films) {             
if (film.getActors().contains(actors))             
result += film.toString()+ "\n"+                     
(film.isAvailable()?" в наявності":" видана") + "\n";          
}           
return  result.isEmpty()?"нічого не знайдено":result;     
} 
}
