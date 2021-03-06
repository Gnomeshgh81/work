package com.example.demo.Server;

import com.example.demo.Entity.dd;
import com.example.demo.Entity.diancan;
import com.example.demo.Entity.main;
import com.example.demo.Entity.menu;
import com.example.demo.Mapper.orderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class orderServer {
    @Autowired()
    orderMapper orderMapper;

    //@Resource
    public int order(main m) {
        orderMapper.insertIntomain(m);
        return m.getId();
    }

    public int getId() {
        List<main> id = orderMapper.getId();
        System.out.println(id);
        return id.size();
    }

    public diancan getList(int t) {
        return orderMapper.getList(t);
    }

    /**
     * 获取点餐列表
     * @param t
     * @return
     */
    public List<dd> getOrderList(int t) {
        diancan list = orderMapper.getList(t);
        List<dd> re = new ArrayList<>();


        if (list.getA() != 0) re.add(new dd(getMenuById(1), list.getA()));
        if (list.getB() != 0) re.add(new dd(getMenuById(2), list.getB()));
        if (list.getC() != 0) re.add(new dd(getMenuById(3), list.getC()));
        if (list.getD() != 0) re.add(new dd(getMenuById(4), list.getD()));
        if (list.getE() != 0) re.add(new dd(getMenuById(5), list.getE()));
        if (list.getF() != 0) re.add(new dd(getMenuById(6), list.getF()));
        if (list.getG() != 0) re.add(new dd(getMenuById(7), list.getG()));
        if (list.getH() != 0) re.add(new dd(getMenuById(8), list.getH()));
        if (list.getI() != 0) re.add(new dd(getMenuById(9), list.getI()));
        return re;
    }

    public void createDiancan(int t) {
        diancan d = new diancan(t, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        orderMapper.createDiancan(d);
    }

    public String save(Integer id, Integer num) {
        diancan list = getList(getId());
        orderMapper.delete(list.getId());
        switch (id) {
            case 1: {list.setA(num); break;}
            case 2: {list.setB(num); break;}
            case 3: {list.setC(num); break;}
            case 4: {list.setD(num); break;}
            case 5: {list.setE(num); break;}
            case 6: {list.setF(num); break;}
            case 7: {list.setG(num); break;}
            case 8: {list.setH(num); break;}
            case 9: {list.setI(num); break;}
        }
        orderMapper.createDiancan(list);
        return "Success";
    }

    public List<menu> getMenu() {
        return orderMapper.getMenu();
    }

    public menu getMenuById(Integer id) {
        return orderMapper.getMenuById(id);
    }

    public int getSum() {
        List<menu> menu = getMenu();
        diancan list = getList(getId());
        int sum = 0;
        Iterator<com.example.demo.Entity.menu> iterator = menu.iterator();
        int k = 0;
        while (iterator.hasNext()) {
            menu next = iterator.next();
            switch (k) {
                case 0: {sum += next.getPrice() * list.getA();break;}
                case 1: {sum += next.getPrice() * list.getB();break;}
                case 2: {sum += next.getPrice() * list.getC();break;}
                case 3: {sum += next.getPrice() * list.getD();break;}
                case 4: {sum += next.getPrice() * list.getE();break;}
                case 5: {sum += next.getPrice() * list.getF();break;}
                case 6: {sum += next.getPrice() * list.getG();break;}
                case 7: {sum += next.getPrice() * list.getH();break;}
                case 8: {sum += next.getPrice() * list.getI();break;}
            }
            k++;
        }
        return sum;
    }

    public int getCount() {
        int t = getId();
        return orderMapper.getCount(t);
    }

    public String changeCount(Integer count) {
        int t = getId();
        orderMapper.changeCount(t, count);
        return "Success";
    }
}
