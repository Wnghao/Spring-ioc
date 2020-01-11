package dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Scope("prototype")
public class IndexDaoImp implements IndexDao {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public void test() {
        System.out.println("dao1");
    }
}
