import static ui.UiMenu.*;

public class Main {
    public  static  void  main(String[] args){
        Doctor myDoctor = new Doctor();
        myDoctor.name = "xavier castillo";
        myDoctor.showName();
        myDoctor.showId();


        Doctor myDoctor2 = new Doctor();
        myDoctor2.showId();

        showMenu();


    }


}

