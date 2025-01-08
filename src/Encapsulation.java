public class Encapsulation
{
    private String name;
    private int id;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


class Bean
{
    public static void main(String[] args) {

        Encapsulation encapsulation =new Encapsulation();
        encapsulation.setId(237);
        encapsulation.setName("Chandu");
        System.out.println(encapsulation.getId()+","+ encapsulation.getName());

        Encapsulation e1=new Encapsulation();
        e1.setName("Jenny");
        e1.setId(239);
        System.out.println(e1.getId()+","+e1.getName());
    }
}