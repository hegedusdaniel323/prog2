public class Person {
    static int id = 0;
    String nev;
    Integer kor;
    Double testsuly;
    Integer magassag;

    public Person() {id++;}

    public static void setId(int id) {
        Person.id = id;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public void setKor(Integer kor) {
        this.kor = kor;
    }

    public void setTestsuly(Double testsuly) {
        this.testsuly = testsuly;
    }

    public void setMagassag(Integer magassag) {
        this.magassag = magassag;
    }

    public static int getId() {
        return id;
    }

    public String getNev() {
        return nev;
    }

    public Integer getKor() {
        return kor;
    }

    public Double getTestsuly() {
        return testsuly;
    }

    public Integer getMagassag() {
        return magassag;
    }

    public Person(String nev, Integer kor, Double testsuly, Integer magassag) {
        this.nev = nev;
        this.kor = kor;
        this.testsuly = testsuly;
        this.magassag = magassag;
    }

    @Override
    public String toString() {
        return ("Név:"+this.getNev()+
                " Kor: "+ this.getKor() +
                " Súly: "+ this.getTestsuly() +
                " Magasság : " + this.getMagassag() + "\n");
    }

}
