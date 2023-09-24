
public class Main {
    public static void main(String[] args)
    {
        Human[] HumanArray = new Human[9];
        HumanArray[0] = new Kid();
        HumanArray[1] = new Kid("Жаркое Виктор Игоревич");
        HumanArray[2] = new Kid("Василенко Геннадий Андреевич","Мужской",6,3);
        HumanArray[3] = new teenager("Фарфорова Екатерина Юрьевна","Женский",15,61,"Хорошая");
        HumanArray[4] = new teenager("Николаева Ева Павловна");
        HumanArray[5] = new teenager();
        HumanArray[6] = new Parent("Золо Иван Артурович");
        HumanArray[7] = new Parent();
        HumanArray[8] = new Parent("Мазур Андрей Андреевич","Мужской",40,2,"Газпром");
        WriterInfo.ShowInfo(HumanArray);
    }
    }


class Human
{
    protected String FIO;
    protected String Gender;
    protected int Age;
    public Human()
    {
        FIO = "NONE";
        Gender = "NONE";
        Age= 0;
    }
    public Human(String fio,String gender, int age)
    {
        FIO = fio;
        Gender = gender;
        Age= age;
    }
    public Human(String fio)
    {
        FIO = fio;
        Gender = "NONE";
        Age = 0;
    }
    public void Name()
    {
        System.out.println("ФИО:"+GetFIO());
        System.out.println("Пол:"+GetGender());
        System.out.println("Возраст:"+GetAge());
    }
    public String GetFIO()
    {
        return FIO;
    }
    public String GetGender()
    {
        return Gender;
    }
    public int GetAge()
    {
        return Age;
    }
}

class Kid extends Human
{
   protected int kindergartenNum;
    public Kid()
    {
        super();
        kindergartenNum = 0;
    }
    public Kid(String fio,String gender, int age,int kindergarten )
    {
        super(fio,gender,age);
        kindergartenNum = kindergarten;
    }
    public Kid(String fio)
    {
        super(fio);
        kindergartenNum = 0;
    }
    int GetKindergarten()
    {
        return kindergartenNum;
    }
    public void Name()
    {
        System.out.println("Класс 'Ребёнок'");
       super.Name();
       System.out.println("Номер детского сада:"+GetKindergarten());
    }
}

class teenager extends Human
{
    protected int schoolNumber;
    protected String academicPerformance;
    public teenager()
    {
        super();
        schoolNumber = 0;
        academicPerformance = "None";
    }
    public teenager(String fio,String gender, int age,int schoolnumber,String academicperformance )
    {
        super(fio,gender,age);
        schoolNumber = schoolnumber;
        academicPerformance = academicperformance;
    }
    public teenager(String fio)
    {
        super(fio);
        schoolNumber = 0;
        academicPerformance = "None";
    }
    int GetSchoolNumber()
    {
        return schoolNumber;
    }
    String GetAcademicPerformance()
    {
        return academicPerformance;
    }
    public void Name()
    {
        System.out.println("Класс 'Подросток'");
        super.Name();
        System.out.println("Номер школы:"+GetSchoolNumber());
        System.out.println("Успеваемость:"+GetAcademicPerformance());
    }
}

class Parent extends Human
{
    protected int KidNum;
    protected String WorkPlace;
    public Parent()
    {
        super();
        KidNum = 0;
        WorkPlace = "None";
    }
    public Parent(String fio,String gender, int age,int Kidnum,String Workplace )
    {
        super(fio,gender,age);
        KidNum = Kidnum;
        WorkPlace = Workplace;
    }
    public Parent(String fio)
    {
        super(fio);
        KidNum = 0;
        WorkPlace = "None";
    }
    int GetKidNum()
    {
        return KidNum;
    }
    String GetWorkPlace()
    {
        return WorkPlace;
    }
    public void Name()
    {
        System.out.println("Класс 'Родитель'");
        super.Name();
        System.out.println("Количество детей:"+GetKidNum());
        System.out.println("Место работы:"+GetWorkPlace());
    }
}
class WriterInfo
{
    public static void ShowInfo(Human[] HumanArray)
    {
        for (Human human : HumanArray) {
            human.Name();
            System.out.println("-----------------------------------------------------------------");
        }
    }
}