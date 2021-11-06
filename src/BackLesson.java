//public class BackLesson {
//
//
//    public interface Magazines {
//        void fotos();
//    }
//package test;
//    //question 1
//    public class Modelsagency implements Magazines {
//        @Override
//        public void fotos() {
//            System.out.println("the top 10 models of the year");
//
//        }
//
//
//    }
//    המחלקות לשאלה 2:
//            package test;
//    //question 2
//    abstract class Citizen {
//        abstract void documents();
//    }
//package test;
//
//    public class Resident extends Citizen {
//        int b=5;
//        @Override
//        public void  documents() {
//            System.out.println("you need"+this.b+"documents");
//        }
//
//
//
//
//    }
//    המחלקות לשאלות 7+8:
//            package test;
//    //questions 7+8
//    public class Horse {
//
//        int c=10;
//        void bite(){
//
//        }
//    }
//package test;
//    //questions 7+8
//    public class Pony extends Horse {
//
//        void bite(){
//            System.out.println("yammmm");
//
//        }
//
//    }
//
//package test;
//    //question 7+8
//    public class WhitePony extends Pony {
//
//        static String color(){
//            return  "white";
//        }
//
//
//
//
//    }
//
//            package test;
//    //question 1
//    public class AgenciesTest {
//        public static void main(String[] args) {
//
//            Magazines model = new Modelsagency();
//            model.fotos();
//
//            //question2
//            Citizen refugee = new Resident();
//            refugee.documents();
//
//            //question 5
//            System.out.println(Ball.isRound);
//            //Ball.isRound=false;
//            //when i try to change the value i get an error beacause i declered the value on the second time as final.
//
//            //question 7+8
//            WhitePony BabyPony =new WhitePony();
//            BabyPony.bite();
//            System.out.println(WhitePony.color());

       // }
   // }
//3
    //The program won't run for 2 reasons:
    //a-The method in the abstract class appear with curly braces
    //you can't create instance of an abstract class

    //4 i did it on the abstract class above named "Citizen"
    //and it gave a red sign on the class that inherired named "resident"
    //AS it was mentioned in the lesson you can't define the abstract class as final because than
    //it doesn't exist any posibility of inheritance

    //6
    //i think that the only option this function can be executed will be by "main" function
    //so it has to be "public static void main" otherwise like that as a function it doesn't have any purpuse
    //because it doesn't get or return any value and also doesn't execute any command.
    //9
    //the code is very weired and weird from any aspect:
    //a.it has been declared once  at top of the class the name of the class than it shouldn't be declared
    //multiple classes in the same class (private class x,private class y etc...)
//b.even it would be  possible to declare multiple classes ,there is a contradiction because the top class
//is defined as public and the other ones are private
///10
// a.has to be written 'public class main" and not "apple"
//b.because classes apple and dog coming from different packges we have to create an inheritance between them (extends)
//





//}
