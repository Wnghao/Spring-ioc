package dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public abstract  class IndexService {
    @Lookup("indexDaoImp")
    protected abstract  IndexDao createIndexDao() ;
    @Autowired
    private IndexDao indexDao;

    void test() {
        indexDao.setName("aaaa");//这里我们设置了一个名字
        System.out.println("service test："+createIndexDao());
        System.out.println("service test："+indexDao);
        indexDao.test();
    }
    void test1() {
        //但是这里我们不需要设置，如果设置了将会导致程序出错。
        System.out.println("service test1："+createIndexDao());
        System.out.println("service test1："+indexDao);
        indexDao.test();
    }


}
