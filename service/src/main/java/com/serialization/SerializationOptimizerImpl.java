package com.serialization;

import com.dto.GoodsDto;
import com.dto.UserDto;
import org.apache.dubbo.common.serialize.support.SerializationOptimizer;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/6/26
 * @description 需要序列化的类实现
 */
public class SerializationOptimizerImpl implements SerializationOptimizer {
    @Override
    public Collection<Class> getSerializableClasses() {
        List<Class> classes = new LinkedList<Class>();
        classes.add(UserDto.class);
        classes.add(GoodsDto.class);
        return classes;
    }
}
