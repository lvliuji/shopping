package com.shopping.hanxiao.shopping.rxretrofit.http.func;


import com.shopping.hanxiao.shopping.rxretrofit.exception.HttpTimeException;

import rx.functions.Func1;

/**
 * 服务器返回数据判断
 */

public class ResulteFunc implements Func1<Object,Object> {
    @Override
    public Object call(Object o) {
        if (o == null || "".equals(o.toString())) {
            throw new HttpTimeException("数据错误");
        }
        return o;
    }
}
