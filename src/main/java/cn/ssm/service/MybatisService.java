package cn.ssm.service;

import cn.ssm.dao.MybatisDao;
import cn.ssm.entity.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MybatisService {
    @Autowired
    private MybatisDao mybatisDao;

    public void add(Emp emp){
        mybatisDao.add(emp);
    }
    public void delete(Emp emp){
        mybatisDao.delete(emp);
    }
    public void update(Emp emp){
        mybatisDao.update(emp);
    }
    public List<Emp> findAll(){
        return mybatisDao.findAll();
    }
    public Emp findById(int id){ return mybatisDao.findById(id);};
    public Emp findByEmp(Emp emp){ return mybatisDao.findByEmp(emp);};

}
