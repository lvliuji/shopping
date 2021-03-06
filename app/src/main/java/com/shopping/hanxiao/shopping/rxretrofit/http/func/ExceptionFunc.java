package com.shopping.hanxiao.shopping.rxretrofit.http.func;

import android.util.Log;

import com.shopping.hanxiao.shopping.rxretrofit.exception.FactoryException;

import rx.Observable;
import rx.functions.Func1;

/**
 * 异常处理
 */

public class ExceptionFunc implements Func1<Throwable, Observable> {
    @Override
    public Observable call(Throwable throwable) {
        Log.e("Tag","-------->"+throwable.getMessage());
        return Observable.error(FactoryException.analysisExcetpion(throwable));
    }
}
