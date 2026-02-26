package fr.epsi_26.tp02messageservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ClassB {
    private final ClassA classA;

    // dépend de ClassA
    public ClassB(ClassA classA) {
        this.classA = classA;
    }

    /*/////////////////////*/

    /*private ClassA classA;

    public ClassB() {}

    @Autowired
    public void setClassA(ClassA classA) {
        this.classA = classA;
    }*/
}