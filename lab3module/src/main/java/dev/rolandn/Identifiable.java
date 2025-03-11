package dev.rolandn;

public interface Identifiable<ID> {
    void setId(ID id);
    ID getId();
}
