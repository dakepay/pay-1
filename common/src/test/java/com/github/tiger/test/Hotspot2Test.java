package com.github.tiger.test;

import com.github.tiger.pay.common.context.PlainClassLoader;
import com.github.tiger.pay.common.vfs.Foo;
import com.github.tiger.pay.common.vfs.FooImpl;
import org.apache.commons.io.IOUtils;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public class Hotspot2Test {

    public static void main(String[] args) throws IOException,
            ClassNotFoundException, IllegalAccessException, InstantiationException,
            NoSuchMethodException, InvocationTargetException {

        Foo foo = new FooImpl();
        foo.sayHello();

        PlainClassLoader cc = new PlainClassLoader();

        String name = FooImpl.class.getName();
        String file = "F:\\vfs\\FooImpl.class";
        byte[] data = IOUtils.toByteArray(new FileInputStream(file));
//        Class<?> cls = cc.defineClass(name, data);
//        Foo foo2 = (Foo) cls.newInstance();
//        foo2.sayHello();
    }

}
