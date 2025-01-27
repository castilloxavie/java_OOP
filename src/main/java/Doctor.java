public class Doctor {
    static int id = 0;
    String name;
    String speciality;

    //comportamientos
    Doctor(){
        System.out.println("construyendo la instancia de Doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("el nombre del doctor es: " + name);
    }

    public void showName(){
        System.out.println(name);
    }

    public  void  showId(){
        System.out.println("Id del doctor es: "+id);
    }
}
