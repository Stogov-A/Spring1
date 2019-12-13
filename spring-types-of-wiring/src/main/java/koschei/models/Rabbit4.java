package koschei.models;

import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {

    Duck5 duck5;

    Rabbit4(Duck5 duck5) {
        this.duck5 = duck5;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + duck5.toString();
    }
}
