package cn.hulingfeng.config;

import org.mybatis.generator.api.PluginAdapter;

import java.util.List;

/**
 * @author hulingfeng
 * @title: MysqlPaginationPlugin
 * @projectName mybatis-generator-demo
 * @description: TODO
 * @date 2021/7/22 11:35
 */
public class MysqlPaginationPlugin extends PluginAdapter {
    @Override
    public boolean validate(List<String> list) {
        return false;
    }
}
