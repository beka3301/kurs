public class Main {
    public static void main(String[] args) {
        Kurs it=new Kurs("Java",21143214,"Azamat agay",16);
        System.out.println("name: "+it.name+"\n"+"number: "+it.number+"\n"+"name1: "+it.name1+"\n"+"day: "+it.dey);
        System.out.println();
        Student it1=new Student("21.12.98","Bektur","Hanazarov",15);
        System.out.println("born: "+it1.born+"\n"+"name: "+it1.name+"\n"+"surname: "+it1.surname+"\n"+(it1.age>15?it1.age:"ты еще пуся"));
    }
}