package org.coologic.cacaocat.research001.case001.domain;

import lombok.Data;

import java.util.List;

@Data
public class ClassFile {
    /**
     * 魔数 u4
     */
    int magic;

    /**
     * 副版本号 u2
     */
    int minorVersion;

    /**
     * 主版本号 u2
     */
    int majorVersion;

    /**
     * 常量池
     */
    List<ConstantPoolInfo> constantPools;

    /**
     * 访问标志
     */
    int accessFlags;

    /**
     * 类索引
     */
    int thisClass;

    /**
     * 父类索引
     */
    int superClass;

    /**
     * 接口索引
     */
    List<Integer> interfaces;

    /**
     * 字段
     */
    List<FieldInfo> fields;

    /**
     * 方法
     */
    List<MethodInfo> methods;

    /**
     * 属性
     */
    List<AttributeInfo> attributes;

    ///**
    // * 常量池数量 u2
    // */
    //int constant_pool_count;
    //
    ///**
    // * 常量池 [constant_pool_count-1]
    // * 注意这里数量是 - 1
    // */
    //ConstantPoolInfo[] constant_pool;

    ///**
    // * 接口索引数量
    // */
    //int interfaces_count;
    //
    ///**
    // * 接口索引 [interfaces_count]
    // */
    //int[] interfaces;

    ///**
    // * 字段数量
    // */
    //int fields_count;
    //
    ///**
    // * 字段  [fields_count]
    // */
    //FieldInfo[] fields;

    ///**
    // * 方法数量
    // */
    //int methods_count;
    //
    ///**
    // * 方法[methods_count]
    // */
    //MethodInfo[] methods;

    ///**
    // * 属性数量
    // */
    //int attributes_count;
    //
    ///**
    // * 属性
    // */
    //AttributeInfo[] attributes;
}