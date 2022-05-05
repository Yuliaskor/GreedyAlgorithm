package model;

import model.moduleType.ModuleTypeInterface;

public class Module {
    private final ModuleTypeInterface moduleType;
    private final Container[] containers;

    public Module(ModuleTypeInterface moduleType, int n) {
        this.moduleType = moduleType;
        this.containers = new Container[n];
    }

    public ModuleTypeInterface getModuleType() {
        return moduleType;
    }

    public Container[] getContainers() {
        return containers;
    }

    public Float countTravelTimeToModule(Module module) {
        if(module.moduleType.getTravelTime() == null){
            return -1f;
        }
        if (moduleType.getTravelTime() > module.getModuleType().getTravelTime()) {
            return module.getModuleType().getTravelTime();
        }
        return moduleType.getTravelTime();
    }

    public int findHighestProduct(Product product){
        for(int n=0; n< containers.length; n++){
            if(product.equals(containers[n].getProduct())){
                return n;
            }
        }
        return -1;
    }
}
