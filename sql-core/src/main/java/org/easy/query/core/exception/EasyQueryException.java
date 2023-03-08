package org.easy.query.core.exception;

/**
 * 框架执行过程中出现的错误
 * @FileName: JDQCException.java
 * @Description: 文件说明
 * @Date: 2023/2/7 12:36
 * @Created by xuejiaming
 */
public class EasyQueryException extends RuntimeException{
    public EasyQueryException(String msg){
        super(msg);
    }
    public EasyQueryException(Throwable e){
        super(e);
    }

    public EasyQueryException(String msg, Throwable e){
        super(msg,e);
    }

}
