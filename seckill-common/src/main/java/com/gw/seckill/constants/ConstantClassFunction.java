package com.gw.seckill.constants;

public class ConstantClassFunction {
    //加密的哈希次数
    private static final Integer HASH_ITERATIONS = 2;
    //加密算法
    private static final String ALGORITHM_NAME = "md5";
    //游客权限
    private static final String VISITOR = "2";

    public static Integer getHASH_ITERATIONS(){
        return HASH_ITERATIONS;
    }
    public static String getALGORITHM_NAME(){
        return ALGORITHM_NAME;
    }
    public static String getVISITOR(){
        return VISITOR;
    }
}
