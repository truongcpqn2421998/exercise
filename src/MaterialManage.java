import java.util.List;

public class MaterialManage {
    private List<Material> materialList;
    public MaterialManage(){

    }

    public List<Material> getMaterialList() {
        return materialList;
    }

    public void setMaterialList(List<Material> materialList) {
        this.materialList = materialList;
    }
    public void addMaterial(Material material){
        materialList.add(material);
    }
    public void moveMaterial(Material material){
        materialList.remove(material);
    }

    public void difference(Material material){
        System.out.println("the actual price of "+material.getName()+ " is:"+material.getAmount());
        System.out.println("The price after discount is:"+material.getRealMoney());
    }
}
