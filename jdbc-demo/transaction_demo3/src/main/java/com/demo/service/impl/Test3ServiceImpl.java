package com.demo.service.impl;

import com.demo.dao.TestDao;
import com.demo.service.Test3Service;
import com.demo.service.Test4Service;
import com.demo.service.Test5Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by lorne on 2017/6/7.
 */
@Service
public class Test3ServiceImpl  implements Test3Service {


    @Autowired
    private TestDao testDao;

    @Autowired
    private Test4Service test4Service;

    @Autowired
    private Test5Service test5Service;



    @Override
   // @TxTransaction
    public String test() {

        String name = "hello_demo3";

        testDao.save(name);
//
        test4Service.test();

        test5Service.test();

        //int v = 100/0;

        return name;

    }
}
