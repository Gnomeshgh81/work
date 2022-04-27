package com.example.demo.Controller;

import com.example.demo.Entity.dd;
import com.example.demo.Entity.diancan;
import com.example.demo.Entity.main;
import com.example.demo.Entity.menu;
import com.example.demo.Server.orderServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping()
@CrossOrigin
public class orderController {

    @Autowired
    orderServer orderServer;

    /**
     * 点餐，传入的是一个main的结构，其中id为null,返回生成的ID
     * @param m
     * @return
     */
    @RequestMapping("/order")
    public String order(main m) {

        int t = orderServer.order(m);
        orderServer.createDiancan(t);
        return "Success";
    }

    /**
     * 获取当前正在点餐的ID号
     * @return
     */
    @GetMapping("/getId")
    public int getId() {
        return orderServer.getId();
    }

    /**
     * 保存点了那些食物
     * @param id ：食物编号
     * @param num ：点了几个
     * @return
     */
    @PostMapping("/save")
    public String save(Integer id, Integer num) {
        int t = getId();
        return orderServer.save(id, num);
    }

    /**
     * 获取当前点的物品数量
     * @return
     */
    @GetMapping("/getList")
    public diancan getList() {
        int t = getId();
        return orderServer.getList(t);
    }

    @GetMapping("/getOrderList")
    public List<dd> getOrderList() {
        int t = getId();
        return orderServer.getOrderList(t);
    }

    @GetMapping("/getMenu")
    public List<menu> getMenu() {
        return orderServer.getMenu();
    }

    @GetMapping("/getMenuById")
    public menu getMenuById(Integer id) {
        System.out.println(id);
        return orderServer.getMenuById(id);
    }

    @GetMapping("/getSum")
    public int getSum() {
        return orderServer.getSum();
    }

    @GetMapping("/getCount")

    public int getCount() {
        return orderServer.getCount();
    }



}
