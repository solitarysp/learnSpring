package com.lethanh98.bean.Lifecycle;

/**
 * author lethanh9398 <p>
 * create Date 30-08-2019 16:10  <p>
 * document : <p>
 * <p>- vi :
 * <p>- en :
 */
public class ObjectBean {
    public void init() {
        System.out.println("init object");
    }

    public void cleanup() {
        System.out.println("xoa object");
    }
}
