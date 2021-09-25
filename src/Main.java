import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Material material1=new Meat("1A","bacon", LocalDate.parse("2021-09-25"),20000,1);
        Material material2=new Meat("2A","beef", LocalDate.parse("2021-09-27"),25000,1.5);
        Material material3=new Meat("3A","chicken", LocalDate.parse("2021-09-28"),15000,3);
        Material material4=new Meat("4A","Pork", LocalDate.parse("2021-09-29"),40000,2.5);
        Material material5=new Meat("5A","Ribs", LocalDate.parse("2021-09-30"),35000,2);
        Material material6=new CrispyFlour("1B","A",LocalDate.parse("2021-12-01"),8000,2);
        Material material7=new CrispyFlour("1B","A",LocalDate.parse("2022-02-01"),8000,2);
        Material material8=new CrispyFlour("1B","A",LocalDate.parse("2022-03-01"),8000,2);
        Material material9=new CrispyFlour("1B","A",LocalDate.parse("2021-10-01"),8000,2);
        Material material10=new CrispyFlour("1B","A",LocalDate.parse("2021-11-15"),8000,2);
        List<Material> materialList=new ArrayList<>();
        materialList.add(material1);
        materialList.add(material2);
        materialList.add(material3);
        materialList.add(material4);
        materialList.add(material5);
        materialList.add(material6);
        materialList.add(material7);
        materialList.add(material8);
        materialList.add(material9);
        materialList.add(material10);
        MaterialManage materialManage=new MaterialManage();
        materialManage.setMaterialList(materialList);
        materialManage.difference(materialList.get(1));
    }
}
