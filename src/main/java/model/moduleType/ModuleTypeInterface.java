package model.moduleType;

public interface ModuleTypeInterface {
    String getName();
    String getDescription();
    Float getTravelTime();
    Float getRemovalTime(int n);
}
