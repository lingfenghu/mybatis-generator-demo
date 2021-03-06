package cn.hulingfeng.config;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.GeneratedXmlFile;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.PluginAdapter;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.Attribute;
import org.mybatis.generator.api.dom.xml.TextElement;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.codegen.AbstractJavaGenerator;

import java.util.List;

/**
 * @author hulingfeng
 * @title: MysqlPaginationPlugin
 * @projectName mybatis-generator-demo
 * @description: TODO
 * @date 2021/7/22 11:35
 */
public class MysqlPaginationPlugin extends PluginAdapter {

    public MysqlPaginationPlugin() {}

    @Override
    public boolean modelExampleClassGenerated(TopLevelClass topLevelClass,
                                              IntrospectedTable introspectedTable) {
        this.addLimit(topLevelClass, introspectedTable, "limitStart");
        this.addLimit(topLevelClass, introspectedTable, "limitSize");
        return super.modelExampleClassGenerated(topLevelClass, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByExampleWithoutBLOBsElementGenerated(XmlElement element,
                                                                     IntrospectedTable introspectedTable) {
        XmlElement isNotNullElement = new XmlElement("if");
        isNotNullElement
                .addAttribute(new Attribute("test", "limitStart != null and limitSize >= 0"));
        isNotNullElement.addElement(new TextElement("limit #{limitStart} , #{limitSize}"));
        element.addElement(isNotNullElement);
        return super.sqlMapSelectByExampleWithoutBLOBsElementGenerated(element, introspectedTable);
    }

    @Override
    public boolean sqlMapSelectByExampleWithBLOBsElementGenerated(XmlElement element,
                                                                  IntrospectedTable introspectedTable) {
        XmlElement isNotNullElement = new XmlElement("if");
        isNotNullElement
                .addAttribute(new Attribute("test", "limitStart != null and limitSize >= 0"));
        isNotNullElement.addElement(new TextElement("limit #{limitStart} , #{limitSize}"));
        element.addElement(isNotNullElement);
        return super.sqlMapSelectByExampleWithBLOBsElementGenerated(element, introspectedTable);
    }

    private void addLimit(TopLevelClass topLevelClass, IntrospectedTable introspectedTable,
                          String name) {
        CommentGenerator commentGenerator = this.context.getCommentGenerator();
        Field field = new Field(name,PrimitiveTypeWrapper.getIntegerInstance());
        field.setVisibility(JavaVisibility.PROTECTED);
        commentGenerator.addFieldComment(field, introspectedTable);
        topLevelClass.addField(field);
        char c = name.charAt(0);
        String camel = Character.toUpperCase(c) + name.substring(1);
        Method method = new Method("set" + camel);
        method.setVisibility(JavaVisibility.PUBLIC);
        method.addParameter(new Parameter(PrimitiveTypeWrapper.getIntegerInstance(), name));
        StringBuilder sb = new StringBuilder();
        sb.append("this.");
        sb.append(name);
        sb.append(" = ");
        sb.append(name);
        sb.append(";");
        method.addBodyLine(sb.toString());
        commentGenerator.addGeneralMethodComment(method, introspectedTable);
        topLevelClass.addMethod(method);
        Method getterMethod = AbstractJavaGenerator.getGetter(field);
        commentGenerator.addGeneralMethodComment(getterMethod, introspectedTable);
        topLevelClass.addMethod(getterMethod);
    }

    @Override
    public boolean validate(List<String> warnings) {
        return true;
    }

    /**
     * ??????mapper.xml,?????????????????????????????????
     * */
    @Override
    public boolean sqlMapGenerated(GeneratedXmlFile sqlMap, IntrospectedTable introspectedTable) {
        sqlMap.setMergeable(false);
        return super.sqlMapGenerated(sqlMap, introspectedTable);
    }
}
