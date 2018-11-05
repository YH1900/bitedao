package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.ShiWuTestDao;

@Component
@Transactional
public class ShiWuTest {
    @Autowired
    private ShiWuTestDao swtd;

    public void accountMoney(Integer money, Integer id1, Integer id2) {
        swtd.lessMoney(money, id1);
        swtd.moreMoney(money, id2);
    }
}
