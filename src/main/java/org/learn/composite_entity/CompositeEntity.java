package org.learn.composite_entity;

public class CompositeEntity {
    CoarseGrainedObjec cgo = new CoarseGrainedObjec();

    public void setData(String data1, String data2) {
        cgo.setData(data1, data2);
    }

    public String[] getData() {
        return cgo.getData();
    }
}
