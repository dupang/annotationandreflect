/*
 * Copyright © 2017 damai.cn All rights reserved. 北京红马传媒文化发展有限公司 版权所有 大麦网 声明: 对未经许可擅自反编译、修改和使用本源码者，本公司保留追究其法律责任的权利.
 */
package com.dupang.annotation;

/**
 * <p>
 * ClassName:com.dupang.annotation.FruitRun
 * </p>
 * <p>
 * 描述:
 * </p>
 * <p>
 * 日期:2017年03月15
 * </p>
 *
 * @author duguanxin
 * @version 1.0
 * @since 1.0
 */
public class FruitRun {
    /**
     * @param args
     */
    public static void main(String[] args) {
        FruitInfoUtil.getFruitInfo(Apple.class);
    }
}
