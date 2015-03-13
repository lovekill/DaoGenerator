package com.engine.dao;

import de.greenrobot.daogenerator.DaoGenerator;
import de.greenrobot.daogenerator.Entity;
import de.greenrobot.daogenerator.Schema;

/**
 * Created by engine on 15/3/12.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        Schema schema = new Schema(1, "com.engine.dzapp.dao");
        addEntity(schema);

//        new DaoGenerator().generateAll(schema, "D:\\github\\greenDAO\\DaoExample\\src-gen");
//        new DaoGenerator().generateAll(schema, "..\\mnsfz\\src\\main\\java");
        new DaoGenerator().generateAll(schema, "../Dzapp/app/src/main/java");
    }

    private static void addEntity(Schema schema) {
        Entity entity = schema.addEntity("UserTable");
        entity.addStringProperty("userName").primaryKey();
        entity.addStringProperty("password") ;
        entity.addLongProperty("time") ;

    }


}
