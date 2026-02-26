package fr.epsi_26.tp02messageservice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class ClassA {
    private final ClassB classB;

    // dépend de ClassB
    public ClassA(@Lazy ClassB classB) {
        this.classB = classB;
    }

    /*//////////////////////////*/

    /*private ClassB classB;

    // Constructeur vide
    public ClassA() {}

    // Setter
    @Autowired
    public void setClassB(ClassB classB) {
        this.classB = classB;
    }*/
}
