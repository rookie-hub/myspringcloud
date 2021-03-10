package com.cloud.microservicecloudapi.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

@AllArgsConstructor //全参构造器
@NoArgsConstructor // 无参构造器
@Data //set/get方法
@Accessors(chain = true) //chain为一个布尔值，如果为true生成的set方法返回this,即返回当前对象,支持链式写法
//链式写法: Dept dept = new Dept(); dept.setDeptno(2L).setDname("zs").setDb_source("DB01")
public class Dept implements Serializable {
    @TableId(type = IdType.AUTO)
    private Long 	deptno; // 主键
    private String 	dname; // 部门名称
    private String 	dbsource;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
}
