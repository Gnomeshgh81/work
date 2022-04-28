package com.example.demo.Mapper;
import com.example.demo.Entity.diancan;
import com.example.demo.Entity.main;
import com.example.demo.Entity.menu;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface orderMapper {
    void insertIntomain(main m);
    List<main> getId();
    diancan getList(Integer id);
    void createDiancan(diancan d);
    void delete(Integer id);
    List<menu> getMenu();
    menu getMenuById(Integer id);

    int getCount(int t);

    void changeCount(Integer t, Integer count);
}
