package com.example.ll.qiangxian.model;

import okhttp3.Request;
public abstract class RequestCallBack<T>{
   public abstract void onResponse(T response);
   public abstract void onError(Request request, Exception e);
}
