
//Stwórz klasę abstrakcyjną Developer która posiada pola:
//
//String name;
//String company;
//double salary;
//i abstrakcyjną metodę makeCode();
//
//Jakie modyfikatory dostępu należy zastosować dla pól i metody, by były dostępne w klasie dziedziczącej?
//
//Stwórz klasy pochodne od klasy abstrakcyjnej (dziedziczące po niej): 
//BackendDeveloper - z dodatkowym polem "String backendLanguage"
//FrontendDeveloper - z dodatkowym polem "String javaScriptFramework"
//MobileDeveloper - z dodatkowym polem "String mobileOs"
//
//w klasach dziedziczących zaimplementuj metodę "makeCode()", która wypisze na konsolę odpowiednio, np.:
//"Piotr is coding for Ericsson for 0.5 PLN in Java"
//"Adam is coding for SDA for 999.99 in Angular"
//"Ania is coding for Google for 100000.0 in Android"
//
//W metodzie main utwórz obiekty poszczególnych klas. 
//Sprawdź, czy możesz utworzyć obiekt poprzez new Developer().
//Sprawdź, czy możesz użyć referencji do klasy Developer.

package pl.sdacademy.intermediate.basic.Basic5Inheritance;

public class Basic5Inheritance {
    public static void main(String[] args) {
Developer backDeveloper = new BackendDeveloper("Piotr", "Ericsson", 0.5, "Java");
Developer frontendDeveloper = new FrontendDeveloper("Adam", "SDA", 999.99, "Angular");
Developer mobileDeveloper = new MobileDeveloper("Ania", "Google", 100000.00, "Android");

backDeveloper.makeCode();
frontendDeveloper.makeCode();
mobileDeveloper.makeCode();

    }
}
